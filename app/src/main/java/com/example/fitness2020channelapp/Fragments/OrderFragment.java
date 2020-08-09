package com.example.fitness2020channelapp.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitness2020channelapp.Activities.ManagerActivity;
import com.example.fitness2020channelapp.Adapters.ManagerAdapter;
import com.example.fitness2020channelapp.Adapters.PastOrdersAdapter;
import com.example.fitness2020channelapp.Models.ManagerModel;
import com.example.fitness2020channelapp.Models.PastOrderModel;
import com.example.fitness2020channelapp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class OrderFragment extends Fragment {

    View view;
    FloatingActionButton downloadBtn;
    RecyclerView pastOrderRV;
    PastOrdersAdapter ordersAdapter;
    ArrayList<PastOrderModel> pastOrderModels;

    public OrderFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.fragment_order,container,false);

        attachID();
        initArrayLists();
        addDummyData();
        setLayoutManagers();
        initAdapter();
        setAdapters();

        downloadBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //download the details in excel format
            }
        });

        return view;
    }

    private void setAdapters() {
        pastOrderRV.setAdapter(ordersAdapter);
        ordersAdapter.notifyDataSetChanged();
    }

    private void initAdapter() {
        ordersAdapter = new PastOrdersAdapter(pastOrderModels, view.getContext());
    }

    private void setLayoutManagers() {
        pastOrderRV.setLayoutManager(new LinearLayoutManager(view.getContext(),LinearLayoutManager.VERTICAL,false));
    }

    private void addDummyData() {
        for (int i=0;i<10;i++)
            pastOrderModels.add(new PastOrderModel("Rohan Joshi",1400,"21/05/2020","Webinar"));
    }

    private void initArrayLists() {
        pastOrderModels = new ArrayList<>();
    }

    private void attachID() {
        pastOrderRV = view.findViewById(R.id.order_fragment_rv);
        downloadBtn = view.findViewById(R.id.order_fragment_download_fab);
    }
}
