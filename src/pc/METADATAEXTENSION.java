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
@XmlRootElement(name = "METADATAEXTENSION")
public class METADATAEXTENSION {

    @XmlAttribute(name = "NAME", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "VENDORNAME", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String vendorname;
    @XmlAttribute(name = "DOMAINNAME", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String domainname;
    @XmlAttribute(name = "DATATYPE", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String datatype;
    @XmlAttribute(name = "VALUE", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "MAXLENGTH")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String maxlength;
    @XmlAttribute(name = "DESCRIPTION")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String description;
    @XmlAttribute(name = "ISSHAREREAD")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isshareread;
    @XmlAttribute(name = "ISSHAREWRITE")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String issharewrite;
    @XmlAttribute(name = "ISCLIENTVISIBLE")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isclientvisible;
    @XmlAttribute(name = "ISCLIENTEDITABLE")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isclienteditable;
    @XmlAttribute(name = "ISREUSABLE")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isreusable;
    @XmlAttribute(name = "COMPONENTVERSION")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String componentversion;

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
     * Gets the value of the vendorname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVENDORNAME() {
        return vendorname;
    }

    /**
     * Sets the value of the vendorname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVENDORNAME(String value) {
        this.vendorname = value;
    }

    /**
     * Gets the value of the domainname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOMAINNAME() {
        return domainname;
    }

    /**
     * Sets the value of the domainname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOMAINNAME(String value) {
        this.domainname = value;
    }

    /**
     * Gets the value of the datatype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATATYPE() {
        return datatype;
    }

    /**
     * Sets the value of the datatype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATATYPE(String value) {
        this.datatype = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALUE() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALUE(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the maxlength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAXLENGTH() {
        return maxlength;
    }

    /**
     * Sets the value of the maxlength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAXLENGTH(String value) {
        this.maxlength = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPTION(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the isshareread property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSHAREREAD() {
        return isshareread;
    }

    /**
     * Sets the value of the isshareread property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSHAREREAD(String value) {
        this.isshareread = value;
    }

    /**
     * Gets the value of the issharewrite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSHAREWRITE() {
        return issharewrite;
    }

    /**
     * Sets the value of the issharewrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSHAREWRITE(String value) {
        this.issharewrite = value;
    }

    /**
     * Gets the value of the isclientvisible property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISCLIENTVISIBLE() {
        return isclientvisible;
    }

    /**
     * Sets the value of the isclientvisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISCLIENTVISIBLE(String value) {
        this.isclientvisible = value;
    }

    /**
     * Gets the value of the isclienteditable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISCLIENTEDITABLE() {
        return isclienteditable;
    }

    /**
     * Sets the value of the isclienteditable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISCLIENTEDITABLE(String value) {
        this.isclienteditable = value;
    }

    /**
     * Gets the value of the isreusable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISREUSABLE() {
        return isreusable;
    }

    /**
     * Sets the value of the isreusable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISREUSABLE(String value) {
        this.isreusable = value;
    }

    /**
     * Gets the value of the componentversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPONENTVERSION() {
        return componentversion;
    }

    /**
     * Sets the value of the componentversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPONENTVERSION(String value) {
        this.componentversion = value;
    }

}