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
        pieChart.getDescription().setEnabled(true);
        pieChart.setExtraOffsets(5,10,5,5);
        pieChart.setDragDecelerationFrictionCoef(0.9f);
        pieChart.setTransparentCircleRadius(61f);
        pieChart.setHoleColor(Color.WHITE);
        ArrayList<PieEntry> yValues = new ArrayList<>();
        yValues.add(new PieEntry(34f,"vouchers"));
        yValues.add(new PieEntry(56f,"webinars"));
        yValues.add(new PieEntry(66f,"bookings"));
        yValues.add(new PieEntry(45f,"events"));

        PieDataSet dataSet = new PieDataSet(yValues, "Disease Per Regions");
                dataSet.setSliceSpace(3f);
        dataSet.setSelectionShift(5f);
        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        PieData pieData = new PieData((dataSet));
        pieData.setValueTextSize(10f);
        pieData.setValueTextColor(Color.YELLOW);
        pieChart.setData(pieData);
    }

    private void attachID() {
//        backBtn = findViewById(R.id.);
        pieChart = findViewById(R.id.analytics_details_piechart_1);
    }
}