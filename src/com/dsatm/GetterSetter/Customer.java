package com.dsatm.GetterSetter;

public class Customer {
    private String name;
    private long phNo;
    private long amountPurchased;
    private String productName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhNo() {
        return phNo;
    }

    public void setPhNo(long phNo) {
        this.phNo = phNo;
    }

    public long getAmountPurchased() {
        return amountPurchased;
    }

    public void setAmountPurchased(long amountPurchased) {
        this.amountPurchased = amountPurchased;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
