
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
 *         &lt;element name="ConsultarGuiaPorNumeroReferenciaClienteResult" type="{http://servientrega.com/}InformacionGuiaMov" minOccurs="0"/>
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
    "consultarGuiaPorNumeroReferenciaClienteResult"
})
@XmlRootElement(name = "ConsultarGuiaPorNumeroReferenciaClienteResponse")
public class ConsultarGuiaPorNumeroReferenciaClienteResponse {

    @XmlElement(name = "ConsultarGuiaPorNumeroReferenciaClienteResult")
    protected InformacionGuiaMov consultarGuiaPorNumeroReferenciaClienteResult;

    /**
     * Gets the value of the consultarGuiaPorNumeroReferenciaClienteResult property.
     * 
     * @return
     *     possible object is
     *     {@link InformacionGuiaMov }
     *     
     */
    public InformacionGuiaMov getConsultarGuiaPorNumeroReferenciaClienteResult() {
        return consultarGuiaPorNumeroReferenciaClienteResult;
    }

    /**
     * Sets the value of the consultarGuiaPorNumeroReferenciaClienteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionGuiaMov }
     *     
     */
    public void setConsultarGuiaPorNumeroReferenciaClienteResult(InformacionGuiaMov value) {
        this.consultarGuiaPorNumeroReferenciaClienteResult = value;
    }

}
