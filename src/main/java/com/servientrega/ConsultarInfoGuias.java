
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
 *         &lt;element name="NumerosGuias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "numerosGuias"
})
@XmlRootElement(name = "ConsultarInfoGuias")
public class ConsultarInfoGuias {

    @XmlElement(name = "NumerosGuias")
    protected String numerosGuias;

    /**
     * Gets the value of the numerosGuias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerosGuias() {
        return numerosGuias;
    }

    /**
     * Sets the value of the numerosGuias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerosGuias(String value) {
        this.numerosGuias = value;
    }

}
