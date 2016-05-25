
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
 *         &lt;element name="ConsultarGestionGuiasResult" type="{http://servientrega.com/}ArrayOfInfEnvios" minOccurs="0"/>
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
    "consultarGestionGuiasResult"
})
@XmlRootElement(name = "ConsultarGestionGuiasResponse")
public class ConsultarGestionGuiasResponse {

    @XmlElement(name = "ConsultarGestionGuiasResult")
    protected ArrayOfInfEnvios consultarGestionGuiasResult;

    /**
     * Gets the value of the consultarGestionGuiasResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInfEnvios }
     *     
     */
    public ArrayOfInfEnvios getConsultarGestionGuiasResult() {
        return consultarGestionGuiasResult;
    }

    /**
     * Sets the value of the consultarGestionGuiasResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInfEnvios }
     *     
     */
    public void setConsultarGestionGuiasResult(ArrayOfInfEnvios value) {
        this.consultarGestionGuiasResult = value;
    }

}
