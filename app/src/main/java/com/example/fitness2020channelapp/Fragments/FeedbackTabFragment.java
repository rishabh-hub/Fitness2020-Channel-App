package com.example.fitness2020channelapp.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.fitness2020channelapp.R;


public class FeedbackTabFragment extends Fragment {

    View view;

    public FeedbackTabFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_feedback_tab, container, false);
        loadFragment(new FeedbackTabQ1Fragment());
        return view;
    }
    public void loadFragment(Fragment fragment)
    {
        getChildFragmentManager().popBackStack();
        FragmentTransaction fragmentTransaction=getChildFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.feedback_frameLayout,fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}