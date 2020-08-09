package com.example.fitness2020channelapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitness2020channelapp.Models.PastOrderModel;
import com.example.fitness2020channelapp.R;

import java.util.ArrayList;

public class PastOrdersAdapter extends RecyclerView.Adapter<PastOrdersAdapter.pastOrderVH>{
    ArrayList<PastOrderModel> pastOrderModels;
    Context context;

    public PastOrdersAdapter(ArrayList<PastOrderModel> pastOrderModels, Context context) {
        this.pastOrderModels = pastOrderModels;
        this.context = context;
    }

    @NonNull
    @Override
    public PastOrdersAdapter.pastOrderVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new pastOrderVH(LayoutInflater.from(parent.getContext()).inflate(R.layout.,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull PastOrdersAdapter.pastOrderVH holder, int position) {
        holder.populatePastOrders(pastOrderModels.get(position));
    }

    @Override
    public int getItemCount() {
        return pastOrderModels.size();
    }

    public class pastOrderVH extends RecyclerView.ViewHolder {
        TextView
        public pastOrderVH(@NonNull View itemView) {
            super(itemView);
        }

        public void populatePastOrders(PastOrderModel pastOrderModel) {
        }
    }
}
