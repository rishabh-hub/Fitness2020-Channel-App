package com.example.fitness2020channelapp.Models;

public class PastOrderModel {
    private String name;
    private float price;
    private String date;
    private String activity;

    public PastOrderModel(String name, float price, String date, String activity) {
        this.name = name;
        this.price = price;
        this.date = date;
        this.activity = activity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }
}
