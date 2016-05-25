
package com.servientrega;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformacionGuiaMov complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InformacionGuiaMov">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FechaProbable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumGui" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FecEnv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumPie" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CiuRem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NomRem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DirRem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CiuDes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NomDes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DirDes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdEstAct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EstAct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FecEst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NomRec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumCun" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Regime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Imagen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BytesImagen" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="Mov" type="{http://servientrega.com/}ArrayOfInformacionMov" minOccurs="0"/>
 *         &lt;element name="MovSrPack" type="{http://servientrega.com/}ArrayOfMovimientoSrPack" minOccurs="0"/>
 *         &lt;element name="IdDocumentoCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdDocumentoCliente2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Placa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdGPS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FormPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NomProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MensajeBuscarImagen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MotivoDevolucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MensajesValidacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformacionGuiaMov", propOrder = {
    "fechaProbable",
    "numGui",
    "fecEnv",
    "numPie",
    "ciuRem",
    "nomRem",
    "dirRem",
    "ciuDes",
    "nomDes",
    "dirDes",
    "idEstAct",
    "estAct",
    "fecEst",
    "nomRec",
    "numCun",
    "regime",
    "imagen",
    "bytesImagen",
    "mov",
    "movSrPack",
    "idDocumentoCliente",
    "idDocumentoCliente2",
    "placa",
    "idGPS",
    "formPago",
    "nomProducto",
    "mensajeBuscarImagen",
    "motivoDevolucion",
    "mensajesValidacion"
})
public class InformacionGuiaMov {

    @XmlElement(name = "FechaProbable")
    protected String fechaProbable;
    @XmlElement(name = "NumGui")
    protected String numGui;
    @XmlElement(name = "FecEnv")
    protected String fecEnv;
    @XmlElement(name = "NumPie")
    protected int numPie;
    @XmlElement(name = "CiuRem")
    protected String ciuRem;
    @XmlElement(name = "NomRem")
    protected String nomRem;
    @XmlElement(name = "DirRem")
    protected String dirRem;
    @XmlElement(name = "CiuDes")
    protected String ciuDes;
    @XmlElement(name = "NomDes")
    protected String nomDes;
    @XmlElement(name = "DirDes")
    protected String dirDes;
    @XmlElement(name = "IdEstAct")
    protected int idEstAct;
    @XmlElement(name = "EstAct")
    protected String estAct;
    @XmlElement(name = "FecEst")
    protected String fecEst;
    @XmlElement(name = "NomRec")
    protected String nomRec;
    @XmlElement(name = "NumCun")
    protected String numCun;
    @XmlElement(name = "Regime")
    protected String regime;
    @XmlElement(name = "Imagen")
    protected String imagen;
    @XmlElement(name = "BytesImagen")
    protected byte[] bytesImagen;
    @XmlElement(name = "Mov")
    protected ArrayOfInformacionMov mov;
    @XmlElement(name = "MovSrPack")
    protected ArrayOfMovimientoSrPack movSrPack;
    @XmlElement(name = "IdDocumentoCliente")
    protected String idDocumentoCliente;
    @XmlElement(name = "IdDocumentoCliente2")
    protected String idDocumentoCliente2;
    @XmlElement(name = "Placa")
    protected String placa;
    @XmlElement(name = "IdGPS")
    protected int idGPS;
    @XmlElement(name = "FormPago")
    protected String formPago;
    @XmlElement(name = "NomProducto")
    protected String nomProducto;
    @XmlElement(name = "MensajeBuscarImagen")
    protected String mensajeBuscarImagen;
    @XmlElement(name = "MotivoDevolucion")
    protected String motivoDevolucion;
    @XmlElement(name = "MensajesValidacion")
    protected String mensajesValidacion;

    /**
     * Gets the value of the fechaProbable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaProbable() {
        return fechaProbable;
    }

    /**
     * Sets the value of the fechaProbable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaProbable(String value) {
        this.fechaProbable = value;
    }

    /**
     * Gets the value of the numGui property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumGui() {
        return numGui;
    }

    /**
     * Sets the value of the numGui property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumGui(String value) {
        this.numGui = value;
    }

    /**
     * Gets the value of the fecEnv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecEnv() {
        return fecEnv;
    }

    /**
     * Sets the value of the fecEnv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecEnv(String value) {
        this.fecEnv = value;
    }

    /**
     * Gets the value of the numPie property.
     * 
     */
    public int getNumPie() {
        return numPie;
    }

    /**
     * Sets the value of the numPie property.
     * 
     */
    public void setNumPie(int value) {
        this.numPie = value;
    }

