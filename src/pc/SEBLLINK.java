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
@XmlRootElement(name = "SEBLLINK")
public class SEBLLINK {

    @XmlAttribute(name = "NAME", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "PARENTBC", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String parentbc;
    @XmlAttribute(name = "CHILDBC", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String childbc;
    @XmlAttribute(name = "DESTBCBASETABLE", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String destbcbasetable;
    @XmlAttribute(name = "SRCCOL", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String srccol;
    @XmlAttribute(name = "DESTCOL", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String destcol;
    @XmlAttribute(name = "INTERCHILDCOL", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String interchildcol;
    @XmlAttribute(name = "INTERPARENTCOL", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String interparentcol;
    @XmlAttribute(name = "INTERTABLE", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String intertable;
    @XmlAttribute(name = "PRIMARYID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String primaryid;

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
     * Gets the value of the parentbc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARENTBC() {
        return parentbc;
    }

    /**
     * Sets the value of the parentbc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARENTBC(String value) {
        this.parentbc = value;
    }

    /**
     * Gets the value of the childbc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHILDBC() {
        return childbc;
    }

    /**
     * Sets the value of the childbc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHILDBC(String value) {
        this.childbc = value;
    }

    /**
     * Gets the value of the destbcbasetable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESTBCBASETABLE() {
        return destbcbasetable;
    }

    /**
     * Sets the value of the destbcbasetable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESTBCBASETABLE(String value) {
        this.destbcbasetable = value;
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

    /**
     * Gets the value of the interchildcol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTERCHILDCOL() {
        return interchildcol;
    }

    /**
     * Sets the value of the interchildcol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTERCHILDCOL(String value) {
        this.interchildcol = value;
    }

    /**
     * Gets the value of the interparentcol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTERPARENTCOL() {
        return interparentcol;
    }

    /**
     * Sets the value of the interparentcol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTERPARENTCOL(String value) {
        this.interparentcol = value;
    }

    /**
     * Gets the value of the intertable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTERTABLE() {
        return intertable;
    }

    /**
     * Sets the value of the intertable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTERTABLE(String value) {
        this.intertable = value;
    }

    /**
     * Gets the value of the primaryid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRIMARYID() {
        return primaryid;
    }

    /**
     * Sets the value of the primaryid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRIMARYID(String value) {
        this.primaryid = value;
    }

}
