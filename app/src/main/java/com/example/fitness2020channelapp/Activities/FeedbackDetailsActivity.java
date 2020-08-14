package com.example.fitness2020channelapp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fitness2020channelapp.R;

public class FeedbackDetailsActivity extends AppCompatActivity {

    TextView nameTV,mobileTV,emailTV,ageTV,serviceRatingTV,trainingRatingTV,amenitiesRatingTV,overallRatingTV,complaintsTV,commentsTV,sourceTV;
    ImageView backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback_details);

        attachID();

        emailTV.setText("rishabhsinghluknonawab@gmail.com");

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void attachID() {
        nameTV = findViewById(R.id.feedback_details_name);
        mobileTV = findViewById(R.id.feedback_details_mobile);
        emailTV = findViewById(R.id.feedback_details_email);
        ageTV = findViewById(R.id.feedback_details_age);
        serviceRatingTV = findViewById(R.id.feedback_details_services);
        trainingRatingTV = findViewById(R.id.feedback_details_training);
        amenitiesRatingTV = findViewById(R.id.feedback_details_amenities);
        overallRatingTV = findViewById(R.id.feedback_details_overall);
        complaintsTV = findViewById(R.id.feedback_details_comp);
        commentsTV = findViewById(R.id.feedback_details_comments);
        sourceTV = findViewById(R.id.feedback_details_referred);
        backBtn=findViewById(R.id.back_btn);
    }
}