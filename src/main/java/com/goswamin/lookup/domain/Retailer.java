package com.goswamin.lookup.domain;

import java.util.List;

public class Retailer extends User{
    private long retailerId;

    public long getRetailerId() {
        return retailerId;
    }

    public void setRetailerId(long retailerId) {
        this.retailerId = retailerId;
    }
}
