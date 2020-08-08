package com.example.fitness2020channelapp.Models;

import java.text.SimpleDateFormat;

public class OrderDetailModel {
    private String name;
    private String category;
    private String activity;
    private String bookingDate;
    private String bookingTime;
    private int groupSize;
    private String bookedTime;
    private String bookedDate;
    private boolean hasComment;
    private boolean hasPass;
    private float grossAmount;
    private float taxAmount;
    private String taxPercentage;
    private float netAmount;
    private String comment;

    public OrderDetailModel() {
    }

    public OrderDetailModel(String name, String category, String activity, String bookingDate, String bookingTime, int groupSize, String bookedTime, String bookedDate, boolean hasComment, boolean hasPass, float grossAmount, float taxAmount, String taxPercentage, float netAmount, String comment) {
        this.name = name;
        this.category = category;
        this.activity = activity;
        this.bookingDate = bookingDate;
        this.bookingTime = bookingTime;
        this.groupSize = groupSize;
        this.bookedTime = bookedTime;
        this.bookedDate = bookedDate;
        this.hasComment = hasComment;
        this.hasPass = hasPass;
        this.grossAmount = grossAmount;
        this.taxAmount = taxAmount;
        this.taxPercentage = taxPercentage;
        this.netAmount = netAmount;
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(String bookingTime) {
        this.bookingTime = bookingTime;
    }

    public int getGroupSize() {
        return groupSize;
    }

    public void setGroupSize(int groupSize) {
        this.groupSize = groupSize;
    }

    public String getBookedTime() {
        return bookedTime;
    }

    public void setBookedTime(String bookedTime) {
        this.bookedTime = bookedTime;
    }

    public String getBookedDate() {
        return bookedDate;
    }

    public void setBookedDate(String bookedDate) {
        this.bookedDate = bookedDate;
    }

    public boolean isHasComment() {
        return hasComment;
    }

    public void setHasComment(boolean hasComment) {
        this.hasComment = hasComment;
    }

    public boolean isHasPass() {
        return hasPass;
    }

    public void setHasPass(boolean hasPass) {
        this.hasPass = hasPass;
    }

    public float getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(float grossAmount) {
        this.grossAmount = grossAmount;
    }

    public float getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(float taxAmount) {
        this.taxAmount = taxAmount;
    }

    public String getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(String taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public float getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(float netAmount) {
        this.netAmount = netAmount;
    }
}
