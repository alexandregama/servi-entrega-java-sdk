
package com.servientrega;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformacionMov complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InformacionMov">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdProc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdConc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NomConc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NomMov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriMov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DesMov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FecMov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdViewCliente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TipoMov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaProb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DesTipoMov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Observacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformacionMov", propOrder = {
    "idProc",
    "idConc",
    "nomConc",
    "nomMov",
    "oriMov",
    "desMov",
    "fecMov",
    "idViewCliente",
    "tipoMov",
    "fechaProb",
    "desTipoMov",
    "observacion"
})
public class InformacionMov {

    @XmlElement(name = "IdProc")
    protected int idProc;
    @XmlElement(name = "IdConc")
    protected int idConc;
    @XmlElement(name = "NomConc")
    protected String nomConc;
    @XmlElement(name = "NomMov")
    protected String nomMov;
    @XmlElement(name = "OriMov")
    protected String oriMov;
    @XmlElement(name = "DesMov")
    protected String desMov;
    @XmlElement(name = "FecMov")
    protected String fecMov;
    @XmlElement(name = "IdViewCliente")
    protected int idViewCliente;
    @XmlElement(name = "TipoMov")
    protected String tipoMov;
    @XmlElement(name = "FechaProb")
    protected String fechaProb;
    @XmlElement(name = "DesTipoMov")
    protected String desTipoMov;
    @XmlElement(name = "Observacion")
    protected String observacion;

    /**
     * Gets the value of the idProc property.
     * 
     */
    public int getIdProc() {
        return idProc;
    }

    /**
     * Sets the value of the idProc property.
     * 
     */
    public void setIdProc(int value) {
        this.idProc = value;
    }

    /**
     * Gets the value of the idConc property.
     * 
     */
    public int getIdConc() {
        return idConc;
    }

    /**
     * Sets the value of the idConc property.
     * 
     */
    public void setIdConc(int value) {
        this.idConc = value;
    }

    /**
     * Gets the value of the nomConc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomConc() {
        return nomConc;
    }

    /**
     * Sets the value of the nomConc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomConc(String value) {
        this.nomConc = value;
    }

    /**
     * Gets the value of the nomMov property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomMov() {
        return nomMov;
    }

    /**
     * Sets the value of the nomMov property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomMov(String value) {
        this.nomMov = value;
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
     * Gets the value of the desMov property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesMov() {
        return desMov;
    }

    /**
     * Sets the value of the desMov property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesMov(String value) {
        this.desMov = value;
    }

    /**
     * Gets the value of the fecMov property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecMov() {
        return fecMov;
    }

    /**
     * Sets the value of the fecMov property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecMov(String value) {
        this.fecMov = value;
    }

    /**
     * Gets the value of the idViewCliente property.
     * 
     */
    public int getIdViewCliente() {
        return idViewCliente;
    }

    /**
     * Sets the value of the idViewCliente property.
     * 
     */
    public void setIdViewCliente(int value) {
        this.idViewCliente = value;
    }

    /**
     * Gets the value of the tipoMov property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoMov() {
        return tipoMov;
    }

    /**
     * Sets the value of the tipoMov property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoMov(String value) {
        this.tipoMov = value;
    }

    /**
     * Gets the value of the fechaProb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaProb() {
        return fechaProb;
    }

    /**
     * Sets the value of the fechaProb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaProb(String value) {
        this.fechaProb = value;
    }

    /**
     * Gets the value of the desTipoMov property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesTipoMov() {
        return desTipoMov;
    }

    /**
     * Sets the value of the desTipoMov property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesTipoMov(String value) {
        this.desTipoMov = value;
    }

    /**
     * Gets the value of the observacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacion() {
        return observacion;
    }

    /**
     * Sets the value of the observacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacion(String value) {
        this.observacion = value;
    }

}
