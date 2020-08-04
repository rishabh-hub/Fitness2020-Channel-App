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
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.fitness2020channelapp.Adapters.OfferingsAdapter;
import com.example.fitness2020channelapp.Adapters.PhotoVideoFragmentAdapter;
import com.example.fitness2020channelapp.Models.OfferingModel;
import com.example.fitness2020channelapp.Models.PhotoModel;
import com.example.fitness2020channelapp.Models.VideoModel;
import com.example.fitness2020channelapp.R;

import java.util.ArrayList;


public class StudioOfferingFragment extends Fragment {

    View view;
    Spinner studioOfferingSpinner;
    Button deleteBtn;
    RecyclerView offeringsRV;
    OfferingsAdapter offeringsAdapter;
    ArrayList<OfferingModel> offeringModels;
    String[] activities={"Zumba","Functional Training","Gym","Yoga","Aerobics","Gymnastics"};

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

        initSpinner();

        deleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //do deletion via api
            }
        });

        return view;
    }

    private void initSpinner() {
        ArrayAdapter subjectAdapter = new ArrayAdapter(getContext(),android.R.layout.simple_spinner_dropdown_item,activities);
        subjectAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        studioOfferingSpinner.setAdapter(subjectAdapter);
        studioOfferingSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
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
        offeringsAdapter = new OfferingsAdapter(offeringModels,view.getContext(),0);
    }

    private void setLayoutManagers() {
        offeringsRV.setLayoutManager(new LinearLayoutManager(view.getContext(),LinearLayoutManager.VERTICAL,false));
    }

    private void attachID() {
        offeringsRV = view.findViewById(R.id.offering_studio_rv);
        deleteBtn = view.findViewById(R.id.offering_studio_delete_btn);
        studioOfferingSpinner = view.findViewById(R.id.offering_studio_spinner);
    }


}