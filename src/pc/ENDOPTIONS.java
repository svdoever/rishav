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
@XmlRootElement(name = "ENDOPTIONS")
public class ENDOPTIONS {

    @XmlAttribute(name = "ENDTYPE", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String endtype;
    @XmlAttribute(name = "ENDON")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String endon;
    @XmlAttribute(name = "ENDAFTER")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String endafter;
    @XmlAttribute(name = "RUNFOREVER")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String runforever;

    /**
     * Gets the value of the endtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENDTYPE() {
        return endtype;
    }

    /**
     * Sets the value of the endtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENDTYPE(String value) {
        this.endtype = value;
    }

    /**
     * Gets the value of the endon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENDON() {
        return endon;
    }

    /**
     * Sets the value of the endon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENDON(String value) {
        this.endon = value;
    }

    /**
     * Gets the value of the endafter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENDAFTER() {
        return endafter;
    }

    /**
     * Sets the value of the endafter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENDAFTER(String value) {
        this.endafter = value;
    }

    /**
     * Gets the value of the runforever property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRUNFOREVER() {
        return runforever;
    }

    /**
     * Sets the value of the runforever property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRUNFOREVER(String value) {
        this.runforever = value;
    }

}
