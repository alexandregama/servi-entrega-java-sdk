
package com.servientrega;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMovimientoSrPack complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMovimientoSrPack">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MovimientoSrPack" type="{http://servientrega.com/}MovimientoSrPack" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMovimientoSrPack", propOrder = {
    "movimientoSrPack"
})
public class ArrayOfMovimientoSrPack {

    @XmlElement(name = "MovimientoSrPack", nillable = true)
    protected List<MovimientoSrPack> movimientoSrPack;

    /**
     * Gets the value of the movimientoSrPack property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the movimientoSrPack property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMovimientoSrPack().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MovimientoSrPack }
     * 
     * 
     */
    public List<MovimientoSrPack> getMovimientoSrPack() {
        if (movimientoSrPack == null) {
            movimientoSrPack = new ArrayList<MovimientoSrPack>();
        }
        return this.movimientoSrPack;
    }

}
