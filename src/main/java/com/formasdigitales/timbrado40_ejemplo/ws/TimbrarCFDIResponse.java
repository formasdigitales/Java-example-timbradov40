
package com.formasdigitales.timbrado40_ejemplo.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TimbrarCFDIResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TimbrarCFDIResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acuseCFDI" type="{http://wservicios/}acuseCFDI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimbrarCFDIResponse", propOrder = {
    "acuseCFDI"
})
public class TimbrarCFDIResponse {

    protected AcuseCFDI acuseCFDI;

    /**
     * Obtiene el valor de la propiedad acuseCFDI.
     * 
     * @return
     *     possible object is
     *     {@link AcuseCFDI }
     *     
     */
    public AcuseCFDI getAcuseCFDI() {
        return acuseCFDI;
    }

    /**
     * Define el valor de la propiedad acuseCFDI.
     * 
     * @param value
     *     allowed object is
     *     {@link AcuseCFDI }
     *     
     */
    public void setAcuseCFDI(AcuseCFDI value) {
        this.acuseCFDI = value;
    }

}
