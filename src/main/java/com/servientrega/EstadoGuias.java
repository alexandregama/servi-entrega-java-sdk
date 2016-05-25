
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
 *         &lt;element name="ID_Cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelacionGuias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idCliente",
    "relacionGuias"
})
@XmlRootElement(name = "EstadoGuias")
public class EstadoGuias {

    @XmlElement(name = "ID_Cliente")
    protected String idCliente;
    @XmlElement(name = "RelacionGuias")
    protected String relacionGuias;

    /**
     * Gets the value of the idCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDCliente() {
        return idCliente;
    }

    /**
     * Sets the value of the idCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDCliente(String value) {
        this.idCliente = value;
    }

    /**
     * Gets the value of the relacionGuias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelacionGuias() {
        return relacionGuias;
    }

    /**
     * Sets the value of the relacionGuias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelacionGuias(String value) {
        this.relacionGuias = value;
    }

}
