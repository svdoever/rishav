//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.10 at 11:47:16 PM IST 
//


package pc;
import dag.*;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "flatfile",
    "xmlinfoOrERPSRCINFO",
    "group",
    "tableattribute",
    "sourcefield",
    "metadataextension"
})
@XmlRootElement(name = "SOURCE")
public class SOURCE extends Vertex {

    @XmlAttribute(name = "NAME", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "DBDNAME")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String dbdname;
    @XmlAttribute(name = "BUSINESSNAME")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String businessname;
    @XmlAttribute(name = "DESCRIPTION")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String description;
    @XmlAttribute(name = "OBJECTVERSION")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String objectversion;
    @XmlAttribute(name = "OWNERNAME")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String ownername;
    @XmlAttribute(name = "IBMCOMP")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String ibmcomp;
    @XmlAttribute(name = "DATABASETYPE", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String databasetype;
    @XmlAttribute(name = "DATABASE_SUBTYPE")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String databasesubtype;
    @XmlAttribute(name = "VERSIONNUMBER")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String versionnumber;
    @XmlAttribute(name = "COMPONENTVERSION")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String componentversion;
    @XmlAttribute(name = "CRCVALUE")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String crcvalue;
    @XmlElement(name = "FLATFILE")
    protected FLATFILE flatfile;
    @XmlElements({
        @XmlElement(name = "XMLINFO", type = XMLINFO.class),
        @XmlElement(name = "ERPSRCINFO", type = ERPSRCINFO.class)
    })
    protected List<Object> xmlinfoOrERPSRCINFO;
    @XmlElement(name = "GROUP")
    protected List<GROUP> group;
    @XmlElement(name = "TABLEATTRIBUTE")
    protected List<TABLEATTRIBUTE> tableattribute;
    @XmlElement(name = "SOURCEFIELD")
    protected List<SOURCEFIELD> sourcefield;
    @XmlElement(name = "METADATAEXTENSION")
    protected List<METADATAEXTENSION> metadataextension;

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
    @Override
    public String getLabel()
    {
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
     * Gets the value of the dbdname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBDNAME() {
        return dbdname;
    }

    /**
     * Sets the value of the dbdname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBDNAME(String value) {
        this.dbdname = value;
    }

    /**
     * Gets the value of the businessname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUSINESSNAME() {
        return businessname;
    }

    /**
     * Sets the value of the businessname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUSINESSNAME(String value) {
        this.businessname = value;
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
     * Gets the value of the objectversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBJECTVERSION() {
        return objectversion;
    }

    /**
     * Sets the value of the objectversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBJECTVERSION(String value) {
        this.objectversion = value;
    }

    /**
     * Gets the value of the ownername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOWNERNAME() {
        return ownername;
    }

    /**
     * Sets the value of the ownername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOWNERNAME(String value) {
        this.ownername = value;
    }

    /**
     * Gets the value of the ibmcomp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBMCOMP() {
        return ibmcomp;
    }

    /**
     * Sets the value of the ibmcomp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBMCOMP(String value) {
        this.ibmcomp = value;
    }

    /**
     * Gets the value of the databasetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATABASETYPE() {
        return databasetype;
    }

    /**
     * Sets the value of the databasetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATABASETYPE(String value) {
        this.databasetype = value;
    }

    /**
     * Gets the value of the databasesubtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATABASESUBTYPE() {
        return databasesubtype;
    }

    /**
     * Sets the value of the databasesubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATABASESUBTYPE(String value) {
        this.databasesubtype = value;
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

    /**
     * Gets the value of the crcvalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRCVALUE() {
        return crcvalue;
    }

    /**
     * Sets the value of the crcvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRCVALUE(String value) {
        this.crcvalue = value;
    }

    /**
     * Gets the value of the flatfile property.
     * 
     * @return
     *     possible object is
     *     {@link FLATFILE }
     *     
     */
    public FLATFILE getFLATFILE() {
        return flatfile;
    }

    /**
     * Sets the value of the flatfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLATFILE }
     *     
     */
    public void setFLATFILE(FLATFILE value) {
        this.flatfile = value;
    }

    /**
     * Gets the value of the xmlinfoOrERPSRCINFO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xmlinfoOrERPSRCINFO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXMLINFOOrERPSRCINFO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLINFO }
     * {@link ERPSRCINFO }
     * 
     * 
     */
    public List<Object> getXMLINFOOrERPSRCINFO() {
        if (xmlinfoOrERPSRCINFO == null) {
            xmlinfoOrERPSRCINFO = new ArrayList<Object>();
        }
        return this.xmlinfoOrERPSRCINFO;
    }

    /**
     * Gets the value of the group property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the group property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGROUP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GROUP }
     * 
     * 
     */
    public List<GROUP> getGROUP() {
        if (group == null) {
            group = new ArrayList<GROUP>();
        }
        return this.group;
    }

    /**
     * Gets the value of the tableattribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tableattribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTABLEATTRIBUTE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TABLEATTRIBUTE }
     * 
     * 
     */
    public List<TABLEATTRIBUTE> getTABLEATTRIBUTE() {
        if (tableattribute == null) {
            tableattribute = new ArrayList<TABLEATTRIBUTE>();
        }
        return this.tableattribute;
    }

    /**
     * Gets the value of the sourcefield property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourcefield property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSOURCEFIELD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SOURCEFIELD }
     * 
     * 
     */
    public List<SOURCEFIELD> getSOURCEFIELD() {
        if (sourcefield == null) {
            sourcefield = new ArrayList<SOURCEFIELD>();
        }
        return this.sourcefield;
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

    public String getName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getInstanceType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<? extends Field> getInputPorts() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<? extends Field> getOutputPorts() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}