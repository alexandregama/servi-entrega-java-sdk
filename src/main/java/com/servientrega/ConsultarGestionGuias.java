
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
 *         &lt;element name="sGuia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Contacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pwd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sGuia",
    "idCliente",
    "idContacto",
    "pwd"
})
@XmlRootElement(name = "ConsultarGestionGuias")
public class ConsultarGestionGuias {

    protected String sGuia;
    @XmlElement(name = "Id_Cliente")
    protected String idCliente;
    @XmlElement(name = "Id_Contacto")
    protected String idContacto;
    @XmlElement(name = "Pwd")
    protected String pwd;

    /**
     * Gets the value of the sGuia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSGuia() {
        return sGuia;
    }

    /**
     * Sets the value of the sGuia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSGuia(String value) {
        this.sGuia = value;
    }

    /**
     * Gets the value of the idCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCliente() {
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
    public void setIdCliente(String value) {
        this.idCliente = value;
    }

    /**
     * Gets the value of the idContacto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdContacto() {
        return idContacto;
    }

    /**
     * Sets the value of the idContacto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdContacto(String value) {
        this.idContacto = value;
    }

    /**
     * Gets the value of the pwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * Sets the value of the pwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPwd(String value) {
        this.pwd = value;
    }

}
