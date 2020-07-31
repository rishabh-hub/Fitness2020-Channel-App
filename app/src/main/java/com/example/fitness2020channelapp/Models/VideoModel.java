package com.example.fitness2020channelapp.Models;

public class VideoModel {
    private String videoURL;

    public VideoModel(String videoURL) {
        this.videoURL = videoURL;
    }

    public String getVideoURL() {
        return videoURL;
    }

    public void setVideoURL(String videoURL) {
        this.videoURL = videoURL;
    }
}
