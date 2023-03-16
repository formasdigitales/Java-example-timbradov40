
package com.formasdigitales.timbrado40_ejemplo.ws;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.formasdigitales.timbrado40_ejemplo.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TimbrarCFDIV2_QNAME = new QName("http://wservicios/", "TimbrarCFDIV2");
    private final static QName _Signature_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Signature");
    private final static QName _Cancelacion2_QNAME = new QName("http://wservicios/", "Cancelacion_2");
    private final static QName _TimbrarCFDI_QNAME = new QName("http://wservicios/", "TimbrarCFDI");
    private final static QName _Cancelacion1_QNAME = new QName("http://wservicios/", "Cancelacion_1");
    private final static QName _TimbrarCFDIResponse_QNAME = new QName("http://wservicios/", "TimbrarCFDIResponse");
    private final static QName _Cancelacion1Response_QNAME = new QName("http://wservicios/", "Cancelacion_1Response");
    private final static QName _TimbrarZip_QNAME = new QName("http://wservicios/", "TimbrarZip");
    private final static QName _TimbrarCFDIV2Response_QNAME = new QName("http://wservicios/", "TimbrarCFDIV2Response");
    private final static QName _TimbrarZipResponse_QNAME = new QName("http://wservicios/", "TimbrarZipResponse");
    private final static QName _Cancelacion2Response_QNAME = new QName("http://wservicios/", "Cancelacion_2Response");
    private final static QName _Cancelacion1PrivateKey_QNAME = new QName("", "privateKey");
    private final static QName _Cancelacion1PublicKey_QNAME = new QName("", "publicKey");
    private final static QName _KeyValueTypeRSAKeyValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "RSAKeyValue");
    private final static QName _TransformTypeXPath_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "XPath");
    private final static QName _KeyInfoTypeKeyValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "KeyValue");
    private final static QName _KeyInfoTypeKeyName_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "KeyName");
    private final static QName _KeyInfoTypeX509Data_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509Data");
    private final static QName _SignatureMethodTypeHMACOutputLength_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "HMACOutputLength");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.formasdigitales.timbrado40_ejemplo.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Acuse }
     * 
     */
    public Acuse createAcuse() {
        return new Acuse();
    }

    /**
     * Create an instance of {@link Cancelacion }
     * 
     */
    public Cancelacion createCancelacion() {
        return new Cancelacion();
    }

    /**
     * Create an instance of {@link SignatureType }
     * 
     */
    public SignatureType createSignatureType() {
        return new SignatureType();
    }

    /**
     * Create an instance of {@link X509DataType }
     * 
     */
    public X509DataType createX509DataType() {
        return new X509DataType();
    }

    /**
     * Create an instance of {@link KeyValueType }
     * 
     */
    public KeyValueType createKeyValueType() {
        return new KeyValueType();
    }

    /**
     * Create an instance of {@link SignedInfoType }
     * 
     */
    public SignedInfoType createSignedInfoType() {
        return new SignedInfoType();
    }

    /**
     * Create an instance of {@link ArrayOfTransformType }
     * 
     */
    public ArrayOfTransformType createArrayOfTransformType() {
        return new ArrayOfTransformType();
    }

    /**
     * Create an instance of {@link TransformType }
     * 
     */
    public TransformType createTransformType() {
        return new TransformType();
    }

    /**
     * Create an instance of {@link DigestMethodType }
     * 
     */
    public DigestMethodType createDigestMethodType() {
        return new DigestMethodType();
    }

    /**
     * Create an instance of {@link RSAKeyValueType }
     * 
     */
    public RSAKeyValueType createRSAKeyValueType() {
        return new RSAKeyValueType();
    }

    /**
     * Create an instance of {@link ReferenceType }
     * 
     */
    public ReferenceType createReferenceType() {
        return new ReferenceType();
    }

    /**
     * Create an instance of {@link KeyInfoType }
     * 
     */
    public KeyInfoType createKeyInfoType() {
        return new KeyInfoType();
    }

    /**
     * Create an instance of {@link ObjectType }
     * 
     */
    public ObjectType createObjectType() {
        return new ObjectType();
    }

    /**
     * Create an instance of {@link CanonicalizationMethodType }
     * 
     */
    public CanonicalizationMethodType createCanonicalizationMethodType() {
        return new CanonicalizationMethodType();
    }

    /**
     * Create an instance of {@link SignatureMethodType }
     * 
     */
    public SignatureMethodType createSignatureMethodType() {
        return new SignatureMethodType();
    }

    /**
     * Create an instance of {@link X509IssuerSerialType }
     * 
     */
    public X509IssuerSerialType createX509IssuerSerialType() {
        return new X509IssuerSerialType();
    }

    /**
     * Create an instance of {@link CancelaCFD }
     * 
     */
    public CancelaCFD createCancelaCFD() {
        return new CancelaCFD();
    }

    /**
     * Create an instance of {@link CancelaCFDResponse }
     * 
     */
    public CancelaCFDResponse createCancelaCFDResponse() {
        return new CancelaCFDResponse();
    }

    /**
     * Create an instance of {@link Cancelacion1 }
     * 
     */
    public Cancelacion1 createCancelacion1() {
        return new Cancelacion1();
    }

    /**
     * Create an instance of {@link Cancelacion2 }
     * 
     */
    public Cancelacion2 createCancelacion2() {
        return new Cancelacion2();
    }

    /**
     * Create an instance of {@link TimbrarCFDI }
     * 
     */
    public TimbrarCFDI createTimbrarCFDI() {
        return new TimbrarCFDI();
    }

    /**
     * Create an instance of {@link TimbrarCFDIV2 }
     * 
     */
    public TimbrarCFDIV2 createTimbrarCFDIV2() {
        return new TimbrarCFDIV2();
    }

    /**
     * Create an instance of {@link TimbrarCFDIV2Response }
     * 
     */
    public TimbrarCFDIV2Response createTimbrarCFDIV2Response() {
        return new TimbrarCFDIV2Response();
    }

    /**
     * Create an instance of {@link TimbrarZipResponse }
     * 
     */
    public TimbrarZipResponse createTimbrarZipResponse() {
        return new TimbrarZipResponse();
    }

    /**
     * Create an instance of {@link Cancelacion1Response }
     * 
     */
    public Cancelacion1Response createCancelacion1Response() {
        return new Cancelacion1Response();
    }

    /**
     * Create an instance of {@link TimbrarZip }
     * 
     */
    public TimbrarZip createTimbrarZip() {
        return new TimbrarZip();
    }

    /**
     * Create an instance of {@link Cancelacion2Response }
     * 
     */
    public Cancelacion2Response createCancelacion2Response() {
        return new Cancelacion2Response();
    }

    /**
     * Create an instance of {@link TimbrarCFDIResponse }
     * 
     */
    public TimbrarCFDIResponse createTimbrarCFDIResponse() {
        return new TimbrarCFDIResponse();
    }

    /**
     * Create an instance of {@link AcuseCFDI }
     * 
     */
    public AcuseCFDI createAcuseCFDI() {
        return new AcuseCFDI();
    }

    /**
     * Create an instance of {@link AcuseRecepcionZip }
     * 
     */
    public AcuseRecepcionZip createAcuseRecepcionZip() {
        return new AcuseRecepcionZip();
    }

    /**
     * Create an instance of {@link Folio }
     * 
     */
    public Folio createFolio() {
        return new Folio();
    }

    /**
     * Create an instance of {@link AcuseZip }
     * 
     */
    public AcuseZip createAcuseZip() {
        return new AcuseZip();
    }

    /**
     * Create an instance of {@link WsCancelacionResponse }
     * 
     */
    public WsCancelacionResponse createWsCancelacionResponse() {
        return new WsCancelacionResponse();
    }

    /**
     * Create an instance of {@link Accesos }
     * 
     */
    public Accesos createAccesos() {
        return new Accesos();
    }

    /**
     * Create an instance of {@link WsFoliosResponse }
     * 
     */
    public WsFoliosResponse createWsFoliosResponse() {
        return new WsFoliosResponse();
    }

    /**
     * Create an instance of {@link Base64Binary }
     * 
     */
    public Base64Binary createBase64Binary() {
        return new Base64Binary();
    }

    /**
     * Create an instance of {@link HexBinary }
     * 
     */
    public HexBinary createHexBinary() {
        return new HexBinary();
    }

    /**
     * Create an instance of {@link Acuse.Folios }
     * 
     */
    public Acuse.Folios createAcuseFolios() {
        return new Acuse.Folios();
    }

    /**
     * Create an instance of {@link Cancelacion.Folios }
     * 
     */
    public Cancelacion.Folios createCancelacionFolios() {
        return new Cancelacion.Folios();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimbrarCFDIV2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wservicios/", name = "TimbrarCFDIV2")
    public JAXBElement<TimbrarCFDIV2> createTimbrarCFDIV2(TimbrarCFDIV2 value) {
        return new JAXBElement<TimbrarCFDIV2>(_TimbrarCFDIV2_QNAME, TimbrarCFDIV2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Signature")
    public JAXBElement<SignatureType> createSignature(SignatureType value) {
        return new JAXBElement<SignatureType>(_Signature_QNAME, SignatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cancelacion2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wservicios/", name = "Cancelacion_2")
    public JAXBElement<Cancelacion2> createCancelacion2(Cancelacion2 value) {
        return new JAXBElement<Cancelacion2>(_Cancelacion2_QNAME, Cancelacion2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimbrarCFDI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wservicios/", name = "TimbrarCFDI")
    public JAXBElement<TimbrarCFDI> createTimbrarCFDI(TimbrarCFDI value) {
        return new JAXBElement<TimbrarCFDI>(_TimbrarCFDI_QNAME, TimbrarCFDI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cancelacion1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wservicios/", name = "Cancelacion_1")
    public JAXBElement<Cancelacion1> createCancelacion1(Cancelacion1 value) {
        return new JAXBElement<Cancelacion1>(_Cancelacion1_QNAME, Cancelacion1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimbrarCFDIResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wservicios/", name = "TimbrarCFDIResponse")
    public JAXBElement<TimbrarCFDIResponse> createTimbrarCFDIResponse(TimbrarCFDIResponse value) {
        return new JAXBElement<TimbrarCFDIResponse>(_TimbrarCFDIResponse_QNAME, TimbrarCFDIResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cancelacion1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wservicios/", name = "Cancelacion_1Response")
    public JAXBElement<Cancelacion1Response> createCancelacion1Response(Cancelacion1Response value) {
        return new JAXBElement<Cancelacion1Response>(_Cancelacion1Response_QNAME, Cancelacion1Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimbrarZip }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wservicios/", name = "TimbrarZip")
    public JAXBElement<TimbrarZip> createTimbrarZip(TimbrarZip value) {
        return new JAXBElement<TimbrarZip>(_TimbrarZip_QNAME, TimbrarZip.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimbrarCFDIV2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wservicios/", name = "TimbrarCFDIV2Response")
    public JAXBElement<TimbrarCFDIV2Response> createTimbrarCFDIV2Response(TimbrarCFDIV2Response value) {
        return new JAXBElement<TimbrarCFDIV2Response>(_TimbrarCFDIV2Response_QNAME, TimbrarCFDIV2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimbrarZipResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wservicios/", name = "TimbrarZipResponse")
    public JAXBElement<TimbrarZipResponse> createTimbrarZipResponse(TimbrarZipResponse value) {
        return new JAXBElement<TimbrarZipResponse>(_TimbrarZipResponse_QNAME, TimbrarZipResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cancelacion2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wservicios/", name = "Cancelacion_2Response")
    public JAXBElement<Cancelacion2Response> createCancelacion2Response(Cancelacion2Response value) {
        return new JAXBElement<Cancelacion2Response>(_Cancelacion2Response_QNAME, Cancelacion2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "privateKey", scope = Cancelacion1 .class)
    public JAXBElement<byte[]> createCancelacion1PrivateKey(byte[] value) {
        return new JAXBElement<byte[]>(_Cancelacion1PrivateKey_QNAME, byte[].class, Cancelacion1 .class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "publicKey", scope = Cancelacion1 .class)
    public JAXBElement<byte[]> createCancelacion1PublicKey(byte[] value) {
        return new JAXBElement<byte[]>(_Cancelacion1PublicKey_QNAME, byte[].class, Cancelacion1 .class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RSAKeyValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "RSAKeyValue", scope = KeyValueType.class)
    public JAXBElement<RSAKeyValueType> createKeyValueTypeRSAKeyValue(RSAKeyValueType value) {
        return new JAXBElement<RSAKeyValueType>(_KeyValueTypeRSAKeyValue_QNAME, RSAKeyValueType.class, KeyValueType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "XPath", scope = TransformType.class)
    public JAXBElement<String> createTransformTypeXPath(String value) {
        return new JAXBElement<String>(_TransformTypeXPath_QNAME, String.class, TransformType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "KeyValue", scope = KeyInfoType.class)
    public JAXBElement<KeyValueType> createKeyInfoTypeKeyValue(KeyValueType value) {
        return new JAXBElement<KeyValueType>(_KeyInfoTypeKeyValue_QNAME, KeyValueType.class, KeyInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "KeyName", scope = KeyInfoType.class)
    public JAXBElement<String> createKeyInfoTypeKeyName(String value) {
        return new JAXBElement<String>(_KeyInfoTypeKeyName_QNAME, String.class, KeyInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link X509DataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509Data", scope = KeyInfoType.class)
    public JAXBElement<X509DataType> createKeyInfoTypeX509Data(X509DataType value) {
        return new JAXBElement<X509DataType>(_KeyInfoTypeX509Data_QNAME, X509DataType.class, KeyInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "HMACOutputLength", scope = SignatureMethodType.class)
    public JAXBElement<BigInteger> createSignatureMethodTypeHMACOutputLength(BigInteger value) {
        return new JAXBElement<BigInteger>(_SignatureMethodTypeHMACOutputLength_QNAME, BigInteger.class, SignatureMethodType.class, value);
    }

}
