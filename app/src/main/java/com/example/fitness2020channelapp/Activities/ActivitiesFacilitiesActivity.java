package com.example.fitness2020channelapp.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.fitness2020channelapp.Adapters.ActFacAdapter;
import com.example.fitness2020channelapp.Adapters.ManagerAdapter;
import com.example.fitness2020channelapp.Models.ActivityModel;
import com.example.fitness2020channelapp.Models.FacilityModel;
import com.example.fitness2020channelapp.Models.ManagerModel;
import com.example.fitness2020channelapp.R;

import java.util.ArrayList;

public class ActivitiesFacilitiesActivity extends AppCompatActivity {
    RecyclerView activityRV,facilityRV;
    ActFacAdapter activityAdapter,facilityAdapter;
    ArrayList<ActivityModel> activityModels;
    ArrayList<FacilityModel> facilityModels;
    ImageView addActivityBtn,addFacilitybtn,backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activities_facilities);

        attachID();
        initArrayLists();
        addDummyData();
        setLayoutManagers();
        initAdapter();
        setAdapters();

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void setAdapters() {
        activityRV.setAdapter(activityAdapter);
        activityAdapter.notifyDataSetChanged();

        facilityRV.setAdapter(facilityAdapter);
        facilityAdapter.notifyDataSetChanged();
    }

    private void initAdapter() {
        activityAdapter = new ActFacAdapter(activityModels,facilityModels,ActivitiesFacilitiesActivity.this,0);
        facilityAdapter = new ActFacAdapter(activityModels,facilityModels,ActivitiesFacilitiesActivity.this,1);

    }

    private void setLayoutManagers() {
        activityRV.setLayoutManager(new LinearLayoutManager(ActivitiesFacilitiesActivity.this,LinearLayoutManager.VERTICAL,false));
        facilityRV.setLayoutManager(new LinearLayoutManager(ActivitiesFacilitiesActivity.this,LinearLayoutManager.VERTICAL,false));
    }

    private void addDummyData() {
        for (int i=0;i<4;i++){
            activityModels.add(new ActivityModel("Zumba"));
            facilityModels.add(new FacilityModel("Free sample class"));
        }
    }

    private void initArrayLists() {
        activityModels = new ArrayList<>();
        facilityModels = new ArrayList<>();
    }

    private void attachID() {
        activityRV = findViewById(R.id.actfact_activities_rv);
        facilityRV = findViewById(R.id.actfact_facilities_rv);
        addActivityBtn = findViewById(R.id.activity_add);
        addFacilitybtn = findViewById(R.id.facility_add);
        backBtn = findViewById(R.id.back_btn);
    }
}