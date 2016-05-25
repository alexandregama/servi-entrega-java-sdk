
package com.servientrega;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MovimientoSrPack complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MovimientoSrPack">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DescMov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriMov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestMov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechMov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MovimientoSrPack", propOrder = {
    "descMov",
    "oriMov",
    "destMov",
    "fechMov"
})
public class MovimientoSrPack {

    @XmlElement(name = "DescMov")
    protected String descMov;
    @XmlElement(name = "OriMov")
    protected String oriMov;
    @XmlElement(name = "DestMov")
    protected String destMov;
    @XmlElement(name = "FechMov")
    protected String fechMov;

    /**
     * Gets the value of the descMov property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescMov() {
        return descMov;
    }

    /**
     * Sets the value of the descMov property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescMov(String value) {
        this.descMov = value;
    }

    /**
     * Gets the value of the oriMov property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriMov() {
        return oriMov;
    }

    /**
     * Sets the value of the oriMov property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriMov(String value) {
        this.oriMov = value;
    }

    /**
     * Gets the value of the destMov property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestMov() {
        return destMov;
    }

    /**
     * Sets the value of the destMov property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestMov(String value) {
        this.destMov = value;
    }

    /**
     * Gets the value of the fechMov property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechMov() {
        return fechMov;
    }

    /**
     * Sets the value of the fechMov property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechMov(String value) {
        this.fechMov = value;
    }

}
