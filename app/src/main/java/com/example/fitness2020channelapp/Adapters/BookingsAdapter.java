package com.example.fitness2020channelapp.Adapters;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitness2020channelapp.Models.BookingModel;
import com.example.fitness2020channelapp.R;

import java.util.ArrayList;

public class BookingsAdapter extends RecyclerView.Adapter<BookingsAdapter.bookingVH> {
    ArrayList<BookingModel> bookingModels;
    Context context;

    public BookingsAdapter(ArrayList<BookingModel> bookingModels, Context context) {
        this.bookingModels = bookingModels;
        this.context = context;
    }

    @NonNull
    @Override
    public BookingsAdapter.bookingVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new bookingVH(LayoutInflater.from(parent.getContext()).inflate(R.layout.,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull BookingsAdapter.bookingVH holder, int position) {
        holder.populateBookings(bookingModels.get(position));
    }

    @Override
    public int getItemCount() {
        return bookingModels.size();
    }

    public class bookingVH extends RecyclerView.ViewHolder {
        TextView name,groupSize,time,category, details,detailsTV,price,redeemCode,viewDetailsBtn;
        ImageView callBtn,hasComment;
        public bookingVH(@NonNull View itemView) {
            super(itemView);
//            name = itemView.findViewById();
//            groupSize = itemView.findViewById();
//            time = itemView.findViewById();
//            category = itemView.findViewById();
//            details = itemView.findViewById();          //details will come here
//            detailsTV = itemView.findViewById();        //text view before details
//            price = itemView.findViewById();
//            redeemCode = itemView.findViewById();
//            viewDetailsBtn = itemView.findViewById();
//            callBtn = itemView.findViewById();
//            hasComment = itemView.findViewById();
        }

        public void populateBookings(BookingModel bookingModel) {
            name.setText(bookingModel.getName());
            groupSize.setText(bookingModel.getGroupSize());
            time.setText(bookingModel.getTime());
            category.setText(bookingModel.getCategory());
            details.setText(bookingModel.getDetail());
            price.setText(bookingModel.getPrice());

            viewDetailsBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //go to internal page
                }
            });

            if(bookingModel.isHasComment())
                hasComment.setImageTintList(ColorStateList.valueOf(itemView.getContext().getResources().getColor(R.color.primaryBlue)));
            else
                hasComment.setImageTintList(ColorStateList.valueOf(itemView.getContext().getResources().getColor(R.color.lightBlue)));

            if (bookingModel.isHasRedeemCode())
                redeemCode.setVisibility(View.VISIBLE);
            else
                redeemCode.setVisibility(View.GONE);
        }

    }
}
