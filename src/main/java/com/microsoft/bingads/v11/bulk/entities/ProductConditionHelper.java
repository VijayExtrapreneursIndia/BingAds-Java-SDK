package com.microsoft.bingads.v11.bulk.entities;

import com.microsoft.bingads.v11.internal.bulk.StringTable;
import com.microsoft.bingads.v11.campaignmanagement.ArrayOfProductCondition;
import com.microsoft.bingads.v11.campaignmanagement.ProductCondition;
import com.microsoft.bingads.v11.internal.bulk.RowValues;
import java.util.List;

class ProductConditionHelper {

    public static final int MaxNumberOfConditions = 8;

    public static void addRowValuesFromConditions(ArrayOfProductCondition arrayOfProductCondition, RowValues rowValues) {
        List<ProductCondition> conditions = arrayOfProductCondition.getProductConditions();
        for (int i = 1; i <= conditions.size(); i++) {
            rowValues.put(StringTable.ProductConditionColumnPrefix + i, conditions.get(i - 1).getOperand());
            rowValues.put(StringTable.ProductValueColumnPrefix + i, conditions.get(i - 1).getAttribute());
        }
    }

    public static void addConditionsFromRowValues(RowValues values,
            ArrayOfProductCondition productConditionArray) {
        List<ProductCondition> conditions = productConditionArray.getProductConditions();

        for (int i = 1; i <= MaxNumberOfConditions; i++) {
            String productCondition;
            String productValue;

            productCondition = values.tryGet(StringTable.ProductConditionColumnPrefix + i);
            productValue = values.tryGet(StringTable.ProductValueColumnPrefix + i);

            if (productCondition != null && !productCondition.isEmpty() && productValue != null && !productValue.isEmpty()) {
                ProductCondition condition = new ProductCondition();
                condition.setAttribute(productValue);
                condition.setOperand(productCondition);
                conditions.add(condition);
            }
        }
    }
}
