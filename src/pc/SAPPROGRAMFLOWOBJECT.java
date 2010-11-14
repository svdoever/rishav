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
    "sapfunctioninstanceOrSAPCODEBLOCK"
})
@XmlRootElement(name = "SAPPROGRAMFLOWOBJECT")
public class SAPPROGRAMFLOWOBJECT {

    @XmlAttribute(name = "REF_SOURCE_NAME")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String refsourcename;
    @XmlAttribute(name = "REF_DBD_NAME")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String refdbdname;
    @XmlAttribute(name = "REF_SOURCEINSTNAME")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String refsourceinstname;
    @XmlAttribute(name = "TYPE", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "JOINBITMAP", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String joinbitmap;
    @XmlAttribute(name = "ORDER")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String order;
    @XmlAttribute(name = "DSQINSTNAME", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String dsqinstname;
    @XmlElements({
        @XmlElement(name = "SAPFUNCTIONINSTANCE", type = SAPFUNCTIONINSTANCE.class),
        @XmlElement(name = "SAPCODEBLOCK", type = SAPCODEBLOCK.class)
    })
    protected List<Object> sapfunctioninstanceOrSAPCODEBLOCK;

    /**
     * Gets the value of the refsourcename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFSOURCENAME() {
        return refsourcename;
    }

    /**
     * Sets the value of the refsourcename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFSOURCENAME(String value) {
        this.refsourcename = value;
    }

    /**
     * Gets the value of the refdbdname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFDBDNAME() {
        return refdbdname;
    }

    /**
     * Sets the value of the refdbdname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFDBDNAME(String value) {
        this.refdbdname = value;
    }

    /**
     * Gets the value of the refsourceinstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFSOURCEINSTNAME() {
        return refsourceinstname;
    }

    /**
     * Sets the value of the refsourceinstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFSOURCEINSTNAME(String value) {
        this.refsourceinstname = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPE(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the joinbitmap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJOINBITMAP() {
        return joinbitmap;
    }

    /**
     * Sets the value of the joinbitmap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJOINBITMAP(String value) {
        this.joinbitmap = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDER() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDER(String value) {
        this.order = value;
    }

    /**
     * Gets the value of the dsqinstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSQINSTNAME() {
        return dsqinstname;
    }

    /**
     * Sets the value of the dsqinstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSQINSTNAME(String value) {
        this.dsqinstname = value;
    }

    /**
     * Gets the value of the sapfunctioninstanceOrSAPCODEBLOCK property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sapfunctioninstanceOrSAPCODEBLOCK property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSAPFUNCTIONINSTANCEOrSAPCODEBLOCK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SAPFUNCTIONINSTANCE }
     * {@link SAPCODEBLOCK }
     * 
     * 
     */
    public List<Object> getSAPFUNCTIONINSTANCEOrSAPCODEBLOCK() {
        if (sapfunctioninstanceOrSAPCODEBLOCK == null) {
            sapfunctioninstanceOrSAPCODEBLOCK = new ArrayList<Object>();
        }
        return this.sapfunctioninstanceOrSAPCODEBLOCK;
    }

}