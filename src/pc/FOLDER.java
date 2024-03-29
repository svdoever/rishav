//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.10 at 01:26:00 AM IST 
//


package pc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
"folderversion",
"config",
"scheduler",
"task",
"session",
"worklet",
"workflow",
"source",
"target",
"transformation",
"mapplet",
"mapping",
"shortcut",
"exprmacro"
})
@XmlRootElement(name = "FOLDER")
public class FOLDER {

    @XmlAttribute(name = "NAME", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "DESCRIPTION")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String description;
    @XmlAttribute(name = "SHARED")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shared;
    @XmlAttribute(name = "OWNER")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String owner;
    @XmlAttribute(name = "GROUP")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String group;
    @XmlAttribute(name = "PERMISSIONS")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String permissions;
    @XmlAttribute(name = "UUID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String uuid;
    @XmlElement(name="FOLDERVERSION")
protected List<FOLDERVERSION> folderversion;
@XmlElement(name="CONFIG")
protected List<CONFIG> config;
@XmlElement(name="SCHEDULER")
protected List<SCHEDULER> scheduler;
@XmlElement(name="TASK")
protected List<TASK> task;
@XmlElement(name="SESSION")
protected List<SESSION> session;
@XmlElement(name="WORKLET")
protected List<WORKLET> worklet;
@XmlElement(name="WORKFLOW")
protected List<WORKFLOW> workflow;
@XmlElement(name="SOURCE")
protected List<SOURCE> source;
@XmlElement(name="TARGET")
protected List<TARGET> target;
@XmlElement(name="TRANSFORMATION")
protected List<TRANSFORMATION> transformation;
@XmlElement(name="MAPPLET")
protected List<MAPPLET> mapplet;
@XmlElement(name="MAPPING")
protected List<MAPPING> mapping;
@XmlElement(name="SHORTCUT")
protected List<SHORTCUT> shortcut;
@XmlElement(name="EXPRMACRO")
protected List<EXPRMACRO> exprmacro;

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
     * Gets the value of the shared property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHARED() {
        return shared;
    }

    /**
     * Sets the value of the shared property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHARED(String value) {
        this.shared = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOWNER() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOWNER(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGROUP() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGROUP(String value) {
        this.group = value;
    }

    /**
     * Gets the value of the permissions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERMISSIONS() {
        return permissions;
    }

    /**
     * Sets the value of the permissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERMISSIONS(String value) {
        this.permissions = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the folderversionOrCONFIGOrSCHEDULEROrTASKOrSESSIONOrWORKLETOrWORKFLOWOrSOURCEOrTARGETOrTRANSFORMATIONOrMAPPLETOrMAPPINGOrSHORTCUTOrEXPRMACRO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the folderversionOrCONFIGOrSCHEDULEROrTASKOrSESSIONOrWORKLETOrWORKFLOWOrSOURCEOrTARGETOrTRANSFORMATIONOrMAPPLETOrMAPPINGOrSHORTCUTOrEXPRMACRO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFOLDERVERSIONOrCONFIGOrSCHEDULEROrTASKOrSESSIONOrWORKLETOrWORKFLOWOrSOURCEOrTARGETOrTRANSFORMATIONOrMAPPLETOrMAPPINGOrSHORTCUTOrEXPRMACRO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FOLDERVERSION }
     * {@link CONFIG }
     * {@link SCHEDULER }
     * {@link TASK }
     * {@link SESSION }
     * {@link WORKLET }
     * {@link WORKFLOW }
     * {@link SOURCE }
     * {@link TARGET }
     * {@link TRANSFORMATION }
     * {@link MAPPLET }
     * {@link MAPPING }
     * {@link SHORTCUT }
     * {@link EXPRMACRO }
     * 
     * 
     */
public List<FOLDERVERSION> getFOLDERVERSION() {
        if (folderversion == null) {
            folderversion = new ArrayList<FOLDERVERSION>();
        }
        return this.folderversion;
    }

public List<CONFIG> getCONFIG() {
        if (config == null) {
            config = new ArrayList<CONFIG>();
        }
        return this.config;
    }

public List<SCHEDULER> getSCHEDULER() {
        if (scheduler == null) {
            scheduler = new ArrayList<SCHEDULER>();
        }
        return this.scheduler;
    }

public List<TASK> getTASK() {
        if (task == null) {
            task = new ArrayList<TASK>();
        }
        return this.task;
    }

public List<SESSION> getSESSION() {
        if (session == null) {
            session = new ArrayList<SESSION>();
        }
        return this.session;
    }

public List<WORKLET> getWORKLET() {
        if (worklet == null) {
            worklet = new ArrayList<WORKLET>();
        }
        return this.worklet;
    }

public List<WORKFLOW> getWORKFLOW() {
        if (workflow == null) {
            workflow = new ArrayList<WORKFLOW>();
        }
        return this.workflow;
    }

public List<SOURCE> getSOURCE() {
        if (source == null) {
            source = new ArrayList<SOURCE>();
        }
        return this.source;
    }

public List<TARGET> getTARGET() {
        if (target == null) {
            target = new ArrayList<TARGET>();
        }
        return this.target;
    }

public List<TRANSFORMATION> getTRANSFORMATION() {
        if (transformation == null) {
            transformation = new ArrayList<TRANSFORMATION>();
        }
        return this.transformation;
    }

public List<MAPPLET> getMAPPLET() {
        if (mapplet == null) {
            mapplet = new ArrayList<MAPPLET>();
        }
        return this.mapplet;
    }

public List<MAPPING> getMAPPING() {
        if (mapping == null) {
            mapping = new ArrayList<MAPPING>();
        }
        return this.mapping;
    }

public List<SHORTCUT> getSHORTCUT() {
        if (shortcut == null) {
            shortcut = new ArrayList<SHORTCUT>();
        }
        return this.shortcut;
    }

public List<EXPRMACRO> getEXPRMACRO() {
        if (exprmacro == null) {
            exprmacro = new ArrayList<EXPRMACRO>();
        }
        return this.exprmacro;
    }
    

}
