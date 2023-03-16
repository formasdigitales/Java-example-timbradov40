
package com.formasdigitales.timbrado40_ejemplo.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para wsCancelacionResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="wsCancelacionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acuse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codEstatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="folios" type="{http://wservicios/}wsFoliosResponse" minOccurs="0"/>
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsCancelacionResponse", propOrder = {
    "acuse",
    "codEstatus",
    "folios",
    "mensaje"
})
public class WsCancelacionResponse {

    protected String acuse;
    protected String codEstatus;
    protected WsFoliosResponse folios;
    protected String mensaje;

    /**
     * Obtiene el valor de la propiedad acuse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcuse() {
        return acuse;
    }

    /**
     * Define el valor de la propiedad acuse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcuse(String value) {
        this.acuse = value;
    }

    /**
     * Obtiene el valor de la propiedad codEstatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEstatus() {
        return codEstatus;
    }

    /**
     * Define el valor de la propiedad codEstatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEstatus(String value) {
        this.codEstatus = value;
    }

    /**
     * Obtiene el valor de la propiedad folios.
     * 
     * @return
     *     possible object is
     *     {@link WsFoliosResponse }
     *     
     */
    public WsFoliosResponse getFolios() {
        return folios;
    }

    /**
     * Define el valor de la propiedad folios.
     * 
     * @param value
     *     allowed object is
     *     {@link WsFoliosResponse }
     *     
     */
    public void setFolios(WsFoliosResponse value) {
        this.folios = value;
    }

    /**
     * Obtiene el valor de la propiedad mensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Define el valor de la propiedad mensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

}
