package com.example.fitness2020channelapp.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.fitness2020channelapp.Activities.ActivitiesFacilitiesActivity;
import com.example.fitness2020channelapp.Activities.EventsActivity;
import com.example.fitness2020channelapp.Activities.InfoActivity;
import com.example.fitness2020channelapp.Activities.ManagerActivity;
import com.example.fitness2020channelapp.Activities.OfferingsActivity;
import com.example.fitness2020channelapp.Activities.PhotoVideoActivity;
import com.example.fitness2020channelapp.Activities.ReviewsActivity;
import com.example.fitness2020channelapp.Activities.VouchersActivity;
import com.example.fitness2020channelapp.R;

public class ListingFragment extends Fragment {

    View view;
    CardView photoCard,managerCard,infoCard,offeringsCard,activitiesCard,voucherCard,reviewCard,eventsCard;
    TextView centerName,centerRating,hasSubscription;

    public ListingFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.fragmetn_listing,container,false);

        attachID();
//        cardClickListener();


        return view;
    }

    private void attachID() {
        photoCard = view.findViewById(R.id.cardvw_pho_vid);
        managerCard = view.findViewById(R.id.cardvw_managers);
        infoCard = view.findViewById(R.id.cardvw_information);
        activitiesCard = view.findViewById(R.id.cardvw_act_fac);
        offeringsCard = view.findViewById(R.id.cardvw_offerings);
        voucherCard = view.findViewById(R.id.cardvw_vou_pro);
        eventsCard = view.findViewById(R.id.cardvw_events);
        reviewCard = view.findViewById(R.id.cardvw_reviews);
        centerName = view.findViewById(R.id.listing_name);
        centerRating = view.findViewById(R.id.rating);
        hasSubscription = view.findViewById(R.id.listing_subscription);
    }

    private void cardClickListener() {
        photoCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(view.getContext(), PhotoVideoActivity.class);
                view.getContext().startActivity(intent);
            }
        });
        managerCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(view.getContext(), ManagerActivity.class);
                view.getContext().startActivity(intent);
            }
        });
        infoCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(view.getContext(), InfoActivity.class);
                view.getContext().startActivity(intent);
            }
        });
        activitiesCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(view.getContext(), ActivitiesFacilitiesActivity.class);
                view.getContext().startActivity(intent);
            }
        });
        offeringsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(view.getContext(), OfferingsActivity.class);
                view.getContext().startActivity(intent);
            }
        });
        voucherCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(view.getContext(), VouchersActivity.class);
                view.getContext().startActivity(intent);
            }
        });
        reviewCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(view.getContext(), ReviewsActivity.class);
                view.getContext().startActivity(intent);
            }
        });
        eventsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(view.getContext(), EventsActivity.class);
                view.getContext().startActivity(intent);
            }
        });
    }
}
