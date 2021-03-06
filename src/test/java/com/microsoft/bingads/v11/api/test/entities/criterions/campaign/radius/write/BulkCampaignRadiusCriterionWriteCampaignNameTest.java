package com.microsoft.bingads.v11.api.test.entities.criterions.campaign.radius.write;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.criterions.campaign.radius.BulkCampaignRadiusCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignRadiusCriterion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkCampaignRadiusCriterionWriteCampaignNameTest extends BulkCampaignRadiusCriterionTest {

    @Parameterized.Parameter(value = 1)
    public String propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"123", "123"},
                        {"XXX YYY", "XXX YYY"},
                        {"", ""},
                        {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Campaign",
                datum,
                propertyValue,
                new BiConsumer<BulkCampaignRadiusCriterion, String>() {
                    @Override
                    public void accept(BulkCampaignRadiusCriterion c, String v) {
                        c.setCampaignName(v);
                    }
                }
        );
    }
}
