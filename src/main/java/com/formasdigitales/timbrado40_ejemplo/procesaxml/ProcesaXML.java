package com.formasdigitales.timbrado40_ejemplo.procesaxml;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.PKCS8EncodedKeySpec;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.apache.commons.ssl.PKCS8Key;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 *
 * @author Jonathan
 */
public class ProcesaXML {

  String serialnumber = "";
  String certificadoCad = "";
  String cadenaoriginal = "";

  public void readXML(File xml, File certificate, File privateKey) throws ParserConfigurationException, SAXException, IOException, FileNotFoundException, CertificateException, TransformerException, GeneralSecurityException {
    DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder documentBuilder = docBuilderFactory.newDocumentBuilder();
    Document docxml = documentBuilder.parse(xml);
    docxml.getDocumentElement().normalize();

    String fecha = getFecha();
    getCertificado(certificate);
    docxml.getDocumentElement().setAttribute("NoCertificado", serialnumber);
    docxml.getDocumentElement().setAttribute("Certificado", certificadoCad);
    docxml.getDocumentElement().setAttribute("Fecha", fecha);

    File xmltemp = new File(xml.getParent() + "/xmltemp.xml");
    savexmltemp(xmltemp, docxml);

    Source source = new StreamSource(xmltemp);
    generaCadenaOriginal(source);

    docxml = documentBuilder.parse(xmltemp);

    docxml.getDocumentElement().setAttribute("Sello", getSello(privateKey, "12345678a"));
    savexmltemp(xmltemp, docxml);

    Timbradoxml timbradoxml = new Timbradoxml();
    String resultado = timbradoxml.timbradoxml(fileToString(xmltemp));
    if (resultado != null) {
      docxml = documentBuilder.parse(new InputSource(new StringReader(resultado)));
      savexmltemp(xmltemp, docxml);
    }
  }

  private void savexmltemp(File xmltemp, Document docxml) throws TransformerException {
    Result output = new StreamResult(xmltemp);
    Source input = new DOMSource(docxml);
    Transformer transformer = TransformerFactory.newInstance().newTransformer();
    transformer.transform(input, output);

  }

  private String getFecha() {
    DateFormat formato = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    Date date = new Date();
    return formato.format(date);
  }

  private void getCertificado(File certificate) throws FileNotFoundException, CertificateException, IOException {
    InputStream in = new FileInputStream(certificate);
    CertificateFactory cerf = CertificateFactory.getInstance("X.509");

    X509Certificate certificate509 = (X509Certificate) cerf.generateCertificate(in);

    serialnumber = new String(certificate509.getSerialNumber().toByteArray());
    certificadoCad = Base64.getEncoder().encodeToString(certificate509.getEncoded()).replaceAll("\n", "");
  }

  private String getSello(File privaFile, String llave) throws FileNotFoundException, IOException, GeneralSecurityException {
    InputStream in = new FileInputStream(privaFile);
    String firma = "";
    try {
      PKCS8Key pkcs8key = new PKCS8Key(in, llave.toCharArray());
      KeyFactory privateKeyFactory = KeyFactory.getInstance("RSA");
      PKCS8EncodedKeySpec pkcs8Encoded = new PKCS8EncodedKeySpec(pkcs8key.getDecryptedBytes());
      PrivateKey privateKey = privateKeyFactory.generatePrivate(pkcs8Encoded);
      Signature signature = Signature.getInstance("SHA256withRSA");
      signature.initSign(privateKey);
      signature.update(cadenaoriginal.getBytes());
      firma = new String(Base64.getEncoder().encode(signature.sign()));
      in.close();
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
    return firma;
  }

  public void generaCadenaOriginal(Source source) throws FileNotFoundException, TransformerConfigurationException, TransformerException, IOException, ParserConfigurationException, SAXException {
    InputStream infile = Thread.currentThread().getContextClassLoader().getResourceAsStream("cadenaoriginal_4_0.xslt");

    TransformerFactory tfFacXML = TransformerFactory.newInstance();
    StreamSource xslt = new StreamSource(infile);
    Transformer tFacXML = tfFacXML.newTransformer(xslt);
    StringWriter stringWriter = new StringWriter();

    tFacXML.transform(source, new StreamResult(stringWriter));
    cadenaoriginal = stringWriter.toString().replace(System.getProperty("line.separator").toString(), "");
  }

  public String fileToString(File xml) throws TransformerConfigurationException, TransformerException, ParserConfigurationException, SAXException, IOException {
    Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(xml);
    TransformerFactory tf = TransformerFactory.newInstance();
    Transformer transformer = tf.newTransformer();
    StringWriter sw = new StringWriter();
    transformer.transform(new DOMSource(doc), new StreamResult(sw));
    return sw.toString();
  }

}
