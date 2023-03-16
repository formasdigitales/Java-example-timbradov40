
package com.formasdigitales.timbrado40_ejemplo.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para acuseRecepcionZip complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="acuseRecepcionZip">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listaCFDIs" type="{http://wservicios/}acuseZip" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nombrezip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acuseRecepcionZip", propOrder = {
    "codigoError",
    "error",
    "listaCFDIs",
    "nombrezip"
})
public class AcuseRecepcionZip {

    protected String codigoError;
    protected String error;
    @XmlElement(nillable = true)
    protected List<AcuseZip> listaCFDIs;
    protected String nombrezip;

    /**
     * Obtiene el valor de la propiedad codigoError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoError() {
        return codigoError;
    }

    /**
     * Define el valor de la propiedad codigoError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoError(String value) {
        this.codigoError = value;
    }

    /**
     * Obtiene el valor de la propiedad error.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Define el valor de la propiedad error.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * Gets the value of the listaCFDIs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaCFDIs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaCFDIs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcuseZip }
     * 
     * 
     */
    public List<AcuseZip> getListaCFDIs() {
        if (listaCFDIs == null) {
            listaCFDIs = new ArrayList<AcuseZip>();
        }
        return this.listaCFDIs;
    }

    /**
     * Obtiene el valor de la propiedad nombrezip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrezip() {
        return nombrezip;
    }

    /**
     * Define el valor de la propiedad nombrezip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrezip(String value) {
        this.nombrezip = value;
    }

}
