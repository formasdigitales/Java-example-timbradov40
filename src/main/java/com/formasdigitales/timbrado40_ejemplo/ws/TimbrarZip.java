
package com.formasdigitales.timbrado40_ejemplo.ws;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TimbrarZip complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TimbrarZip">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accesos" type="{http://wservicios/}accesos" minOccurs="0"/>
 *         &lt;element name="zip" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimbrarZip", propOrder = {
    "accesos",
    "zip"
})
public class TimbrarZip {

    protected Accesos accesos;
    @XmlMimeType("application/octet-stream")
    protected DataHandler zip;

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
     * Obtiene el valor de la propiedad zip.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getZip() {
        return zip;
    }

    /**
     * Define el valor de la propiedad zip.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setZip(DataHandler value) {
        this.zip = value;
    }

}
