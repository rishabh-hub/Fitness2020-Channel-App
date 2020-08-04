package com.example.fitness2020channelapp.Fragments;

import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.fitness2020channelapp.Adapters.OfferingsAdapter;
import com.example.fitness2020channelapp.Adapters.PhotoVideoFragmentAdapter;
import com.example.fitness2020channelapp.Models.OfferingModel;
import com.example.fitness2020channelapp.Models.PhotoModel;
import com.example.fitness2020channelapp.Models.VideoModel;
import com.example.fitness2020channelapp.R;

import java.util.ArrayList;


public class StudioOfferingFragment extends Fragment {

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
        view = inflater.inflate(R.layout.fragment_studio_offering, container, false);

        attachID();
        initArrayLists();
        addDummyData();
        setLayoutManagers();
        initAdapter();
        setAdapters();

        return view;
    }

    private void initArrayLists() {
        offeringModels = new ArrayList<>();

    }

    private void addDummyData() {
        offeringModels.add(new OfferingModel("Daily Subscription","Rs 999","abc",true));
        for (int i=0;i<2;i++)
        {
            offeringModels.add(new OfferingModel("Daily Subscription","Rs 999","abc",false));
        }
    }

    private void setAdapters() {
        offeringsRV.setAdapter(offeringsAdapter);

        offeringsAdapter.notifyDataSetChanged();
    }

    private void initAdapter() {
        offeringsAdapter = new OfferingsAdapter(offeringModels,view.getContext(),0);
    }

    private void setLayoutManagers() {
        offeringsRV.setLayoutManager(new LinearLayoutManager(view.getContext(),LinearLayoutManager.VERTICAL,false));
    }

    private void attachID() {
//        offeringsRV = view.findViewById(R.id.);
//        deleteBtn = view.findViewById(R.id.);
    }
}