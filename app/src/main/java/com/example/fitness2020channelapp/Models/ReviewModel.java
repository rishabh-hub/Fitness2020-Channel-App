package com.example.fitness2020channelapp.Models;

public class ReviewModel {
    private String userName;
    private String gymRating;
    private String reviewDate;
    private String gymReview;

    public ReviewModel(String userName, String gymRating, String reviewDate, String gymReview) {
        this.userName = userName;
        this.gymRating = gymRating;
        this.reviewDate = reviewDate;
        this.gymReview = gymReview;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGymRating() {
        return gymRating;
    }

    public void setGymRating(String gymRating) {
        this.gymRating = gymRating;
    }

    public String getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(String reviewDate) {
        this.reviewDate = reviewDate;
    }

    public String getGymReview() {
        return gymReview;
    }

    public void setGymReview(String gymReview) {
        this.gymReview = gymReview;
    }
}
