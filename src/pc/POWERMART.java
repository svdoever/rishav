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
    "repository"
})
@XmlRootElement(name = "POWERMART")
public class POWERMART {

    @XmlAttribute(name = "CREATION_DATE")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String creationdate;
    @XmlAttribute(name = "REPOSITORY_VERSION")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String repositoryversion;
    @XmlElement(name = "REPOSITORY")
    protected List<REPOSITORY> repository;

    /**
     * Gets the value of the creationdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREATIONDATE() {
        return creationdate;
    }

    /**
     * Sets the value of the creationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREATIONDATE(String value) {
        this.creationdate = value;
    }

    /**
     * Gets the value of the repositoryversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREPOSITORYVERSION() {
        return repositoryversion;
    }

    /**
     * Sets the value of the repositoryversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREPOSITORYVERSION(String value) {
        this.repositoryversion = value;
    }

    /**
     * Gets the value of the repository property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repository property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getREPOSITORY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link REPOSITORY }
     * 
     * 
     */
    public List<REPOSITORY> getREPOSITORY() {
        if (repository == null) {
            repository = new ArrayList<REPOSITORY>();
        }
        return this.repository;
    }

}