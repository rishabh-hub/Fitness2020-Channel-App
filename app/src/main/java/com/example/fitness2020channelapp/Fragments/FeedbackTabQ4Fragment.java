package com.example.fitness2020channelapp.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.fitness2020channelapp.R;
import com.google.android.material.snackbar.Snackbar;


public class FeedbackTabQ4Fragment extends Fragment {

    View view;
    EditText commentsET;
    Button submit,back;
    String comment;

    public FeedbackTabQ4Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_feedback_tab_q4, container, false);

        attachID();

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new FeedbackTabQ3Fragment());
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(commentsET.getText().toString().isEmpty())
                    comment = "";
                else
                    comment = commentsET.getText().toString();

                //save comment
                //here

//                Toast.makeText(view.getContext(),"Form is Submitted successfully",Toast.LENGTH_LONG).show();
                Snackbar.make(view.getRootView(),"Form Submitted Successfully",Snackbar.LENGTH_SHORT).show();

                //submit data
                //here

                loadFragment(new FeedbackTabQ1Fragment());
            }
        });

        return view;
    }

    private void attachID() {
        submit = view.findViewById(R.id.feedback_frag_comments_next_btn);
        back = view.findViewById(R.id.feedback_frag_comments_back_btn);
        commentsET = view.findViewById(R.id.feedback_frag_comments_et);
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