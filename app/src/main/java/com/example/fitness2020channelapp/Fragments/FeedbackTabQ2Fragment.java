package com.example.fitness2020channelapp.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.fitness2020channelapp.R;


public class FeedbackTabQ2Fragment extends Fragment {

    View view;
    Button next,back;
    RadioGroup referRadioGroup;
    RadioButton selectedBtn;


    public FeedbackTabQ2Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_feedback_tab_q2, container, false);
        attachID();



        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new FeedbackTabQ1Fragment());
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedID = referRadioGroup.getCheckedRadioButtonId();
                selectedBtn = view.findViewById(selectedID);
                Toast.makeText(view.getContext(),selectedBtn.getText(),Toast.LENGTH_SHORT).show();

                loadFragment(new FeedbackTabQ3Fragment());
            }
        });
        return view;
    }


    private void attachID() {
//        next = view.findViewById(R.id.);
//        back = view.findViewById(R.id.);
//        referRadioGroup = view.findViewById(R.id.);

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