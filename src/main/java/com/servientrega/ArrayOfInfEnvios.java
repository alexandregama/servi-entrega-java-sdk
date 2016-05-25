
package com.servientrega;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInfEnvios complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInfEnvios">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InfEnvios" type="{http://servientrega.com/}InfEnvios" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInfEnvios", propOrder = {
    "infEnvios"
})
public class ArrayOfInfEnvios {

    @XmlElement(name = "InfEnvios", nillable = true)
    protected List<InfEnvios> infEnvios;

    /**
     * Gets the value of the infEnvios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infEnvios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfEnvios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InfEnvios }
     * 
     * 
     */
    public List<InfEnvios> getInfEnvios() {
        if (infEnvios == null) {
            infEnvios = new ArrayList<InfEnvios>();
        }
        return this.infEnvios;
    }

}
