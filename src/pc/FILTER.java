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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "FILTER")
public class FILTER {

    @XmlAttribute(name = "DAYOFMONTH")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String dayofmonth;
    @XmlAttribute(name = "DAY")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String day;
    @XmlAttribute(name = "OCCURRENCE")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String occurrence;

    /**
     * Gets the value of the dayofmonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAYOFMONTH() {
        return dayofmonth;
    }

    /**
     * Sets the value of the dayofmonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAYOFMONTH(String value) {
        this.dayofmonth = value;
    }

    /**
     * Gets the value of the day property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAY() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAY(String value) {
        this.day = value;
    }

    /**
     * Gets the value of the occurrence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOCCURRENCE() {
        return occurrence;
    }

    /**
     * Sets the value of the occurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOCCURRENCE(String value) {
        this.occurrence = value;
    }

}
