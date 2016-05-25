
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
 *         &lt;element name="ConsultarGestionEntregasResult" type="{http://servientrega.com/}ArrayOfInfEnvios" minOccurs="0"/>
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
    "consultarGestionEntregasResult"
})
@XmlRootElement(name = "ConsultarGestionEntregasResponse")
public class ConsultarGestionEntregasResponse {

    @XmlElement(name = "ConsultarGestionEntregasResult")
    protected ArrayOfInfEnvios consultarGestionEntregasResult;

    /**
     * Gets the value of the consultarGestionEntregasResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInfEnvios }
     *     
     */
    public ArrayOfInfEnvios getConsultarGestionEntregasResult() {
        return consultarGestionEntregasResult;
    }

    /**
     * Sets the value of the consultarGestionEntregasResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInfEnvios }
     *     
     */
    public void setConsultarGestionEntregasResult(ArrayOfInfEnvios value) {
        this.consultarGestionEntregasResult = value;
    }

}
