//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.10 at 11:47:16 PM IST 
//


package pc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "MAPDEPENDENCY")
public class MAPDEPENDENCY {

    @XmlAttribute(name = "FROMINSTANCE", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String frominstance;
    @XmlAttribute(name = "FROMINSTANCETYPE", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String frominstancetype;
    @XmlAttribute(name = "TOINSTANCE", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String toinstance;
    @XmlAttribute(name = "TOINSTANCETYPE", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String toinstancetype;

    /**
     * Gets the value of the frominstance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFROMINSTANCE() {
        return frominstance;
    }

    /**
     * Sets the value of the frominstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFROMINSTANCE(String value) {
        this.frominstance = value;
    }

    /**
     * Gets the value of the frominstancetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFROMINSTANCETYPE() {
        return frominstancetype;
    }

    /**
     * Sets the value of the frominstancetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFROMINSTANCETYPE(String value) {
        this.frominstancetype = value;
    }

    /**
     * Gets the value of the toinstance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOINSTANCE() {
        return toinstance;
    }

    /**
     * Sets the value of the toinstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOINSTANCE(String value) {
        this.toinstance = value;
    }

    /**
     * Gets the value of the toinstancetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOINSTANCETYPE() {
        return toinstancetype;
    }

    /**
     * Sets the value of the toinstancetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOINSTANCETYPE(String value) {
        this.toinstancetype = value;
    }

}
