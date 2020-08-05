package com.example.fitness2020channelapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitness2020channelapp.Models.OfferingSlotModel;
import com.example.fitness2020channelapp.R;

import java.util.ArrayList;

public class OfferingScheduleAdapter extends RecyclerView.Adapter<OfferingScheduleAdapter.ScheduleVH> {
    
    ArrayList<OfferingSlotModel> slots;
    Context context;

    public OfferingScheduleAdapter(ArrayList<OfferingSlotModel> slots, Context context) {
        this.slots = slots;
        this.context = context;
    }

    @NonNull
    @Override
    public OfferingScheduleAdapter.ScheduleVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ScheduleVH(LayoutInflater.from(parent.getContext()).inflate(R.layout.schedule_slot_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull OfferingScheduleAdapter.ScheduleVH holder, int position) {
        holder.populateDay(slots.get(position));
    }

    @Override
    public int getItemCount() {
        return slots.size();
    }

    public class ScheduleVH extends RecyclerView.ViewHolder {
        public ScheduleVH(@NonNull View itemView) {
            super(itemView);
        }

        public void populateDay(OfferingSlotModel offeringSlotModel) {
        }
    }
}
