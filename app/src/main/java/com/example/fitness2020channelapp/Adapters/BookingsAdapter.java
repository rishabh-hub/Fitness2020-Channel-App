package com.example.fitness2020channelapp.Adapters;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitness2020channelapp.Activities.OrderActivity;
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
        return new bookingVH(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_fragment_booking_rv_item,parent,false));
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
            name = itemView.findViewById(R.id.home_fragment_rv_item_name);
            groupSize = itemView.findViewById(R.id.home_fragment_rv_item_group);
            time = itemView.findViewById(R.id.home_fragment_rv_item_time);
            category = itemView.findViewById(R.id.home_fragment_rv_item_category);
            details = itemView.findViewById(R.id.home_fragment_rv_item_for);          //details will come here
            detailsTV = itemView.findViewById(R.id.home_fragment_rv_item_for_tv);        //text view before details
            price = itemView.findViewById(R.id.home_fragment_rv_item_price);
            redeemCode = itemView.findViewById(R.id.home_fragment_rv_item_redeem);
            viewDetailsBtn = itemView.findViewById(R.id.home_fragment_rv_item_details);
            callBtn = itemView.findViewById(R.id.home_fragment_rv_item_call);
            hasComment = itemView.findViewById(R.id.home_fragment_rv_item_comment);
        }

        public void populateBookings(BookingModel bookingModel) {
            name.setText(bookingModel.getName());
            groupSize.setText(Integer.toString(bookingModel.getGroupSize()));
            time.setText(bookingModel.getTime());
            category.setText(bookingModel.getCategory());
            details.setText(bookingModel.getDetail());
            price.setText(bookingModel.getPrice());

            viewDetailsBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //go to internal page
                    Intent intent = new Intent(itemView.getContext(), OrderActivity.class);
                    itemView.getContext().startActivity(intent);
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

            if(bookingModel.getCategory().equals("Events") || bookingModel.getCategory().equals("Vouchers"))
                detailsTV.setText("For:");
            else detailsTV.setText("Activity:");
        }

    }
}
