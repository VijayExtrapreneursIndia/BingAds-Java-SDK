
package com.microsoft.bingads.v11.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CampaignEstimates" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V11.Entity}ArrayOfCampaignEstimate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "campaignEstimates"
})
@XmlRootElement(name = "GetKeywordTrafficEstimatesResponse", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V11")
public class GetKeywordTrafficEstimatesResponse {

    @XmlElement(name = "CampaignEstimates", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V11", nillable = true)
    protected ArrayOfCampaignEstimate campaignEstimates;

    /**
     * Gets the value of the campaignEstimates property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCampaignEstimate }
     *     
     */
    public ArrayOfCampaignEstimate getCampaignEstimates() {
        return campaignEstimates;
    }

    /**
     * Sets the value of the campaignEstimates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCampaignEstimate }
     *     
     */
    public void setCampaignEstimates(ArrayOfCampaignEstimate value) {
        this.campaignEstimates = value;
    }

}
