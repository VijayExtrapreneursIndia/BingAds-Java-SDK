
package com.microsoft.bingads.v11.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Campaign complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Campaign">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BiddingScheme" type="{https://bingads.microsoft.com/CampaignManagement/v11}BiddingScheme" minOccurs="0"/>
 *         &lt;element name="BudgetType" type="{https://bingads.microsoft.com/CampaignManagement/v11}BudgetLimitType" minOccurs="0"/>
 *         &lt;element name="DailyBudget" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForwardCompatibilityMap" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfstringstring" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NativeBidAdjustment" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Status" type="{https://bingads.microsoft.com/CampaignManagement/v11}CampaignStatus" minOccurs="0"/>
 *         &lt;element name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrackingUrlTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UrlCustomParameters" type="{http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11}CustomParameters" minOccurs="0"/>
 *         &lt;element name="CampaignType" type="{https://bingads.microsoft.com/CampaignManagement/v11}CampaignType" minOccurs="0"/>
 *         &lt;element name="Settings" type="{https://bingads.microsoft.com/CampaignManagement/v11}ArrayOfSetting" minOccurs="0"/>
 *         &lt;element name="BudgetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Languages" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Campaign", propOrder = {
    "biddingScheme",
    "budgetType",
    "dailyBudget",
    "description",
    "forwardCompatibilityMap",
    "id",
    "name",
    "nativeBidAdjustment",
    "status",
    "timeZone",
    "trackingUrlTemplate",
    "urlCustomParameters",
    "campaignType",
    "settings",
    "budgetId",
    "languages"
})
public class Campaign {

    @XmlElement(name = "BiddingScheme", nillable = true)
    protected BiddingScheme biddingScheme;
    @XmlElement(name = "BudgetType", nillable = true)
    @XmlSchemaType(name = "string")
    protected BudgetLimitType budgetType;
    @XmlElement(name = "DailyBudget", nillable = true)
    protected Double dailyBudget;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "ForwardCompatibilityMap", nillable = true)
    protected ArrayOfKeyValuePairOfstringstring forwardCompatibilityMap;
    @XmlElement(name = "Id", nillable = true)
    protected Long id;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "NativeBidAdjustment", nillable = true)
    protected Integer nativeBidAdjustment;
    @XmlElement(name = "Status", nillable = true)
    @XmlSchemaType(name = "string")
    protected CampaignStatus status;
    @XmlElement(name = "TimeZone", nillable = true)
    protected String timeZone;
    @XmlElement(name = "TrackingUrlTemplate", nillable = true)
    protected String trackingUrlTemplate;
    @XmlElement(name = "UrlCustomParameters", nillable = true)
    protected CustomParameters urlCustomParameters;
    @XmlElement(name = "CampaignType", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Collection<CampaignType> campaignType;
    @XmlElement(name = "Settings", nillable = true)
    protected ArrayOfSetting settings;
    @XmlElement(name = "BudgetId", nillable = true)
    protected Long budgetId;
    @XmlElement(name = "Languages", nillable = true)
    protected ArrayOfstring languages;

    /**
     * Gets the value of the biddingScheme property.
     * 
     * @return
     *     possible object is
     *     {@link BiddingScheme }
     *     
     */
    public BiddingScheme getBiddingScheme() {
        return biddingScheme;
    }

    /**
     * Sets the value of the biddingScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiddingScheme }
     *     
     */
    public void setBiddingScheme(BiddingScheme value) {
        this.biddingScheme = value;
    }

    /**
     * Gets the value of the budgetType property.
     * 
     * @return
     *     possible object is
     *     {@link BudgetLimitType }
     *     
     */
    public BudgetLimitType getBudgetType() {
        return budgetType;
    }

    /**
     * Sets the value of the budgetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BudgetLimitType }
     *     
     */
    public void setBudgetType(BudgetLimitType value) {
        this.budgetType = value;
    }

    /**
     * Gets the value of the dailyBudget property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDailyBudget() {
        return dailyBudget;
    }

    /**
     * Sets the value of the dailyBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDailyBudget(Double value) {
        this.dailyBudget = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
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
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the forwardCompatibilityMap property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValuePairOfstringstring }
     *     
     */
    public ArrayOfKeyValuePairOfstringstring getForwardCompatibilityMap() {
        return forwardCompatibilityMap;
    }

    /**
     * Sets the value of the forwardCompatibilityMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValuePairOfstringstring }
     *     
     */
    public void setForwardCompatibilityMap(ArrayOfKeyValuePairOfstringstring value) {
        this.forwardCompatibilityMap = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
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
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the nativeBidAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNativeBidAdjustment() {
        return nativeBidAdjustment;
    }

    /**
     * Sets the value of the nativeBidAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNativeBidAdjustment(Integer value) {
        this.nativeBidAdjustment = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignStatus }
     *     
     */
    public CampaignStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignStatus }
     *     
     */
    public void setStatus(CampaignStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the trackingUrlTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingUrlTemplate() {
        return trackingUrlTemplate;
    }

    /**
     * Sets the value of the trackingUrlTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingUrlTemplate(String value) {
        this.trackingUrlTemplate = value;
    }

    /**
     * Gets the value of the urlCustomParameters property.
     * 
     * @return
     *     possible object is
     *     {@link CustomParameters }
     *     
     */
    public CustomParameters getUrlCustomParameters() {
        return urlCustomParameters;
    }

    /**
     * Sets the value of the urlCustomParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomParameters }
     *     
     */
    public void setUrlCustomParameters(CustomParameters value) {
        this.urlCustomParameters = value;
    }

    /**
     * Gets the value of the campaignType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<CampaignType> getCampaignType() {
        return campaignType;
    }

    /**
     * Sets the value of the campaignType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignType(Collection<CampaignType> value) {
        this.campaignType = value;
    }

    /**
     * Gets the value of the settings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSetting }
     *     
     */
    public ArrayOfSetting getSettings() {
        return settings;
    }

    /**
     * Sets the value of the settings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSetting }
     *     
     */
    public void setSettings(ArrayOfSetting value) {
        this.settings = value;
    }

    /**
     * Gets the value of the budgetId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBudgetId() {
        return budgetId;
    }

    /**
     * Sets the value of the budgetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBudgetId(Long value) {
        this.budgetId = value;
    }

    /**
     * Gets the value of the languages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getLanguages() {
        return languages;
    }

    /**
     * Sets the value of the languages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setLanguages(ArrayOfstring value) {
        this.languages = value;
    }

}
