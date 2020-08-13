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

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void attachID() {
//        nameTV = findViewById(R.id.);
//        mobileTV = findViewById(R.id.);
//        emailTV = findViewById(R.id.);
//        ageTV = findViewById(R.id.);
//        serviceRatingTV = findViewById(R.id.);
//        trainingRatingTV = findViewById(R.id.);
//        amenitiesRatingTV = findViewById(R.id.);
//        overallRatingTV = findViewById(R.id.);
//        complaintsTV = findViewById(R.id.);
//        commentsTV = findViewById(R.id.);
//        sourceTV = findViewById(R.id.);
    }
}