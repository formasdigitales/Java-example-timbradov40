package com.formasdigitales.timbrado40_ejemplo.principal;

import com.formasdigitales.timbrado40_ejemplo.procesaxml.ProcesaXML;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.security.GeneralSecurityException;
import java.security.cert.CertificateException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.apache.commons.io.FileUtils;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 *
 * @author Jonathan
 */
public class Principal {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, FileNotFoundException, CertificateException, TransformerException, GeneralSecurityException {
        ProcesaXML procesaXML = new ProcesaXML();
        File xml = new File("src/main/resources/cfdi_v40_generico.xml");
        File ceritifcate = new File("src/main/resources/ESCUELA_KEMPER_URGATE_EKU9003173C9.cer");
        File privateKey = new File("src/main/resources/ESCUELA_KEMPER_URGATE_EKU9003173C9.key");
        procesaXML.readXML(xml,ceritifcate,privateKey);
        
    }
}
