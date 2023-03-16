
package com.formasdigitales.timbrado40_ejemplo.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Cancelacion_2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Cancelacion_2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rfcEmisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="folios" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="signatureType" type="{http://www.w3.org/2000/09/xmldsig#}SignatureType" minOccurs="0"/>
 *         &lt;element name="accesos" type="{http://wservicios/}accesos" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cancelacion_2", propOrder = {
    "rfcEmisor",
    "fecha",
    "folios",
    "signatureType",
    "accesos"
})
public class Cancelacion2 {

    protected String rfcEmisor;
    protected String fecha;
    protected List<String> folios;
    protected SignatureType signatureType;
    protected Accesos accesos;

    /**
     * Obtiene el valor de la propiedad rfcEmisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcEmisor() {
        return rfcEmisor;
    }

    /**
     * Define el valor de la propiedad rfcEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcEmisor(String value) {
        this.rfcEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Gets the value of the folios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the folios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFolios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFolios() {
        if (folios == null) {
            folios = new ArrayList<String>();
        }
        return this.folios;
    }

    /**
     * Obtiene el valor de la propiedad signatureType.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignatureType() {
        return signatureType;
    }

    /**
     * Define el valor de la propiedad signatureType.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignatureType(SignatureType value) {
        this.signatureType = value;
    }

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

}
