package com.example.fitness2020channelapp.Models;

public class BookingModel {
    private String name;
    private int groupSize;
    private String time;
    private String category;
    private String detail;
    private boolean hasComment;
    private boolean hasRedeemCode;
    private String phoneNumber;
    private String price;

    public BookingModel(String name, int groupSize, String time, String category, String detail, boolean hasComment, boolean hasRedeemCode, String phoneNumber, String price) {
        this.name = name;
        this.groupSize = groupSize;
        this.time = time;
        this.category = category;
        this.detail = detail;
        this.hasComment = hasComment;
        this.hasRedeemCode = hasRedeemCode;
        this.phoneNumber = phoneNumber;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroupSize() {
        return groupSize;
    }

    public void setGroupSize(int groupSize) {
        this.groupSize = groupSize;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public boolean isHasComment() {
        return hasComment;
    }

    public void setHasComment(boolean hasComment) {
        this.hasComment = hasComment;
    }

    public boolean isHasRedeemCode() {
        return hasRedeemCode;
    }

    public void setHasRedeemCode(boolean hasRedeemCode) {
        this.hasRedeemCode = hasRedeemCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
