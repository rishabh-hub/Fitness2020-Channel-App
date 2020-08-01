package com.example.fitness2020channelapp.Models;

import android.net.Uri;

public class PhotoModel {
    private Uri imageUri;

    public PhotoModel(Uri imageUri) {
        this.imageUri = imageUri;
    }

    public Uri getImageUri() {
        return imageUri;
    }

    public void setImageUri(Uri imageUri) {
        this.imageUri = imageUri;
    }
}
