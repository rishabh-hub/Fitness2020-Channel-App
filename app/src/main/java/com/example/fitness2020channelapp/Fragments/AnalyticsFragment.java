package com.example.fitness2020channelapp.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.fitness2020channelapp.Activities.AnalyticsDetailsActivity;
import com.example.fitness2020channelapp.R;

public class AnalyticsFragment extends Fragment {

    View view;
    TextView lastMonthRevenue,currentRevenue,lastMonthName,currentVisits,pageViewCount,directionReqCount,checkinCount,bookmarkCount;
    RelativeLayout analyticsDetailBtn,newCampaignBtn;
    Spinner monthSlotSpinner;
    String[] months = {"Tue 19 Jan ‘20 - Thu 18 Feb ‘20","Tue 19 Feb ‘20 - Thu 18 Dec ‘20",
            "Tue 19 Jan ‘20 - Thu 18 Feb ‘20","Tue 19 Jan ‘20 - Thu 18 Feb ‘20","Tue 19 Jan ‘20 - Thu 18 Feb ‘20","Tue 19 Jan ‘20 - Thu 18 Feb ‘20"};

    public AnalyticsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.fragment_analytics,container,false);

        attachID();
        initSpinner();

        analyticsDetailBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(view.getContext(), AnalyticsDetailsActivity.class);
                view.getContext().startActivity(intent);
            }
        });

        newCampaignBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //do start campaign thing
            }
        });

        return view;
    }

    private void initSpinner() {
        ArrayAdapter monthAdapter = new ArrayAdapter(view.getContext(),android.R.layout.simple_spinner_dropdown_item,months);
        monthAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        monthSlotSpinner.setAdapter(monthAdapter);
        monthSlotSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void attachID() {
        lastMonthName = view.findViewById(R.id.analytics_frag_last_month);
        lastMonthRevenue = view.findViewById(R.id.analytics_fragment_last_amount);
        currentRevenue = view.findViewById(R.id.analytics_fragment_this_amount);
        currentVisits = view.findViewById(R.id.analytics_fragment_current_visits);
        pageViewCount = view.findViewById(R.id.analytics_frag_view_count);
        directionReqCount = view.findViewById(R.id.analytics_frag_dirreq_count);
        checkinCount = view.findViewById(R.id.analytics_frag_checkin_count);
        bookmarkCount = view.findViewById(R.id.analytics_frag_bookmark_count);
        analyticsDetailBtn = view.findViewById(R.id.analytics_fragment_card);
        newCampaignBtn = view.findViewById(R.id.analytics_frag_new_campaign);
        monthSlotSpinner = view.findViewById(R.id.analytics_fragment_date_spinner);

    }
}
