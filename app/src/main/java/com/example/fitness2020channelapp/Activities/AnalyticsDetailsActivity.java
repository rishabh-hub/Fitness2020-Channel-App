package com.example.fitness2020channelapp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.fitness2020channelapp.R;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class AnalyticsDetailsActivity extends AppCompatActivity {

    ImageView backBtn;
    Spinner monthSlotSpinner;
    PieChart pieChart;
    TextView totalUsers,estimatedRevenue,visits,voucherVisits,voucherRevenue,eventsVisits,eventsRevenue,webinarVisits,webinarRevenue,bookingsVisits,bookingsRevenue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analytics_details);

        attachID();
        setPieChart();

    }

    private void setPieChart() {
//        this.pieChart = pieChart;
        pieChart.setUsePercentValues(true);
        pieChart.getDescription().setEnabled(false);
//        pieChart.setExtraOffsets(15,10,15,15);
        pieChart.setDragDecelerationFrictionCoef(0.9f);
        pieChart.setCenterText("Rs 78650\nby 113,456 visits");
        pieChart.setEntryLabelTextSize(10f);
//        pieChart.setTransparentCircleRadius(61f);
        pieChart.setHoleColor(Color.WHITE);
        ArrayList<PieEntry> yValues = new ArrayList<>();
        yValues.add(new PieEntry(34f,"vouchers"));
        yValues.add(new PieEntry(45f,"events"));
        yValues.add(new PieEntry(56f,"webinars"));
        yValues.add(new PieEntry(66f,"bookings"));
        yValues.add(new PieEntry(45f,"B2B orders"));

        int[] colors = {
                Color.rgb(140, 140, 140) ,Color.rgb(79, 125, 167), Color.rgb(110, 187, 253), Color.rgb(0, 114, 209),
                Color.rgb(0, 52, 100)
        };


        PieDataSet dataSet = new PieDataSet(yValues,"");
                dataSet.setSliceSpace(3f);
        dataSet.setSelectionShift(2f);
        dataSet.setColors(colors);
        PieData pieData = new PieData((dataSet));
        pieData.setValueTextSize(10f);
        pieData.setValueTextColor(Color.WHITE);

        pieChart.setData(pieData);
    }

    private void attachID() {
//        backBtn = findViewById(R.id.);
        pieChart = findViewById(R.id.analytics_details_piechart_1);
    }
}