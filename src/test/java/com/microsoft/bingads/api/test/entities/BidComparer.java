/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.bingads.api.test.entities;

import com.microsoft.bingads.campaignmanagement.Bid;

public class BidComparer implements EqualityComparerWithDescription<Bid> {

    @Override
    public Boolean equals(Bid x, Bid y) {
        if (x.getAmount() == null && y.getAmount() != null) {
            return false;
        }
        
        return x.getAmount().equals(y.getAmount());
    }

    @Override
    public String getDescripition(Bid obj) {
        return String.format("Amount: %d", obj.getAmount());
    }    
}