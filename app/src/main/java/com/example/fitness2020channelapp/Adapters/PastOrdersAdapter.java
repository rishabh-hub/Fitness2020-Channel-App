package com.example.fitness2020channelapp.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitness2020channelapp.Activities.OrderActivity;
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
        return new pastOrderVH(LayoutInflater.from(parent.getContext()).inflate(R.layout.order_fragment_rv_item,parent,false));
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
        TextView name,price,date,activity;
        LinearLayout viewDetailBtn;
        public pastOrderVH(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.order_fragment_name);
            price = itemView.findViewById(R.id.order_fragment_item_price);
            date = itemView.findViewById(R.id.order_fragment_date);
            activity = itemView.findViewById(R.id.order_fragment_activity);
            viewDetailBtn = itemView.findViewById(R.id.order_fragment_more_button);
        }

        public void populatePastOrders(PastOrderModel pastOrderModel) {
            name.setText(pastOrderModel.getName());
            price.setText("₹"+Float.toString(pastOrderModel.getPrice()));
            date.setText(pastOrderModel.getDate());
            activity.setText(pastOrderModel.getActivity());
            viewDetailBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), OrderActivity.class);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
