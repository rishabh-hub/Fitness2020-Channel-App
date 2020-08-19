package com.example.fitness2020channelapp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.fitness2020channelapp.R;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class AnalyticsDetailsActivity extends AppCompatActivity {

    ImageView backBtn;
    Spinner monthSlotSpinner;
    PieChart pieChart,loyaltyPie,servicePie,trainingPie,amenitiesPie,sourceDivisionPie;
    LineChart bookingFrequencyLneChart;
    BarChart ageFrequencyBarChart;
    TextView totalUsers,estimatedRevenue,visits,voucherVisits,voucherRevenue,
            eventsVisits,eventsRevenue,webinarVisits,webinarRevenue,bookingsVisits,
            bookingsRevenue,b2bVisits,b2bRevenue,existingUsers,existingUsersVisited,newUsers,newUsersIntake;
    String[] months = {"Tue 19 Jan ‘20 - Thu 18 Feb ‘20","Tue 19 Feb ‘20 - Thu 18 Dec ‘20",
            "Tue 19 Jan ‘20 - Thu 18 Feb ‘20","Tue 19 Jan ‘20 - Thu 18 Feb ‘20","Tue 19 Jan ‘20 - Thu 18 Feb ‘20","Tue 19 Jan ‘20 - Thu 18 Feb ‘20"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analytics_details);

        attachID();
//        setSpinner();
        setPieChart();
        setLoyaltyPie();
        setServicePie();
        setTrainingPie();
        setAmenitiesPie();
        setSourceDivisionPie();
        setBookingLineChart();
        setAgeFrequencyBArChart();

//        backBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                finish();
//            }
//        });

    }

    private void setAgeFrequencyBArChart() {
        ArrayList<BarEntry> ages = new ArrayList<>();
        ages.add(new BarEntry(0,20));
        ages.add(new BarEntry(0,100));
        ages.add(new BarEntry(0,400));
        ages.add(new BarEntry(0,800));
        ages.add(new BarEntry(0,200));

        ArrayList<String> ageGroups = new ArrayList<>();
        ageGroups.add("0-13");
        ageGroups.add("13-19");
        ageGroups.add("19-30");
        ageGroups.add("30-50");
        ageGroups.add("50+");

        BarDataSet barDataSet = new BarDataSet(ages,"");
        BarData barData = new BarData(barDataSet);
        ageFrequencyBarChart.setData(barData);




    }

    private void setBookingLineChart() {
        ArrayList<Entry> lineEntries = new ArrayList<>();
        lineEntries.add(new Entry(0, 3000));
        lineEntries.add(new Entry(1, 3546));
        lineEntries.add(new Entry(2, 5666));
        lineEntries.add(new Entry(3, 4321));
        lineEntries.add(new Entry(4, 5222));
        lineEntries.add(new Entry(5, 2987));
        lineEntries.add(new Entry(6, 3414));
        lineEntries.add(new Entry(7, 280));
        lineEntries.add(new Entry(8, 431));
        lineEntries.add(new Entry(9, 1000));
        lineEntries.add(new Entry(10, 2466));
        lineEntries.add(new Entry(11, 5444));
        lineEntries.add(new Entry(12, 6777));
        lineEntries.add(new Entry(13, 3555));
        lineEntries.add(new Entry(14, 3777));
        lineEntries.add(new Entry(15, 4423));
        lineEntries.add(new Entry(16, 2853));
        lineEntries.add(new Entry(17, 3874));
        lineEntries.add(new Entry(18, 1999));
        lineEntries.add(new Entry(19, 5421));
        lineEntries.add(new Entry(20, 7341));
        lineEntries.add(new Entry(21, 6345));
        lineEntries.add(new Entry(22, 453));
        lineEntries.add(new Entry(23 ,5897));

        LineDataSet lineDataSet = new LineDataSet(lineEntries, "");
        lineDataSet.setAxisDependency(YAxis.AxisDependency.LEFT);
        lineDataSet.setHighlightEnabled(true);
        lineDataSet.setLineWidth(2);
        lineDataSet.setColor(Color.rgb(10,76,137));
        lineDataSet.setCircleColor(Color.rgb(110,187,253));
        lineDataSet.setCircleRadius(6);
        lineDataSet.setCircleHoleRadius(3);
        lineDataSet.setDrawHighlightIndicators(true);
        lineDataSet.setHighLightColor(Color.RED);
        lineDataSet.setValueTextSize(11);
        lineDataSet.setValueTextColor(Color.BLACK);

        LineData lineData = new LineData(lineDataSet);

//        bookingFrequencyLneChart.getDescription().setText("");
//        bookingFrequencyLneChart.getDescription().setTextSize(12);
        bookingFrequencyLneChart.setDrawMarkers(true);
//        bookingFrequencyLneChart.setMarker(markerView(context));
//        bookingFrequencyLneChart.getAxisLeft().addLimitLine(lowerLimitLine(2,"Lower Limit",2,12,getColor("defaultOrange"),getColor("defaultOrange")));
//        bookingFrequencyLneChart.getAxisLeft().addLimitLine(upperLimitLine(5,"Upper Limit",2,12,getColor("defaultGreen"),getColor("defaultGreen")));
        bookingFrequencyLneChart.getXAxis().setPosition(XAxis.XAxisPosition.BOTH_SIDED);
        bookingFrequencyLneChart.animateY(1000);
        bookingFrequencyLneChart.getXAxis().setGranularityEnabled(true);
        bookingFrequencyLneChart.getXAxis().setGranularity(1.0f);
        bookingFrequencyLneChart.getXAxis().setLabelCount(lineDataSet.getEntryCount());
        bookingFrequencyLneChart.setData(lineData);
        bookingFrequencyLneChart.isPinchZoomEnabled();
        bookingFrequencyLneChart.setTouchEnabled(true);

    }

    private void setSourceDivisionPie() {
        sourceDivisionPie.setUsePercentValues(true);
        sourceDivisionPie.getDescription().setEnabled(false);
        sourceDivisionPie.setDragDecelerationFrictionCoef(0.9f);
        sourceDivisionPie.setEntryLabelTextSize(10f);
        sourceDivisionPie.setDrawEntryLabels(false);
        sourceDivisionPie.setHoleColor(Color.WHITE);
        ArrayList<PieEntry> yValues = new ArrayList<>();
        yValues.add(new PieEntry(34f,"Facebook"));
        yValues.add(new PieEntry(45f,"Instagram"));
        yValues.add(new PieEntry(56f,"Fitness 2020"));
        yValues.add(new PieEntry(66f,"Others"));
        yValues.add(new PieEntry(45f,"Friends"));

        int[] colors = {
                Color.rgb(10, 76, 137) ,
                Color.rgb(210, 74, 147),
                Color.rgb(46, 156, 219),
                Color.rgb(176, 217, 255),
                Color.rgb(81, 198, 224)
        };


        PieDataSet dataSet = new PieDataSet(yValues,"");
        dataSet.setSliceSpace(3f);
        dataSet.setSelectionShift(1f);
        dataSet.setColors(colors);
        dataSet.setValueFormatter(new PercentFormatter(sourceDivisionPie));
        dataSet.setYValuePosition(PieDataSet.ValuePosition.OUTSIDE_SLICE);
        PieData pieData = new PieData((dataSet));
        pieData.setValueTextSize(10f);
        pieData.setValueTextColor(Color.WHITE);
        sourceDivisionPie.setData(pieData);
    }

    private void setAmenitiesPie() {
        amenitiesPie.setUsePercentValues(true);
        amenitiesPie.getDescription().setEnabled(false);
        amenitiesPie.setDragDecelerationFrictionCoef(0.9f);
        amenitiesPie.setEntryLabelTextSize(10f);
        amenitiesPie.setDrawEntryLabels(false);
        amenitiesPie.setHoleColor(Color.WHITE);
        ArrayList<PieEntry> yValues = new ArrayList<>();
        yValues.add(new PieEntry(34f,"5"));
        yValues.add(new PieEntry(45f,"4"));
        yValues.add(new PieEntry(56f,"3"));
        yValues.add(new PieEntry(66f,"2"));
        yValues.add(new PieEntry(45f,"1"));

        int[] colors = {
                Color.rgb(33, 150, 83) ,
                Color.rgb(111, 207, 151),
                Color.rgb(242, 201, 76),
                Color.rgb(242, 153, 74),
                Color.rgb(235, 87, 87)
        };


        PieDataSet dataSet = new PieDataSet(yValues,"");
        dataSet.setSliceSpace(3f);
        dataSet.setSelectionShift(1f);
        dataSet.setColors(colors);
        dataSet.setValueFormatter(new PercentFormatter(amenitiesPie));
        dataSet.setYValuePosition(PieDataSet.ValuePosition.OUTSIDE_SLICE);
        PieData pieData = new PieData((dataSet));
        pieData.setValueTextSize(10f);
        pieData.setValueTextColor(Color.WHITE);
        amenitiesPie.setData(pieData);
    }

    private void setTrainingPie() {
        trainingPie.setUsePercentValues(true);
        trainingPie.getDescription().setEnabled(false);
        trainingPie.setDragDecelerationFrictionCoef(0.9f);
        trainingPie.setEntryLabelTextSize(10f);
        trainingPie.setDrawEntryLabels(false);
        trainingPie.setHoleColor(Color.WHITE);
        ArrayList<PieEntry> yValues = new ArrayList<>();
        yValues.add(new PieEntry(34f,"5"));
        yValues.add(new PieEntry(45f,"4"));
        yValues.add(new PieEntry(56f,"3"));
        yValues.add(new PieEntry(66f,"2"));
        yValues.add(new PieEntry(45f,"1"));

        int[] colors = {
                Color.rgb(33, 150, 83) ,
                Color.rgb(111, 207, 151),
                Color.rgb(242, 201, 76),
                Color.rgb(242, 153, 74),
                Color.rgb(235, 87, 87)
        };


        PieDataSet dataSet = new PieDataSet(yValues,"");
        dataSet.setSliceSpace(3f);
        dataSet.setSelectionShift(1f);
        dataSet.setColors(colors);
        dataSet.setValueFormatter(new PercentFormatter(trainingPie));
        dataSet.setYValuePosition(PieDataSet.ValuePosition.OUTSIDE_SLICE);
        PieData pieData = new PieData((dataSet));
        pieData.setValueTextSize(10f);
        pieData.setValueTextColor(Color.WHITE);
        trainingPie.setData(pieData);
    }

    private void setServicePie() {
        servicePie.setUsePercentValues(true);
        servicePie.getDescription().setEnabled(false);
        servicePie.setDragDecelerationFrictionCoef(0.9f);
        servicePie.setEntryLabelTextSize(10f);
        servicePie.setDrawEntryLabels(false);
        servicePie.setHoleColor(Color.WHITE);
        ArrayList<PieEntry> yValues = new ArrayList<>();
        yValues.add(new PieEntry(34f,"5"));
        yValues.add(new PieEntry(45f,"4"));
        yValues.add(new PieEntry(56f,"3"));
        yValues.add(new PieEntry(66f,"2"));
        yValues.add(new PieEntry(45f,"1"));

        int[] colors = {
                Color.rgb(33, 150, 83) ,
                Color.rgb(111, 207, 151),
                Color.rgb(242, 201, 76),
                Color.rgb(242, 153, 74),
                Color.rgb(235, 87, 87)
        };


        PieDataSet dataSet = new PieDataSet(yValues,"");
        dataSet.setSliceSpace(3f);
        dataSet.setSelectionShift(1f);
        dataSet.setColors(colors);
        dataSet.setValueFormatter(new PercentFormatter(servicePie));
        dataSet.setYValuePosition(PieDataSet.ValuePosition.OUTSIDE_SLICE);
        PieData pieData = new PieData((dataSet));
        pieData.setValueTextSize(10f);
        pieData.setValueTextColor(Color.WHITE);
        servicePie.setData(pieData);
    }

    private void setLoyaltyPie() {
        loyaltyPie.setUsePercentValues(true);
        loyaltyPie.getDescription().setEnabled(false);
        loyaltyPie.setDragDecelerationFrictionCoef(0.9f);
        loyaltyPie.setEntryLabelTextSize(10f);
        loyaltyPie.setDrawEntryLabels(false);
        loyaltyPie.setHoleColor(Color.WHITE);
        ArrayList<PieEntry> yValues = new ArrayList<>();
        yValues.add(new PieEntry(34f,"5"));
        yValues.add(new PieEntry(45f,"4"));
        yValues.add(new PieEntry(56f,"3"));
        yValues.add(new PieEntry(66f,"2"));
        yValues.add(new PieEntry(45f,"1"));

        int[] colors = {
                Color.rgb(33, 150, 83) ,
                Color.rgb(111, 207, 151),
                Color.rgb(242, 201, 76),
                Color.rgb(242, 153, 74),
                Color.rgb(235, 87, 87)
        };


        PieDataSet dataSet = new PieDataSet(yValues,"");
        dataSet.setSliceSpace(3f);
        dataSet.setSelectionShift(1f);
        dataSet.setColors(colors);
        dataSet.setValueFormatter(new PercentFormatter(loyaltyPie));
        dataSet.setYValuePosition(PieDataSet.ValuePosition.OUTSIDE_SLICE);
        PieData pieData = new PieData((dataSet));
        pieData.setValueTextSize(10f);
        pieData.setValueTextColor(Color.WHITE);
        loyaltyPie.setData(pieData);
    }

    private void setSpinner() {
        ArrayAdapter monthAdapter = new ArrayAdapter(AnalyticsDetailsActivity.this,android.R.layout.simple_spinner_dropdown_item,months);
        monthAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        monthSlotSpinner.setAdapter(monthAdapter);
        monthSlotSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void setPieChart() {
        pieChart.setUsePercentValues(true);
        pieChart.getDescription().setEnabled(false);
        pieChart.setDragDecelerationFrictionCoef(0.9f);
        pieChart.setCenterText("Rs 78650\nby 113,456 visits");
        pieChart.setEntryLabelTextSize(10f);
        pieChart.setHoleRadius(65f);
        pieChart.setDrawEntryLabels(false);
        pieChart.setHoleColor(Color.WHITE);
        ArrayList<PieEntry> yValues = new ArrayList<>();
        yValues.add(new PieEntry(34f,"vouchers"));
        yValues.add(new PieEntry(45f,"events"));
        yValues.add(new PieEntry(56f,"webinars"));
        yValues.add(new PieEntry(66f,"bookings"));
        yValues.add(new PieEntry(45f,"B2B orders"));

        int[] colors = {
                Color.rgb(140, 140, 140) ,
                Color.rgb(79, 125, 167),
                Color.rgb(110, 187, 253),
                Color.rgb(0, 114, 209),
                Color.rgb(0, 52, 100)
        };


        PieDataSet dataSet = new PieDataSet(yValues,"");
                dataSet.setSliceSpace(3f);
        dataSet.setSelectionShift(1f);
        dataSet.setColors(colors);
        dataSet.setValueFormatter(new PercentFormatter(pieChart));
        PieData pieData = new PieData((dataSet));
        pieData.setValueTextSize(10f);
        pieData.setValueTextColor(Color.WHITE);
        pieChart.setData(pieData);
    }


    private void attachID() {
//        backBtn = findViewById(R.id.);
        pieChart = findViewById(R.id.analytics_details_piechart_1);
        sourceDivisionPie =findViewById(R.id.analytics_details_piechart_7);
        loyaltyPie = findViewById(R.id.analytics_details_piechart_2);
        servicePie = findViewById(R.id.analytics_details_piechart_3);
        trainingPie = findViewById(R.id.analytics_details_piechart_4);
        amenitiesPie = findViewById(R.id.analytics_details_piechart_5);
        ageFrequencyBarChart = findViewById(R.id.analytics_details_bar_chart6);
//        totalUsers = findViewById(R.id.);
//        estimatedRevenue = findViewById(R.id.);
//        visits = findViewById(R.id.);
//        voucherVisits = findViewById(R.id.);
//        voucherRevenue = findViewById(R.id.);
//        eventsVisits = findViewById(R.id.);
//        eventsRevenue = findViewById(R.id.);
//        webinarVisits = findViewById(R.id.);
//        webinarRevenue = findViewById(R.id.);
//        bookingsVisits = findViewById(R.id.);
//        bookingsRevenue = findViewById(R.id.);
//        monthSlotSpinner = findViewById(R.id.);
//        monthSlotSpinner = findViewById(R.id.);
          bookingFrequencyLneChart=findViewById(R.id.analytics_details_booking_freq_chart);
    }
}