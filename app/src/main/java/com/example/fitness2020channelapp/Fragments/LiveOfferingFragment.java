package com.example.fitness2020channelapp.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitness2020channelapp.Adapters.OfferingsAdapter;
import com.example.fitness2020channelapp.Models.OfferingModel;
import com.example.fitness2020channelapp.R;

import java.util.ArrayList;


public class LiveOfferingFragment extends Fragment {

    View view;
    Button deleteBtn;
    RecyclerView offeringsRV;
    OfferingsAdapter offeringsAdapter;
    ArrayList<OfferingModel> offeringModels;
//    code = 0

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_live_offering, container, false);

        attachID();
        initArrayLists();
        addDummyData();
        setLayoutManagers();
        initAdapter();
        setAdapters();

        deleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //do deletion via api
            }
        });

        return view;
    }

    private void initArrayLists() {
        offeringModels = new ArrayList<>();

    }

    private void addDummyData() {
        offeringModels.add(new OfferingModel("Daily Subscription","₹ 999","abc",true));
        for (int i=0;i<2;i++)
        {
            offeringModels.add(new OfferingModel("Daily Subscription","₹ 999","abc",false));
        }
    }

    private void setAdapters() {
        offeringsRV.setAdapter(offeringsAdapter);

        offeringsAdapter.notifyDataSetChanged();
    }

    private void initAdapter() {
        offeringsAdapter = new OfferingsAdapter(offeringModels,view.getContext(),1);
    }

    private void setLayoutManagers() {
        offeringsRV.setLayoutManager(new LinearLayoutManager(view.getContext(),LinearLayoutManager.VERTICAL,false));
    }

    private void attachID() {
        offeringsRV = view.findViewById(R.id.offering_live_rv);
        deleteBtn = view.findViewById(R.id.offering_live_delete_btn);
    }
}