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
    String source = new String();


    public FeedbackTabQ2Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_feedback_tab_q2, container, false);
        attachID();

        referRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                selectedBtn = view.findViewById(checkedId);
                source = selectedBtn.getText().toString();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new FeedbackTabQ1Fragment());
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Toast.makeText(view.getContext(),source,Toast.LENGTH_SHORT).show();

                loadFragment(new FeedbackTabQ3Fragment());
            }
        });
        return view;
    }


    private void attachID() {
        next = view.findViewById(R.id.feedback_frag_referred_next_btn);
        back = view.findViewById(R.id.feedback_frag_referred_back_btn);
        referRadioGroup = view.findViewById(R.id.feedback_frag_radio_group);

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