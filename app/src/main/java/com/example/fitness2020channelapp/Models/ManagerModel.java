package com.example.fitness2020channelapp.Models;

public class ManagerModel {
    private String name;
    private String email;
    private String mobileNo;

    public ManagerModel(String name, String email, String mobileNo) {
        this.name = name;
        this.email = email;
        this.mobileNo = mobileNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}
