
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
 *         &lt;element name="ConsultarGuiaResult" type="{http://servientrega.com/}InformacionGuiaMov" minOccurs="0"/>
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
    "consultarGuiaResult"
})
@XmlRootElement(name = "ConsultarGuiaResponse")
public class ConsultarGuiaResponse {

    @XmlElement(name = "ConsultarGuiaResult")
    protected InformacionGuiaMov consultarGuiaResult;

    /**
     * Gets the value of the consultarGuiaResult property.
     * 
     * @return
     *     possible object is
     *     {@link InformacionGuiaMov }
     *     
     */
    public InformacionGuiaMov getConsultarGuiaResult() {
        return consultarGuiaResult;
    }

    /**
     * Sets the value of the consultarGuiaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionGuiaMov }
     *     
     */
    public void setConsultarGuiaResult(InformacionGuiaMov value) {
        this.consultarGuiaResult = value;
    }

}
