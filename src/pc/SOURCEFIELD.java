//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.10 at 11:47:16 PM IST 
//


package pc;
import constant.PortType;
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
    "sourcefield",
    "fieldattribute"
})
@XmlRootElement(name = "SOURCEFIELD")
public class SOURCEFIELD implements Field{

    @XmlAttribute(name = "NAME", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "BUSINESSNAME")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String businessname;
    @XmlAttribute(name = "DESCRIPTION")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String description;
    @XmlAttribute(name = "DATATYPE")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String datatype;
    @XmlAttribute(name = "KEYTYPE")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String keytype;
    @XmlAttribute(name = "PRECISION")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String precision;
    @XmlAttribute(name = "SCALE")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String scale;
    @XmlAttribute(name = "NULLABLE")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nullable;
    @XmlAttribute(name = "USAGE")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String usage;
    @XmlAttribute(name = "USAGE_FLAGS")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String usageflags;
    @XmlAttribute(name = "LEVEL")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String level;
    @XmlAttribute(name = "FIELDTYPE")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String fieldtype;
    @XmlAttribute(name = "PICTURETEXT")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String picturetext;
    @XmlAttribute(name = "OCCURS")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String occurs;
    @XmlAttribute(name = "REDEFINES")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String redefines;
    @XmlAttribute(name = "REFERENCEDTABLE")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String referencedtable;
    @XmlAttribute(name = "REFERENCEDFIELD")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String referencedfield;
    @XmlAttribute(name = "REFERENCEDDBD")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String referenceddbd;
    @XmlAttribute(name = "OFFSET")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String offset;
    @XmlAttribute(name = "LENGTH")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String length;
    @XmlAttribute(name = "PHYSICALOFFSET")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String physicaloffset;
    @XmlAttribute(name = "PHYSICALLENGTH")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String physicallength;
    @XmlAttribute(name = "FIELDNUMBER")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String fieldnumber;
    @XmlAttribute(name = "FIELDPROPERTY")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String fieldproperty;
    @XmlAttribute(name = "HIDDEN")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String hidden;
    @XmlAttribute(name = "GROUP")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String group;
    @XmlAttribute(name = "SHIFTSTATE")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String shiftstate;
    @XmlElement(name = "SOURCEFIELD")
    protected List<SOURCEFIELD> sourcefield;
    @XmlElement(name = "FIELDATTRIBUTE")
    protected List<FIELDATTRIBUTE> fieldattribute;

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
     * Gets the value of the keytype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKEYTYPE() {
        return keytype;
    }

    /**
     * Sets the value of the keytype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKEYTYPE(String value) {
        this.keytype = value;
    }

    /**
     * Gets the value of the precision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRECISION() {
        return precision;
    }

    /**
     * Sets the value of the precision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRECISION(String value) {
        this.precision = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCALE() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCALE(String value) {
        this.scale = value;
    }

    /**
     * Gets the value of the nullable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNULLABLE() {
        return nullable;
    }

    /**
     * Sets the value of the nullable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNULLABLE(String value) {
        this.nullable = value;
    }

    /**
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSAGE() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSAGE(String value) {
        this.usage = value;
    }

    /**
     * Gets the value of the usageflags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSAGEFLAGS() {
        return usageflags;
    }

    /**
     * Sets the value of the usageflags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSAGEFLAGS(String value) {
        this.usageflags = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEVEL() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEVEL(String value) {
        this.level = value;
    }

    /**
     * Gets the value of the fieldtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIELDTYPE() {
        return fieldtype;
    }

    /**
     * Sets the value of the fieldtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIELDTYPE(String value) {
        this.fieldtype = value;
    }

    /**
     * Gets the value of the picturetext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPICTURETEXT() {
        return picturetext;
    }

    /**
     * Sets the value of the picturetext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPICTURETEXT(String value) {
        this.picturetext = value;
    }

    /**
     * Gets the value of the occurs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOCCURS() {
        return occurs;
    }

    /**
     * Sets the value of the occurs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOCCURS(String value) {
        this.occurs = value;
    }

    /**
     * Gets the value of the redefines property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREDEFINES() {
        return redefines;
    }

    /**
     * Sets the value of the redefines property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREDEFINES(String value) {
        this.redefines = value;
    }

    /**
     * Gets the value of the referencedtable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFERENCEDTABLE() {
        return referencedtable;
    }

    /**
     * Sets the value of the referencedtable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFERENCEDTABLE(String value) {
        this.referencedtable = value;
    }

    /**
     * Gets the value of the referencedfield property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFERENCEDFIELD() {
        return referencedfield;
    }

    /**
     * Sets the value of the referencedfield property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFERENCEDFIELD(String value) {
        this.referencedfield = value;
    }

    /**
     * Gets the value of the referenceddbd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFERENCEDDBD() {
        return referenceddbd;
    }

    /**
     * Sets the value of the referenceddbd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFERENCEDDBD(String value) {
        this.referenceddbd = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOFFSET() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOFFSET(String value) {
        this.offset = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLENGTH() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLENGTH(String value) {
        this.length = value;
    }

    /**
     * Gets the value of the physicaloffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPHYSICALOFFSET() {
        return physicaloffset;
    }

    /**
     * Sets the value of the physicaloffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPHYSICALOFFSET(String value) {
        this.physicaloffset = value;
    }

    /**
     * Gets the value of the physicallength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPHYSICALLENGTH() {
        return physicallength;
    }

    /**
     * Sets the value of the physicallength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPHYSICALLENGTH(String value) {
        this.physicallength = value;
    }

    /**
     * Gets the value of the fieldnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIELDNUMBER() {
        return fieldnumber;
    }

    /**
     * Sets the value of the fieldnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIELDNUMBER(String value) {
        this.fieldnumber = value;
    }

    /**
     * Gets the value of the fieldproperty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIELDPROPERTY() {
        return fieldproperty;
    }

    /**
     * Sets the value of the fieldproperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIELDPROPERTY(String value) {
        this.fieldproperty = value;
    }

    /**
     * Gets the value of the hidden property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHIDDEN() {
        return hidden;
    }

    /**
     * Sets the value of the hidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHIDDEN(String value) {
        this.hidden = value;
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
     * Gets the value of the shiftstate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHIFTSTATE() {
        return shiftstate;
    }

    /**
     * Sets the value of the shiftstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHIFTSTATE(String value) {
        this.shiftstate = value;
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
     * Gets the value of the fieldattribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldattribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFIELDATTRIBUTE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FIELDATTRIBUTE }
     * 
     * 
     */
    public List<FIELDATTRIBUTE> getFIELDATTRIBUTE() {
        if (fieldattribute == null) {
            fieldattribute = new ArrayList<FIELDATTRIBUTE>();
        }
        return this.fieldattribute;
    }

    public String getName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getDataType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getPrecision() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getScale() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getPortType() {
        return PortType.OUTPUT.getPortType();
    }

    public void setName(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setDataType(String dataType) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setPrecision(int precision) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setScale(int scale) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setPortType(String porttype) {

    }

}