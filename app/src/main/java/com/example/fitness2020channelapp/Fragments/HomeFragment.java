package com.example.fitness2020channelapp.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitness2020channelapp.Adapters.BookingsAdapter;
import com.example.fitness2020channelapp.R;
import com.google.android.material.chip.ChipGroup;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    View view;
    Spinner statusSpinner, categorySpinner;
    ChipGroup dates;
    RecyclerView bookingsRV;
    BookingsAdapter bookingsAdapter;
    ArrayList

    public HomeFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.fragment_home,container,false);

        attachID();

        return view;
    }

    private void attachID() {
    }
}
