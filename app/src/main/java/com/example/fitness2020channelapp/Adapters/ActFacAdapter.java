package com.example.fitness2020channelapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitness2020channelapp.Models.ActivityModel;
import com.example.fitness2020channelapp.Models.FacilityModel;
import com.example.fitness2020channelapp.R;

import java.util.ArrayList;

public class ActFacAdapter extends RecyclerView.Adapter<ActFacAdapter.textVH> {
    ArrayList<ActivityModel> activityModels;
    ArrayList<FacilityModel> facilityModels;
    Context context;
    int code;
    //code 0 for activity
    //code 1 for facility

    public ActFacAdapter(ArrayList<ActivityModel> activityModels, ArrayList<FacilityModel> facilityModels, Context context, int code) {
        this.activityModels = activityModels;
        this.facilityModels = facilityModels;
        this.context = context;
        this.code = code;
    }

    @NonNull
    @Override
    public ActFacAdapter.textVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new textVH(LayoutInflater.from(parent.getContext()).inflate(R.layout.,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ActFacAdapter.textVH holder, int position) {
        if (code == 0){
            holder.populateActivities(activityModels.get(position));
        }
        else {
            holder.populateFacilities(facilityModels.get(position));
        }
    }

    @Override
    public int getItemCount() {
        if (code == 0) {
            return activityModels.size();
        }
        else{
            return facilityModels.size();
        }
    }

    public class textVH extends RecyclerView.ViewHolder {
        TextView activityTV,facilityTV;
        ImageView activityCut,facilityCut;
        public textVH(@NonNull View itemView) {
            super(itemView);
            if (code == 0){
//                activityCut = itemView.findViewById();
//                activityTV = itemView.findViewById();
            }
            else {
//                facilityCut = itemView.findViewById();
//                facilityTV = itemView.findViewById();
            }
        }

        public void populateActivities(ActivityModel activityModel) {
            activityTV.setText(activityModel.getName());
            activityCut.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //delete activity from database and refresh
                }
            });
        }

        public void populateFacilities(FacilityModel facilityModel) {
            facilityTV.setText(facilityModel.getName());
            facilityCut.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //delete facility from backend and refresh
                }
            });
        }
    }
}
