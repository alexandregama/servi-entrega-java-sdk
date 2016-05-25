
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
 *         &lt;element name="ConsultarGuiaExternoResult" type="{http://servientrega.com/}InformacionGuiaMov" minOccurs="0"/>
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
    "consultarGuiaExternoResult"
})
@XmlRootElement(name = "ConsultarGuiaExternoResponse")
public class ConsultarGuiaExternoResponse {

    @XmlElement(name = "ConsultarGuiaExternoResult")
    protected InformacionGuiaMov consultarGuiaExternoResult;

    /**
     * Gets the value of the consultarGuiaExternoResult property.
     * 
     * @return
     *     possible object is
     *     {@link InformacionGuiaMov }
     *     
     */
    public InformacionGuiaMov getConsultarGuiaExternoResult() {
        return consultarGuiaExternoResult;
    }

    /**
     * Sets the value of the consultarGuiaExternoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionGuiaMov }
     *     
     */
    public void setConsultarGuiaExternoResult(InformacionGuiaMov value) {
        this.consultarGuiaExternoResult = value;
    }

}