package com.example.fitness2020channelapp.Fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.fitness2020channelapp.R;
import com.hsalf.smileyrating.SmileyRating;


public class FeedbackTabQ1Fragment extends Fragment {

    View view;
    SmileyRating serviceRating,trainingRating,amenitiesRating,overallRating;
    int serviceRate,trainingRate,amenitiesRate,overallRate,tempRate;
    Button next;
    public FeedbackTabQ1Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_feedback_tab_q1, container, false);

        attachID();



        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                serviceRate = getRating(serviceRating);
                trainingRate = getRating(trainingRating);
                amenitiesRate = getRating(amenitiesRating);
                overallRate = getRating(overallRating);

                loadFragment(new FeedbackTabQ2Fragment());
            }
        });



        return view;
    }

    private void attachID() {
        next = view.findViewById(R.id.feedback_frag_services_next_btn);
        serviceRating = view.findViewById(R.id.smile_rating_services);
        trainingRating = view.findViewById(R.id.smile_rating_training);
        amenitiesRating = view.findViewById(R.id.smile_rating_amenities);
        overallRating = view.findViewById(R.id.smile_rating_overall);
    }

    private int getRating(SmileyRating rating) {
        rating.setSmileySelectedListener(new SmileyRating.OnSmileySelectedListener() {
            @Override
            public void onSmileySelected(SmileyRating.Type type) {
                tempRate = type.getRating();
                Toast.makeText(view.getContext(),Integer.toString(tempRate),Toast.LENGTH_SHORT).show();
            }
        });

        return tempRate;
    }

    public void loadFragment(Fragment fragment)
    {
        getFragmentManager().popBackStack();
        FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.feedback_frag_frame_lay,fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}