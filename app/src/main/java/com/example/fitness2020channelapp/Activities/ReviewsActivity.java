package com.example.fitness2020channelapp.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.fitness2020channelapp.Adapters.ManagerAdapter;
import com.example.fitness2020channelapp.Adapters.ReviewAdapter;
import com.example.fitness2020channelapp.Models.ManagerModel;
import com.example.fitness2020channelapp.Models.ReviewModel;
import com.example.fitness2020channelapp.R;
import com.google.android.material.chip.ChipGroup;

import java.util.ArrayList;

public class ReviewsActivity extends AppCompatActivity {

    RecyclerView reviewRV;
    ReviewAdapter reviewAdapter;
    ImageView backBtn;
    ChipGroup filterChips;
    ArrayList<ReviewModel> reviewModels;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviews);

        attachID();
        initArrayLists();
        addDummyData();
        setLayoutManagers();
        initAdapter();
        setAdapters();

        filterChips.setOnCheckedChangeListener(new ChipGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(ChipGroup group, int checkedId) {

            }
        });

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void setAdapters() {
        reviewRV.setAdapter(reviewAdapter);
        reviewAdapter.notifyDataSetChanged();
    }

    private void initAdapter() {
        reviewAdapter = new ReviewAdapter(reviewModels,ReviewsActivity.this);
    }

    private void setLayoutManagers() {
        reviewRV.setLayoutManager(new LinearLayoutManager(ReviewsActivity.this,LinearLayoutManager.VERTICAL,false));
    }

    private void addDummyData() {
        for (int i=0;i<4;i++)
            reviewModels.add(new ReviewModel("Rishabh Singh","4.5","21/07/2020",getString(R.string.big_dummy_text)));
    }

    private void initArrayLists() {
        reviewModels = new ArrayList<>();
    }

    private void attachID() {
//        reviewRV = findViewById(R.id.);
//        backBtn = findViewById(R.id.back_btn);
//        filterChips = findViewById(R.id.);
    }
}