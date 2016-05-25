
package com.servientrega;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMixed;
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
 *         &lt;element name="EstadoGuiasIdDocumentoClienteXMLResult" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "estadoGuiasIdDocumentoClienteXMLResult"
})
@XmlRootElement(name = "EstadoGuiasIdDocumentoClienteXMLResponse")
public class EstadoGuiasIdDocumentoClienteXMLResponse {

    @XmlElement(name = "EstadoGuiasIdDocumentoClienteXMLResult")
    protected EstadoGuiasIdDocumentoClienteXMLResponse.EstadoGuiasIdDocumentoClienteXMLResult estadoGuiasIdDocumentoClienteXMLResult;

    /**
     * Gets the value of the estadoGuiasIdDocumentoClienteXMLResult property.
     * 
     * @return
     *     possible object is
     *     {@link EstadoGuiasIdDocumentoClienteXMLResponse.EstadoGuiasIdDocumentoClienteXMLResult }
     *     
     */
    public EstadoGuiasIdDocumentoClienteXMLResponse.EstadoGuiasIdDocumentoClienteXMLResult getEstadoGuiasIdDocumentoClienteXMLResult() {
        return estadoGuiasIdDocumentoClienteXMLResult;
    }

    /**
     * Sets the value of the estadoGuiasIdDocumentoClienteXMLResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoGuiasIdDocumentoClienteXMLResponse.EstadoGuiasIdDocumentoClienteXMLResult }
     *     
     */
    public void setEstadoGuiasIdDocumentoClienteXMLResult(EstadoGuiasIdDocumentoClienteXMLResponse.EstadoGuiasIdDocumentoClienteXMLResult value) {
        this.estadoGuiasIdDocumentoClienteXMLResult = value;
    }


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
     *         &lt;any/>
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
        "content"
    })
    public static class EstadoGuiasIdDocumentoClienteXMLResult {

        @XmlMixed
        @XmlAnyElement(lax = true)
        protected List<Object> content;

        /**
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * {@link String }
         * 
         * 
         */
        public List<Object> getContent() {
            if (content == null) {
                content = new ArrayList<Object>();
            }
            return this.content;
        }

    }

}
