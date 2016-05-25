
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
 *         &lt;element name="ConsultarGestionDevolucionesResult" type="{http://servientrega.com/}ArrayOfInfEnvios" minOccurs="0"/>
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
    "consultarGestionDevolucionesResult"
})
@XmlRootElement(name = "ConsultarGestionDevolucionesResponse")
public class ConsultarGestionDevolucionesResponse {

    @XmlElement(name = "ConsultarGestionDevolucionesResult")
    protected ArrayOfInfEnvios consultarGestionDevolucionesResult;

    /**
     * Gets the value of the consultarGestionDevolucionesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInfEnvios }
     *     
     */
    public ArrayOfInfEnvios getConsultarGestionDevolucionesResult() {
        return consultarGestionDevolucionesResult;
    }

    /**
     * Sets the value of the consultarGestionDevolucionesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInfEnvios }
     *     
     */
    public void setConsultarGestionDevolucionesResult(ArrayOfInfEnvios value) {
        this.consultarGestionDevolucionesResult = value;
    }

}
