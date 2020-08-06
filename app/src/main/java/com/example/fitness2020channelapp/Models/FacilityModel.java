package com.example.fitness2020channelapp.Models;

public class FacilityModel {
    private String name;
    private String id;

    public FacilityModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
