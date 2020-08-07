package com.example.fitness2020channelapp.Fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitness2020channelapp.Activities.ReviewsActivity;
import com.example.fitness2020channelapp.Adapters.BookingsAdapter;
import com.example.fitness2020channelapp.Adapters.ReviewAdapter;
import com.example.fitness2020channelapp.Models.BookingModel;
import com.example.fitness2020channelapp.Models.DateModel;
import com.example.fitness2020channelapp.Models.ReviewModel;
import com.example.fitness2020channelapp.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import static android.content.ContentValues.TAG;

public class HomeFragment extends Fragment {

    View view;
    Spinner statusSpinner, categorySpinner;
    ChipGroup dateChips;
    RecyclerView bookingsRV;
    BookingsAdapter bookingsAdapter;
    ArrayList<BookingModel> bookingModels;
    ArrayList<DateModel> dateModels;
    String date;
    String status[]={"Accepted","Denied"};
    String categories[]={"All Categories","Events","Vouchers","Walkins","Live Workout","Studio"};


    public HomeFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.fragment_home,container,false);

        attachID();
        initArrayLists();
        addDummyData();
        setLayoutManagers();
        initAdapter();
        setAdapters();

        initDateChipGroup();

        initSpinners();

        return view;
    }

    private void initSpinners() {
        ArrayAdapter statusAdapter = new ArrayAdapter(view.getContext(),android.R.layout.simple_spinner_dropdown_item,status);
        statusAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        statusSpinner.setAdapter(statusAdapter);
        statusSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter categoryAdapter = new ArrayAdapter(view.getContext(),android.R.layout.simple_spinner_dropdown_item,categories);
        categoryAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        categorySpinner.setAdapter(statusAdapter);
        categorySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void initDateChipGroup() {
        dateModels = new ArrayList<>();
        dateChips.isSingleSelection();
        Date c = Calendar.getInstance().getTime();
        for (int i = 0;i<10;i++)
        {
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
            cal.add(Calendar.DAY_OF_YEAR, i);
            date = s.format(new Date(cal.getTimeInMillis()));

            Log.i(TAG, "onCreate:  "+date);
            Chip chip=new Chip(dateChips.getContext());
            chip.setText(date);
            dateChips.addView(chip);
        }
    }

    private void attachID() {
//        statusSpinner = view.findViewById();
//        categorySpinner = view.findViewById();
//        bookingsRV = view.findViewById();
//        dateChips = view.findViewById();
    }

    private void setAdapters() {
        bookingsRV.setAdapter(bookingsAdapter);
        bookingsAdapter.notifyDataSetChanged();
    }

    private void initAdapter() {
        bookingsAdapter = new BookingsAdapter(bookingModels, getContext());
    }

    private void setLayoutManagers() {
        bookingsRV.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
    }

    private void addDummyData() {
        bookingModels.add(new BookingModel("Ayush Sharma",
                4,
                "15:56",
                "Events",
                "Yoga training live with Abhishek Bhaskar",
                true,
                false,
                "9876543210",
                "₹999"));
        bookingModels.add(new BookingModel("Paritosh Varshney",
                4,
                "15:56",
                "Vouchers",
                "Yoga training live with Abhishek Bhaskar",
                true,
                true,
                "9876543210",
                "₹999"));
        for (int i=0;i<5;i++)
            bookingModels.add(new BookingModel("Rishabh Singh",
                    4,
                    "15:56",
                    "Live Workouts",
                    "Yoga training live with Abhishek Bhaskar",
                    false,
                    false,
                    "9876543210",
                    "₹999"));
    }

    private void initArrayLists() {
        bookingModels = new ArrayList<>();
    }


}
