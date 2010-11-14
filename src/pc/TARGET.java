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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "keyword",
    "flatfile",
    "xmlinfo",
    "group",
    "targetfield",
    "targetindex",
    "tableattribute",
    "metadataextension"
})
@XmlRootElement(name = "TARGET")
public class TARGET extends Vertex {

    @XmlAttribute(name = "NAME", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "BUSINESSNAME")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String businessname;
    @XmlAttribute(name = "DESCRIPTION")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String description;
    @XmlAttribute(name = "OBJECTVERSION")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String objectversion;
    @XmlAttribute(name = "CONSTRAINT")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String constraint;
    @XmlAttribute(name = "TABLEOPTIONS")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String tableoptions;
    @XmlAttribute(name = "TABLETYPE")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String tabletype;
    @XmlAttribute(name = "DATABASETYPE", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String databasetype;
    @XmlAttribute(name = "VERSIONNUMBER")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String versionnumber;
    @XmlAttribute(name = "COMPONENTVERSION")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String componentversion;
    @XmlAttribute(name = "CRCVALUE")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String crcvalue;
    @XmlElement(name = "KEYWORD")
    protected List<KEYWORD> keyword;
    @XmlElement(name = "FLATFILE")
    protected FLATFILE flatfile;
    @XmlElement(name = "XMLINFO")
    protected XMLINFO xmlinfo;
    @XmlElement(name = "GROUP")
    protected List<GROUP> group;
    @XmlElement(name = "TARGETFIELD")
    protected List<TARGETFIELD> targetfield;
    @XmlElement(name = "TARGETINDEX")
    protected List<TARGETINDEX> targetindex;
    @XmlElement(name = "TABLEATTRIBUTE")
    protected List<TABLEATTRIBUTE> tableattribute;
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
     * Gets the value of the constraint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONSTRAINT() {
        return constraint;
    }

    /**
     * Sets the value of the constraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONSTRAINT(String value) {
        this.constraint = value;
    }

    /**
     * Gets the value of the tableoptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTABLEOPTIONS() {
        return tableoptions;
    }

    /**
     * Sets the value of the tableoptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTABLEOPTIONS(String value) {
        this.tableoptions = value;
    }

    /**
     * Gets the value of the tabletype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTABLETYPE() {
        return tabletype;
    }

    /**
     * Sets the value of the tabletype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTABLETYPE(String value) {
        this.tabletype = value;
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
     * Gets the value of the keyword property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyword property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKEYWORD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KEYWORD }
     * 
     * 
     */
    public List<KEYWORD> getKEYWORD() {
        if (keyword == null) {
            keyword = new ArrayList<KEYWORD>();
        }
        return this.keyword;
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
     * Gets the value of the xmlinfo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLINFO }
     *     
     */
    public XMLINFO getXMLINFO() {
        return xmlinfo;
    }

    /**
     * Sets the value of the xmlinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLINFO }
     *     
     */
    public void setXMLINFO(XMLINFO value) {
        this.xmlinfo = value;
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
     * Gets the value of the targetfield property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetfield property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTARGETFIELD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TARGETFIELD }
     * 
     * 
     */
    public List<TARGETFIELD> getTARGETFIELD() {
        if (targetfield == null) {
            targetfield = new ArrayList<TARGETFIELD>();
        }
        return this.targetfield;
    }

    /**
     * Gets the value of the targetindex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetindex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTARGETINDEX().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TARGETINDEX }
     * 
     * 
     */
    public List<TARGETINDEX> getTARGETINDEX() {
        if (targetindex == null) {
            targetindex = new ArrayList<TARGETINDEX>();
        }
        return this.targetindex;
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