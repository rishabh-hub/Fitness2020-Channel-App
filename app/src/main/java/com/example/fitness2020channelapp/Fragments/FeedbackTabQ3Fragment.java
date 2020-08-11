package com.example.fitness2020channelapp.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.fitness2020channelapp.R;


public class FeedbackTabQ3Fragment extends Fragment {

    View view;
    EditText complaintET;
    Button next,back;
    String complaint;

    public FeedbackTabQ3Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_feedback_tab_q3, container, false);

        attachID();

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new FeedbackTabQ2Fragment());
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(complaintET.getText().toString().isEmpty())
                    complaint = "";
                else
                    complaint = complaintET.getText().toString();

                //save complaint

                loadFragment(new FeedbackTabQ4Fragment());
            }
        });

        return view;
    }

    private void attachID() {
//        next = view.findViewById(R.id.);
//        back = view.findViewById(R.id.);
//        complaintET = view.findViewById(R.id.);
    }

    public void loadFragment(Fragment fragment)
    {
        getChildFragmentManager().popBackStack();
        FragmentTransaction fragmentTransaction=getChildFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.feedback_frag_frame_lay,fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}