    /**
     * Gets the value of the ciuRem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiuRem() {
        return ciuRem;
    }

    /**
     * Sets the value of the ciuRem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiuRem(String value) {
        this.ciuRem = value;
    }

    /**
     * Gets the value of the nomRem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomRem() {
        return nomRem;
    }

    /**
     * Sets the value of the nomRem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomRem(String value) {
        this.nomRem = value;
    }

    /**
     * Gets the value of the dirRem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirRem() {
        return dirRem;
    }

    /**
     * Sets the value of the dirRem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirRem(String value) {
        this.dirRem = value;
    }

    /**
     * Gets the value of the ciuDes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiuDes() {
        return ciuDes;
    }

    /**
     * Sets the value of the ciuDes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiuDes(String value) {
        this.ciuDes = value;
    }

    /**
     * Gets the value of the nomDes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomDes() {
        return nomDes;
    }

    /**
     * Sets the value of the nomDes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomDes(String value) {
        this.nomDes = value;
    }

    /**
     * Gets the value of the dirDes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirDes() {
        return dirDes;
    }

    /**
     * Sets the value of the dirDes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirDes(String value) {
        this.dirDes = value;
    }

    /**
     * Gets the value of the idEstAct property.
     * 
     */
    public int getIdEstAct() {
        return idEstAct;
    }

    /**
     * Sets the value of the idEstAct property.
     * 
     */
    public void setIdEstAct(int value) {
        this.idEstAct = value;
    }

    /**
     * Gets the value of the estAct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstAct() {
        return estAct;
    }

    /**
     * Sets the value of the estAct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstAct(String value) {
        this.estAct = value;
    }

    /**
     * Gets the value of the fecEst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecEst() {
        return fecEst;
    }

    /**
     * Sets the value of the fecEst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecEst(String value) {
        this.fecEst = value;
    }

    /**
     * Gets the value of the nomRec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomRec() {
        return nomRec;
    }

    /**
     * Sets the value of the nomRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomRec(String value) {
        this.nomRec = value;
    }

    /**
     * Gets the value of the numCun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCun() {
        return numCun;
    }

    /**
     * Sets the value of the numCun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCun(String value) {
        this.numCun = value;
    }

    /**
     * Gets the value of the regime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegime() {
        return regime;
    }

    /**
     * Sets the value of the regime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegime(String value) {
        this.regime = value;
    }

    /**
     * Gets the value of the imagen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * Sets the value of the imagen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagen(String value) {
        this.imagen = value;
    }

    /**
     * Gets the value of the bytesImagen property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBytesImagen() {
        return bytesImagen;
    }

    /**
     * Sets the value of the bytesImagen property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBytesImagen(byte[] value) {
        this.bytesImagen = value;
    }

    /**
     * Gets the value of the mov property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInformacionMov }
     *     
     */
    public ArrayOfInformacionMov getMov() {
        return mov;
    }

    /**
     * Sets the value of the mov property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInformacionMov }
     *     
     */
    public void setMov(ArrayOfInformacionMov value) {
        this.mov = value;
    }

    /**
     * Gets the value of the movSrPack property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMovimientoSrPack }
     *     
     */
    public ArrayOfMovimientoSrPack getMovSrPack() {
        return movSrPack;
    }

    /**
     * Sets the value of the movSrPack property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMovimientoSrPack }
     *     
     */
    public void setMovSrPack(ArrayOfMovimientoSrPack value) {
        this.movSrPack = value;
    }

    /**
     * Gets the value of the idDocumentoCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDocumentoCliente() {
        return idDocumentoCliente;
    }

    /**
     * Sets the value of the idDocumentoCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDocumentoCliente(String value) {
        this.idDocumentoCliente = value;
    }

    /**
     * Gets the value of the idDocumentoCliente2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDocumentoCliente2() {
        return idDocumentoCliente2;
    }

    /**
     * Sets the value of the idDocumentoCliente2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDocumentoCliente2(String value) {
        this.idDocumentoCliente2 = value;
    }

    /**
     * Gets the value of the placa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Sets the value of the placa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaca(String value) {
        this.placa = value;
    }

    /**
     * Gets the value of the idGPS property.
     * 
     */
    public int getIdGPS() {
        return idGPS;
    }

    /**
     * Sets the value of the idGPS property.
     * 
     */
    public void setIdGPS(int value) {
        this.idGPS = value;
    }

    /**
     * Gets the value of the formPago property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormPago() {
        return formPago;
    }

    /**
     * Sets the value of the formPago property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormPago(String value) {
        this.formPago = value;
    }

    /**
     * Gets the value of the nomProducto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomProducto() {
        return nomProducto;
    }

    /**
     * Sets the value of the nomProducto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomProducto(String value) {
        this.nomProducto = value;
    }

    /**
     * Gets the value of the mensajeBuscarImagen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajeBuscarImagen() {
        return mensajeBuscarImagen;
    }

    /**
     * Sets the value of the mensajeBuscarImagen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajeBuscarImagen(String value) {
        this.mensajeBuscarImagen = value;
    }

    /**
     * Gets the value of the motivoDevolucion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoDevolucion() {
        return motivoDevolucion;
    }

    /**
     * Sets the value of the motivoDevolucion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoDevolucion(String value) {
        this.motivoDevolucion = value;
    }

    /**
     * Gets the value of the mensajesValidacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajesValidacion() {
        return mensajesValidacion;
    }

    /**
     * Sets the value of the mensajesValidacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajesValidacion(String value) {
        this.mensajesValidacion = value;
    }

}
