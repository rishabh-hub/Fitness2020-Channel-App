package com.example.fitness2020channelapp.Models;

public class OfferingModel {
    private String offeringName;
    private String amount;
    private String id;
    private Boolean isDaily;

    public OfferingModel(String offeringName, String amount, String id, Boolean isDaily) {
        this.offeringName = offeringName;
        this.amount = amount;
        this.id = id;
        this.isDaily = isDaily;
    }

    public String getOfferingName() {
        return offeringName;
    }

    public void setOfferingName(String offeringName) {
        this.offeringName = offeringName;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getDaily() {
        return isDaily;
    }

    public void setDaily(Boolean daily) {
        isDaily = daily;
    }
}
