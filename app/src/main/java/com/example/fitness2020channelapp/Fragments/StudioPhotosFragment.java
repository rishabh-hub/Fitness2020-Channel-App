package com.example.fitness2020channelapp.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fitness2020channelapp.R;


public class StudioPhotosFragment extends Fragment {

    View view;
    RecyclerView photoGridRV,videoGridRV;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_studio_photos, container, false);
        attachID();
        addDummyData();
        setLayoutManagers();
        initAdapter();
        setAdapters();


        return view;
    }
    private void addDummyData() {
        for (int i=0;i<6;i++)
        {

        }
    }

    private void setAdapters() {

    }

    private void initAdapter() {

    }

    private void setLayoutManagers() {

    }

    private void attachID() {

    }
}