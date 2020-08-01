package com.example.fitness2020channelapp.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.fitness2020channelapp.Adapters.ManagerAdapter;
import com.example.fitness2020channelapp.Models.ManagerModel;
import com.example.fitness2020channelapp.R;

import java.util.ArrayList;

public class ManagerActivity extends AppCompatActivity {

    RecyclerView managerRV;
    ManagerAdapter managerAdapter;
    ArrayList<ManagerModel> managerModels;
    ImageView backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager);

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
        managerRV.setAdapter(managerAdapter);
        managerAdapter.notifyDataSetChanged();
    }

    private void initAdapter() {
        managerAdapter = new ManagerAdapter(managerModels,ManagerActivity.this);
    }

    private void setLayoutManagers() {
        managerRV.setLayoutManager(new LinearLayoutManager(ManagerActivity.this,LinearLayoutManager.VERTICAL,false));
    }

    private void addDummyData() {
        for (int i=0;i<4;i++)
            managerModels.add(new ManagerModel("Rohan Joshi","rohan@joshi.com","+91 9876123847"));
    }

    private void initArrayLists() {
        managerModels = new ArrayList<>();
    }

    private void attachID() {
        managerRV = findViewById(R.id.managers_rv);
        backBtn = findViewById(R.id.back_btn);
    }

}