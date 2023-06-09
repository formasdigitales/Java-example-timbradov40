
package com.formasdigitales.timbrado40_ejemplo.ws;

import java.util.List;
import javax.activation.DataHandler;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSTimbradoCFDI", targetNamespace = "http://wservicios/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSTimbradoCFDI {


    /**
     * 
     * @param fecha
     * @param folios
     * @param signatureType
     * @param accesos
     * @param rfcEmisor
     * @return
     *     returns com.formasdigitales.timbrado40_ejemplo.ws.WsCancelacionResponse
     */
    @WebMethod(operationName = "Cancelacion_2")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Cancelacion_2", targetNamespace = "http://wservicios/", className = "com.formasdigitales.timbrado40_ejemplo.ws.Cancelacion2")
    @ResponseWrapper(localName = "Cancelacion_2Response", targetNamespace = "http://wservicios/", className = "com.formasdigitales.timbrado40_ejemplo.ws.Cancelacion2Response")
    @Action(input = "http://wservicios/WSTimbradoCFDI/Cancelacion_2Request", output = "http://wservicios/WSTimbradoCFDI/Cancelacion_2Response")
    public WsCancelacionResponse cancelacion2(
        @WebParam(name = "rfcEmisor", targetNamespace = "")
        String rfcEmisor,
        @WebParam(name = "fecha", targetNamespace = "")
        String fecha,
        @WebParam(name = "folios", targetNamespace = "")
        List<String> folios,
        @WebParam(name = "signatureType", targetNamespace = "")
        SignatureType signatureType,
        @WebParam(name = "accesos", targetNamespace = "")
        Accesos accesos);

    /**
     * 
     * @param fecha
     * @param privateKey
     * @param password
     * @param folios
     * @param publicKey
     * @param accesos
     * @param rfcEmisor
     * @return
     *     returns com.formasdigitales.timbrado40_ejemplo.ws.WsCancelacionResponse
     */
    @WebMethod(operationName = "Cancelacion_1")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Cancelacion_1", targetNamespace = "http://wservicios/", className = "com.formasdigitales.timbrado40_ejemplo.ws.Cancelacion1")
    @ResponseWrapper(localName = "Cancelacion_1Response", targetNamespace = "http://wservicios/", className = "com.formasdigitales.timbrado40_ejemplo.ws.Cancelacion1Response")
    @Action(input = "http://wservicios/WSTimbradoCFDI/Cancelacion_1Request", output = "http://wservicios/WSTimbradoCFDI/Cancelacion_1Response")
    public WsCancelacionResponse cancelacion1(
        @WebParam(name = "rfcEmisor", targetNamespace = "")
        String rfcEmisor,
        @WebParam(name = "fecha", targetNamespace = "")
        String fecha,
        @WebParam(name = "folios", targetNamespace = "")
        List<String> folios,
        @WebParam(name = "publicKey", targetNamespace = "")
        byte[] publicKey,
        @WebParam(name = "privateKey", targetNamespace = "")
        byte[] privateKey,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "accesos", targetNamespace = "")
        Accesos accesos);

    /**
     * 
     * @param comprobante
     * @param accesos
     * @return
     *     returns com.formasdigitales.timbrado40_ejemplo.ws.AcuseCFDI
     */
    @WebMethod(operationName = "TimbrarCFDI")
    @WebResult(name = "acuseCFDI", targetNamespace = "")
    @RequestWrapper(localName = "TimbrarCFDI", targetNamespace = "http://wservicios/", className = "com.formasdigitales.timbrado40_ejemplo.ws.TimbrarCFDI")
    @ResponseWrapper(localName = "TimbrarCFDIResponse", targetNamespace = "http://wservicios/", className = "com.formasdigitales.timbrado40_ejemplo.ws.TimbrarCFDIResponse")
    @Action(input = "http://wservicios/WSTimbradoCFDI/TimbrarCFDIRequest", output = "http://wservicios/WSTimbradoCFDI/TimbrarCFDIResponse")
    public AcuseCFDI timbrarCFDI(
        @WebParam(name = "accesos", targetNamespace = "")
        Accesos accesos,
        @WebParam(name = "comprobante", targetNamespace = "")
        String comprobante);

    /**
     * 
     * @param comprobante
     * @param accesos
     * @return
     *     returns com.formasdigitales.timbrado40_ejemplo.ws.AcuseCFDI
     */
    @WebMethod(operationName = "TimbrarCFDIV2")
    @WebResult(name = "acuseCFDI", targetNamespace = "")
    @RequestWrapper(localName = "TimbrarCFDIV2", targetNamespace = "http://wservicios/", className = "com.formasdigitales.timbrado40_ejemplo.ws.TimbrarCFDIV2")
    @ResponseWrapper(localName = "TimbrarCFDIV2Response", targetNamespace = "http://wservicios/", className = "com.formasdigitales.timbrado40_ejemplo.ws.TimbrarCFDIV2Response")
    @Action(input = "http://wservicios/WSTimbradoCFDI/TimbrarCFDIV2Request", output = "http://wservicios/WSTimbradoCFDI/TimbrarCFDIV2Response")
    public AcuseCFDI timbrarCFDIV2(
        @WebParam(name = "accesos", targetNamespace = "")
        Accesos accesos,
        @WebParam(name = "comprobante", targetNamespace = "")
        String comprobante);

    /**
     * 
     * @param zip
     * @param acuse
     * @param accesos
     * @return
     *     returns javax.activation.DataHandler
     */
    @WebMethod(operationName = "TimbrarZip")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "TimbrarZip", targetNamespace = "http://wservicios/", className = "com.formasdigitales.timbrado40_ejemplo.ws.TimbrarZip")
    @ResponseWrapper(localName = "TimbrarZipResponse", targetNamespace = "http://wservicios/", className = "com.formasdigitales.timbrado40_ejemplo.ws.TimbrarZipResponse")
    @Action(input = "http://wservicios/WSTimbradoCFDI/TimbrarZipRequest", output = "http://wservicios/WSTimbradoCFDI/TimbrarZipResponse")
    public DataHandler timbrarZip(
        @WebParam(name = "accesos", targetNamespace = "")
        Accesos accesos,
        @WebParam(name = "zip", targetNamespace = "")
        DataHandler zip,
        @WebParam(name = "acuse", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<AcuseRecepcionZip> acuse);

}
