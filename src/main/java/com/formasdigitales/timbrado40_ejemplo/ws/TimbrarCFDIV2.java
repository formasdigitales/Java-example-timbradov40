
package com.formasdigitales.timbrado40_ejemplo.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TimbrarCFDIV2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TimbrarCFDIV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accesos" type="{http://wservicios/}accesos" minOccurs="0"/>
 *         &lt;element name="comprobante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimbrarCFDIV2", propOrder = {
    "accesos",
    "comprobante"
})
public class TimbrarCFDIV2 {

    protected Accesos accesos;
    protected String comprobante;

    /**
     * Obtiene el valor de la propiedad accesos.
     * 
     * @return
     *     possible object is
     *     {@link Accesos }
     *     
     */
    public Accesos getAccesos() {
        return accesos;
    }

    /**
     * Define el valor de la propiedad accesos.
     * 
     * @param value
     *     allowed object is
     *     {@link Accesos }
     *     
     */
    public void setAccesos(Accesos value) {
        this.accesos = value;
    }

    /**
     * Obtiene el valor de la propiedad comprobante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComprobante() {
        return comprobante;
    }

    /**
     * Define el valor de la propiedad comprobante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComprobante(String value) {
        this.comprobante = value;
    }

}
