package com.example.fitness2020channelapp.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitness2020channelapp.Activities.OfferingScheduleActivity;
import com.example.fitness2020channelapp.Models.ManagerModel;
import com.example.fitness2020channelapp.Models.OfferingModel;
import com.example.fitness2020channelapp.R;

import java.util.ArrayList;

public class OfferingsAdapter extends RecyclerView.Adapter<OfferingsAdapter.OfferingVH> {

    ArrayList<OfferingModel> offerings;
    Context context;;
    int code;

    public OfferingsAdapter(ArrayList<OfferingModel> offerings, Context context,int code) {
        this.offerings = offerings;
        this.context = context;
        this.code = code;
    }

    @NonNull
    @Override
    public OfferingsAdapter.OfferingVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        return new OfferingVH(LayoutInflater.from(parent.getContext()).inflate(R.layout.offering_rv_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull OfferingVH holder, int position) {
        holder.populateOfferings(offerings.get(position));
    }

    @Override
    public int getItemCount() {
        return offerings.size();
    }


    public class OfferingVH extends RecyclerView.ViewHolder {
        TextView offeringName;
        TextView offeringPrice;
        ImageView dailyScheduleBtn;

        public OfferingVH(@NonNull View itemView) {
            super(itemView);
//            offeringName = itemView.findViewById();
//            offeringPrice = itemView.findViewById();
//            dailyScheduleBtn = itemView.findViewById();
        }

        public void populateOfferings(OfferingModel offeringModel) {
            offeringName.setText(offeringModel.getOfferingName());
            offeringPrice.setText(offeringModel.getAmount());
            if(offeringModel.getDaily())
            {
                dailyScheduleBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(itemView.getContext(), OfferingScheduleActivity.class);
                        itemView.getContext().startActivity(intent);
                    }
                });
            }
            else dailyScheduleBtn.setVisibility(View.GONE);
        }
    }
}
