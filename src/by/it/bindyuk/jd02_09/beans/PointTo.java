//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1-b171012.0423 
//         See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.10.16 at 01:01:25 AM MSK 
//


package by.it.bindyuk.jd02_09.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pointTo complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pointTo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cityTo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="railwayStTo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pointTo", propOrder = {
    "cityTo",
    "railwayStTo"
})
public class PointTo {

    @XmlElement(required = true)
    protected String cityTo;
    @XmlElement(required = true)
    protected String railwayStTo;

    /**
     * Gets the value of the cityTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityTo() {
        return cityTo;
    }

    /**
     * Sets the value of the cityTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityTo(String value) {
        this.cityTo = value;
    }

    /**
     * Gets the value of the railwayStTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRailwayStTo() {
        return railwayStTo;
    }

    /**
     * Sets the value of the railwayStTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRailwayStTo(String value) {
        this.railwayStTo = value;
    }

}
