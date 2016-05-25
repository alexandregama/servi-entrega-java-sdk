
package com.servientrega;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumeroGuia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuscarImagen" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "numeroGuia",
    "buscarImagen"
})
@XmlRootElement(name = "ConsultarGuiaImagen")
public class ConsultarGuiaImagen {

    @XmlElement(name = "NumeroGuia")
    protected String numeroGuia;
    @XmlElement(name = "BuscarImagen")
    protected boolean buscarImagen;

    /**
     * Gets the value of the numeroGuia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuia() {
        return numeroGuia;
    }

    /**
     * Sets the value of the numeroGuia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuia(String value) {
        this.numeroGuia = value;
    }

    /**
     * Gets the value of the buscarImagen property.
     * 
     */
    public boolean isBuscarImagen() {
        return buscarImagen;
    }

    /**
     * Sets the value of the buscarImagen property.
     * 
     */
    public void setBuscarImagen(boolean value) {
        this.buscarImagen = value;
    }

}
