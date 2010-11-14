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
    "sapfuncinstanceparam",
    "saptableinstanceparam"
})
@XmlRootElement(name = "SAPFUNCTIONINSTANCE")
public class SAPFUNCTIONINSTANCE {

    @XmlAttribute(name = "FUNCTIONNAME", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String functionname;
    @XmlAttribute(name = "DSQINSTNAME", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String dsqinstname;
    @XmlElement(name = "SAPFUNCINSTANCEPARAM")
    protected List<SAPFUNCINSTANCEPARAM> sapfuncinstanceparam;
    @XmlElement(name = "SAPTABLEINSTANCEPARAM")
    protected List<SAPTABLEINSTANCEPARAM> saptableinstanceparam;

    /**
     * Gets the value of the functionname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUNCTIONNAME() {
        return functionname;
    }

    /**
     * Sets the value of the functionname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUNCTIONNAME(String value) {
        this.functionname = value;
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
     * Gets the value of the sapfuncinstanceparam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sapfuncinstanceparam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSAPFUNCINSTANCEPARAM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SAPFUNCINSTANCEPARAM }
     * 
     * 
     */
    public List<SAPFUNCINSTANCEPARAM> getSAPFUNCINSTANCEPARAM() {
        if (sapfuncinstanceparam == null) {
            sapfuncinstanceparam = new ArrayList<SAPFUNCINSTANCEPARAM>();
        }
        return this.sapfuncinstanceparam;
    }

    /**
     * Gets the value of the saptableinstanceparam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saptableinstanceparam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSAPTABLEINSTANCEPARAM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SAPTABLEINSTANCEPARAM }
     * 
     * 
     */
    public List<SAPTABLEINSTANCEPARAM> getSAPTABLEINSTANCEPARAM() {
        if (saptableinstanceparam == null) {
            saptableinstanceparam = new ArrayList<SAPTABLEINSTANCEPARAM>();
        }
        return this.saptableinstanceparam;
    }

}
