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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "startoptions",
    "scheduleoptions",
    "endoptions"
})
@XmlRootElement(name = "SCHEDULEINFO")
public class SCHEDULEINFO {

    @XmlAttribute(name = "SCHEDULETYPE")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String scheduletype;
    @XmlElement(name = "STARTOPTIONS")
    protected STARTOPTIONS startoptions;
    @XmlElement(name = "SCHEDULEOPTIONS")
    protected SCHEDULEOPTIONS scheduleoptions;
    @XmlElement(name = "ENDOPTIONS")
    protected ENDOPTIONS endoptions;

    /**
     * Gets the value of the scheduletype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCHEDULETYPE() {
        return scheduletype;
    }

    /**
     * Sets the value of the scheduletype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCHEDULETYPE(String value) {
        this.scheduletype = value;
    }

    /**
     * Gets the value of the startoptions property.
     * 
     * @return
     *     possible object is
     *     {@link STARTOPTIONS }
     *     
     */
    public STARTOPTIONS getSTARTOPTIONS() {
        return startoptions;
    }

    /**
     * Sets the value of the startoptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link STARTOPTIONS }
     *     
     */
    public void setSTARTOPTIONS(STARTOPTIONS value) {
        this.startoptions = value;
    }

    /**
     * Gets the value of the scheduleoptions property.
     * 
     * @return
     *     possible object is
     *     {@link SCHEDULEOPTIONS }
     *     
     */
    public SCHEDULEOPTIONS getSCHEDULEOPTIONS() {
        return scheduleoptions;
    }

    /**
     * Sets the value of the scheduleoptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHEDULEOPTIONS }
     *     
     */
    public void setSCHEDULEOPTIONS(SCHEDULEOPTIONS value) {
        this.scheduleoptions = value;
    }

    /**
     * Gets the value of the endoptions property.
     * 
     * @return
     *     possible object is
     *     {@link ENDOPTIONS }
     *     
     */
    public ENDOPTIONS getENDOPTIONS() {
        return endoptions;
    }

    /**
     * Sets the value of the endoptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDOPTIONS }
     *     
     */
    public void setENDOPTIONS(ENDOPTIONS value) {
        this.endoptions = value;
    }

}
