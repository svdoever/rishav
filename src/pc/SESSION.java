//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.10 at 11:47:16 PM IST 
//


package pc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "task",
    "sesstransformationinst",
    "configreference",
    "sessioncomponent",
    "sessionextension",
    "attribute",
    "metadataextension",
    "resourcereferenceOrTRANSFORMRESOURCEREF"
})
@XmlRootElement(name = "SESSION")
public class SESSION {

    @XmlAttribute(name = "NAME", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "DESCRIPTION")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String description;
    @XmlAttribute(name = "REUSABLE", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String reusable;
    @XmlAttribute(name = "ISVALID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isvalid;
    @XmlAttribute(name = "MAPPINGNAME", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String mappingname;
    @XmlAttribute(name = "MAPPINGVERSION")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String mappingversion;
    @XmlAttribute(name = "SORTORDER")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sortorder;
    @XmlAttribute(name = "PARENT")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String parent;
    @XmlAttribute(name = "PARENT_TYPE")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String parenttype;
    @XmlAttribute(name = "VERSIONNUMBER")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String versionnumber;
    @XmlElement(name = "TASK")
    protected List<TASK> task;
    @XmlElement(name = "SESSTRANSFORMATIONINST")
    protected List<SESSTRANSFORMATIONINST> sesstransformationinst;
    @XmlElement(name = "CONFIGREFERENCE")
    protected CONFIGREFERENCE configreference;
    @XmlElement(name = "SESSIONCOMPONENT")
    protected List<SESSIONCOMPONENT> sessioncomponent;
    @XmlElement(name = "SESSIONEXTENSION")
    protected List<SESSIONEXTENSION> sessionextension;
    @XmlElement(name = "ATTRIBUTE")
    protected List<ATTRIBUTE> attribute;
    @XmlElement(name = "METADATAEXTENSION")
    protected List<METADATAEXTENSION> metadataextension;
    @XmlElements({
        @XmlElement(name = "RESOURCEREFERENCE", type = RESOURCEREFERENCE.class),
        @XmlElement(name = "TRANSFORMRESOURCEREF", type = TRANSFORMRESOURCEREF.class)
    })
    protected List<Object> resourcereferenceOrTRANSFORMRESOURCEREF;

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
     * Gets the value of the reusable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREUSABLE() {
        return reusable;
    }

    /**
     * Sets the value of the reusable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREUSABLE(String value) {
        this.reusable = value;
    }

    /**
     * Gets the value of the isvalid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISVALID() {
        return isvalid;
    }

    /**
     * Sets the value of the isvalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISVALID(String value) {
        this.isvalid = value;
    }

    /**
     * Gets the value of the mappingname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAPPINGNAME() {
        return mappingname;
    }

    /**
     * Sets the value of the mappingname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAPPINGNAME(String value) {
        this.mappingname = value;
    }

    /**
     * Gets the value of the mappingversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAPPINGVERSION() {
        return mappingversion;
    }

    /**
     * Sets the value of the mappingversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAPPINGVERSION(String value) {
        this.mappingversion = value;
    }

    /**
     * Gets the value of the sortorder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSORTORDER() {
        return sortorder;
    }

    /**
     * Sets the value of the sortorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSORTORDER(String value) {
        this.sortorder = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARENT() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARENT(String value) {
        this.parent = value;
    }

    /**
     * Gets the value of the parenttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARENTTYPE() {
        return parenttype;
    }

    /**
     * Sets the value of the parenttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARENTTYPE(String value) {
        this.parenttype = value;
    }

    /**
     * Gets the value of the versionnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVERSIONNUMBER() {
        return versionnumber;
    }

    /**
     * Sets the value of the versionnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVERSIONNUMBER(String value) {
        this.versionnumber = value;
    }

    /**
     * Gets the value of the task property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the task property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTASK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TASK }
     * 
     * 
     */
    public List<TASK> getTASK() {
        if (task == null) {
            task = new ArrayList<TASK>();
        }
        return this.task;
    }

    /**
     * Gets the value of the sesstransformationinst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sesstransformationinst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSESSTRANSFORMATIONINST().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SESSTRANSFORMATIONINST }
     * 
     * 
     */
    public List<SESSTRANSFORMATIONINST> getSESSTRANSFORMATIONINST() {
        if (sesstransformationinst == null) {
            sesstransformationinst = new ArrayList<SESSTRANSFORMATIONINST>();
        }
        return this.sesstransformationinst;
    }

    /**
     * Gets the value of the configreference property.
     * 
     * @return
     *     possible object is
     *     {@link CONFIGREFERENCE }
     *     
     */
    public CONFIGREFERENCE getCONFIGREFERENCE() {
        return configreference;
    }

    /**
     * Sets the value of the configreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CONFIGREFERENCE }
     *     
     */
    public void setCONFIGREFERENCE(CONFIGREFERENCE value) {
        this.configreference = value;
    }

    /**
     * Gets the value of the sessioncomponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sessioncomponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSESSIONCOMPONENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SESSIONCOMPONENT }
     * 
     * 
     */
    public List<SESSIONCOMPONENT> getSESSIONCOMPONENT() {
        if (sessioncomponent == null) {
            sessioncomponent = new ArrayList<SESSIONCOMPONENT>();
        }
        return this.sessioncomponent;
    }

    /**
     * Gets the value of the sessionextension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sessionextension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSESSIONEXTENSION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SESSIONEXTENSION }
     * 
     * 
     */
    public List<SESSIONEXTENSION> getSESSIONEXTENSION() {
        if (sessionextension == null) {
            sessionextension = new ArrayList<SESSIONEXTENSION>();
        }
        return this.sessionextension;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getATTRIBUTE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATTRIBUTE }
     * 
     * 
     */
    public List<ATTRIBUTE> getATTRIBUTE() {
        if (attribute == null) {
            attribute = new ArrayList<ATTRIBUTE>();
        }
        return this.attribute;
    }

    /**
     * Gets the value of the metadataextension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadataextension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMETADATAEXTENSION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link METADATAEXTENSION }
     * 
     * 
     */
    public List<METADATAEXTENSION> getMETADATAEXTENSION() {
        if (metadataextension == null) {
            metadataextension = new ArrayList<METADATAEXTENSION>();
        }
        return this.metadataextension;
    }

    /**
     * Gets the value of the resourcereferenceOrTRANSFORMRESOURCEREF property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourcereferenceOrTRANSFORMRESOURCEREF property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRESOURCEREFERENCEOrTRANSFORMRESOURCEREF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RESOURCEREFERENCE }
     * {@link TRANSFORMRESOURCEREF }
     * 
     * 
     */
    public List<Object> getRESOURCEREFERENCEOrTRANSFORMRESOURCEREF() {
        if (resourcereferenceOrTRANSFORMRESOURCEREF == null) {
            resourcereferenceOrTRANSFORMRESOURCEREF = new ArrayList<Object>();
        }
        return this.resourcereferenceOrTRANSFORMRESOURCEREF;
    }

}
