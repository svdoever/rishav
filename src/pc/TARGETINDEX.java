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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "targetindexfield"
})
@XmlRootElement(name = "TARGETINDEX")
public class TARGETINDEX {

    @XmlAttribute(name = "NAME", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "UNIQUE")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String unique;
    @XmlAttribute(name = "DESCRIPTION")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String description;
    @XmlElement(name = "TARGETINDEXFIELD", required = true)
    protected List<TARGETINDEXFIELD> targetindexfield;

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
     * Gets the value of the unique property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNIQUE() {
        return unique;
    }

    /**
     * Sets the value of the unique property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNIQUE(String value) {
        this.unique = value;
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
     * Gets the value of the targetindexfield property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetindexfield property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTARGETINDEXFIELD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TARGETINDEXFIELD }
     * 
     * 
     */
    public List<TARGETINDEXFIELD> getTARGETINDEXFIELD() {
        if (targetindexfield == null) {
            targetindexfield = new ArrayList<TARGETINDEXFIELD>();
        }
        return this.targetindexfield;
    }

}
