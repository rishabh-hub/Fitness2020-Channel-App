package com.example.fitness2020channelapp.Fragments;

import android.app.DatePickerDialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.fitness2020channelapp.R;
import com.google.android.material.textfield.TextInputLayout;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;


public class CheckinTabFragment extends Fragment {

    View view;
    EditText nameET,mobileNOET,emailIDET,dobET,anniversaryET;
    TextInputLayout dobCal,anniversaryCal;
    Button submitBtn;
    Calendar calendar=Calendar.getInstance();


    public CheckinTabFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_checkin_tab, container, false);

        attachID();
        
        getDates();

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkFields();
            }
        });

        return view;
    }

    private void getDates() {
        final DatePickerDialog.OnDateSetListener dateOfBirth = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                // TODO Auto-generated method stub
                calendar.set(Calendar.YEAR, year);
                calendar.set(Calendar.MONTH, monthOfYear);
                calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateDOB();
            }

        };

        final DatePickerDialog.OnDateSetListener anniversary = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                // TODO Auto-generated method stub
                calendar.set(Calendar.YEAR, year);
                calendar.set(Calendar.MONTH, monthOfYear);
                calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateAnniversary();
            }

        };

        dobCal.setEndIconOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(view.getContext(), dateOfBirth, calendar
                        .get(Calendar.YEAR), calendar.get(Calendar.MONTH),
                        calendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });

        anniversaryCal.setEndIconOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(view.getContext(), anniversary, calendar
                        .get(Calendar.YEAR), calendar.get(Calendar.MONTH),
                        calendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });

    }

    private void checkFields() {
        if(nameET.getText().toString().isEmpty())
        {
            nameET.setError("Kindly enter name");
            nameET.requestFocus();
        }
        if(mobileNOET.getText().toString().isEmpty())
        {
            mobileNOET.setError("Kindly enter mobile number");
            mobileNOET.requestFocus();
        }
        if(emailIDET.getText().toString().isEmpty())
        {
            emailIDET.setError("Kindly enter email");
            emailIDET.requestFocus();
        }
        if(anniversaryET.getText().toString().isEmpty())
        {
            anniversaryET.setError("Kindly enter anniversary date");
            anniversaryET.requestFocus();
        }
        if(dobET.getText().toString().isEmpty())
        {
            dobET.setError("Kindly enter date of birth");
            dobET.requestFocus();
        }
        if(mobileNOET.getText().toString().length()!=13)
        {
            mobileNOET.setError("Enter valid mobile number");
            mobileNOET.requestFocus();
        }
        if (!isEmailValid(emailIDET.getText().toString()))
        {
            emailIDET.setError("Enter valid email");
            emailIDET.requestFocus();
        }
        if (nameET.getError()==null && mobileNOET.getError()==null && emailIDET.getError()==null && dobET.getError()==null && anniversaryET.getError()==null)
        {
            submitData(nameET.getText().toString(),mobileNOET.getText().toString(),emailIDET.getText().toString(),dobET.getText().toString(),anniversaryET.getText().toString());
        }
    }

    private void submitData(String name, String mobNo, String email, String dob, String anniversary) {
    }

    private void updateAnniversary() {
        String myFormat = "dd/MM/yyyy"; //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

        anniversaryET.setText(sdf.format(calendar.getTime()));
    }

    private void updateDOB() {
        String myFormat = "dd/MM/yyyy"; //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

        dobET.setText(sdf.format(calendar.getTime()));
    }
    boolean isEmailValid(CharSequence email) {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    private void attachID() {
//        nameET = view.findViewById(R.id.);
//        mobileNOET = view.findViewById(R.id.);
//        emailIDET = view.findViewById(R.id.);
//        dobET = view.findViewById(R.id.);
//        anniversaryET = view.findViewById(R.id.);
//        submitBtn = view.findViewById(R.id.);
//        dobCal = view.findViewById(R.id.);
//        anniversaryCal = view.findViewById(R.id.):
    }
}