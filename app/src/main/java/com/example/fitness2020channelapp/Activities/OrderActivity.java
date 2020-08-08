package com.example.fitness2020channelapp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fitness2020channelapp.Models.OrderDetailModel;
import com.example.fitness2020channelapp.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class OrderActivity extends AppCompatActivity {
    ImageView backBtn;
    TextView nameTV,categoryTV,activityTV,bookingDateTimeTV,groupSizeTV,bookedTimeTV,bookedDateTV,grossAmountTV,taxTV,netAmountTV,commentTV;
    OrderDetailModel order = new OrderDetailModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        attachID();
        getData();
        setData();
    }

    private void setData() {
        nameTV.setText(order.getName());
        categoryTV.setText(order.getCategory());
        activityTV.setText(order.getActivity());
        bookingDateTimeTV.setText(order.getBookingDate()+", "+order.getBookingTime());
        groupSizeTV.setText(Integer.toString(order.getGroupSize()));
        bookedTimeTV.setText(order.getBookedTime());
        bookedDateTV.setText(order.getBookedDate());
        grossAmountTV.setText("₹"+Float.toString(order.getGrossAmount()));
        taxTV.setText("₹"+Float.toString(order.getTaxAmount()));
        netAmountTV.setText("₹"+ Float.toString(order.getNetAmount()));
        commentTV.setText(order.getComment());
    }

    private void getData() {
        order = new OrderDetailModel("Rishabh Singh","Event","Functional Training with Farhan Aktar",
                "21 Jun 2020","14:23",4,"8:00","28 Jun 2020",true,false,2500,70,"7%",2570,"Very important client.");
    }

    private void attachID() {
//        backBtn = findViewById();
//        nameTV = findViewById();
//        categoryTV = findViewById();
//        activityTV = findViewById();
//        bookedDateTV = findViewById();
//        bookedTimeTV = findViewById();
//        bookingDateTimeTV = findViewById();
//        groupSizeTV = findViewById();
//        grossAmountTV = findViewById();
//        taxTV = findViewById();
//        netAmountTV = findViewById();
//        commentTV = findViewById();

    }
}