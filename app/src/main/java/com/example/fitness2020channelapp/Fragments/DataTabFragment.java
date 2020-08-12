package com.example.fitness2020channelapp.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitness2020channelapp.Activities.ManagerActivity;
import com.example.fitness2020channelapp.Adapters.FeedbackDataAdapter;
import com.example.fitness2020channelapp.Adapters.ManagerAdapter;
import com.example.fitness2020channelapp.Models.FeedbackDataModel;
import com.example.fitness2020channelapp.Models.ManagerModel;
import com.example.fitness2020channelapp.R;

import java.util.ArrayList;


public class DataTabFragment extends Fragment {

    View view;
    RecyclerView dataRV;
    FeedbackDataAdapter feedbackDataAdapter;
    ArrayList<FeedbackDataModel> feedbackData;
    Spinner feedBackSpinner;
    String[] dates = {"2 jun","3 jun","4 jun","5 jun"};

    public DataTabFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_data_tab, container, false);

        attachID();
        initArrayLists();
        addDummyData();
        setLayoutManagers();
        initAdapter();
        setAdapters();

        initSpinner();

        return view;
    }

    private void setAdapters() {
        dataRV.setAdapter(feedbackDataAdapter);
        feedbackDataAdapter.notifyDataSetChanged();
    }

    private void initAdapter() {
        feedbackDataAdapter = new FeedbackDataAdapter(feedbackData, view.getContext());
    }

    private void setLayoutManagers() {
        dataRV.setLayoutManager(new LinearLayoutManager(view.getContext(),LinearLayoutManager.VERTICAL,false));
    }

    private void addDummyData() {
        for (int i=0;i<12;i++)
            feedbackData.add(new FeedbackDataModel("Rishabh Singh",4));
    }

    private void initArrayLists() {
        feedbackData = new ArrayList<>();
    }

    private void attachID() {
        dataRV = view.findViewById(R.id.feedback_data_rv);
        feedBackSpinner = view.findViewById(R.id.feedback_data_frag_date_spinner);
    }

    private void initSpinner() {
        ArrayAdapter datesAdapter = new ArrayAdapter(view.getContext(),android.R.layout.simple_spinner_dropdown_item,dates);
        datesAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        feedBackSpinner.setAdapter(datesAdapter);
        feedBackSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}