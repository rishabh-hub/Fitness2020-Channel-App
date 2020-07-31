package com.example.fitness2020channelapp.Models;

public class PhotoModel {
    private int imageUri;

    public PhotoModel(int imageUri) {
        this.imageUri = imageUri;
    }

    public int getImageUri() {
        return imageUri;
    }

    public void setImageUri(int imageUri) {
        this.imageUri = imageUri;
    }
}
