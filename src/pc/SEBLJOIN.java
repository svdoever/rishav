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
@XmlRootElement(name = "SEBLJOIN")
public class SEBLJOIN {

    @XmlAttribute(name = "NAME", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "PKTABLE", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String pktable;
    @XmlAttribute(name = "FKTABLE", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String fktable;
    @XmlAttribute(name = "OUTERJOINREL")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String outerjoinrel;
    @XmlAttribute(name = "SRCCOL", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String srccol;
    @XmlAttribute(name = "DESTCOL", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String destcol;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the pktable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPKTABLE() {
        return pktable;
    }

    /**
     * Sets the value of the pktable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPKTABLE(String value) {
        this.pktable = value;
    }

    /**
     * Gets the value of the fktable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFKTABLE() {
        return fktable;
    }

    /**
     * Sets the value of the fktable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFKTABLE(String value) {
        this.fktable = value;
    }

    /**
     * Gets the value of the outerjoinrel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOUTERJOINREL() {
        return outerjoinrel;
    }

    /**
     * Sets the value of the outerjoinrel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOUTERJOINREL(String value) {
        this.outerjoinrel = value;
    }

    /**
     * Gets the value of the srccol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRCCOL() {
        return srccol;
    }

    /**
     * Sets the value of the srccol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRCCOL(String value) {
        this.srccol = value;
    }

    /**
     * Gets the value of the destcol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESTCOL() {
        return destcol;
    }

    /**
     * Sets the value of the destcol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESTCOL(String value) {
        this.destcol = value;
    }

}