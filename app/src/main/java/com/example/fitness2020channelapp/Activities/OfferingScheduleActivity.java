package com.example.fitness2020channelapp.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fitness2020channelapp.Adapters.ManagerAdapter;
import com.example.fitness2020channelapp.Adapters.OfferingPageAdapter;
import com.example.fitness2020channelapp.Adapters.OfferingScheduleAdapter;
import com.example.fitness2020channelapp.Models.ManagerModel;
import com.example.fitness2020channelapp.Models.OfferingSlotModel;
import com.example.fitness2020channelapp.R;

import java.util.ArrayList;

public class OfferingScheduleActivity extends AppCompatActivity {

    RecyclerView mondaySlotsRV,tuesdaySlotsRV,wednesdaySlotsRV,thursdaySlotsRV,fridaySlotsRV,saturdaySlotsRV,sundaySlotsRV;
    OfferingScheduleAdapter mondayAdapter,tuesdayAdapter,wednesdayAdapter,thursdayAdapter,fridayAdapter,saturdayAdapter,sundayAdapter;
    ArrayList<OfferingSlotModel> mondaySlots,tuesdaySlots,wednesdaySlots,thursdaySlots,fridaySlots,saturdaySlots,sundaySlots;
    TextView saveBtn,mondayAdd,mondayClear,tuesdayAdd,tuesdayClear,wednesdayAdd,wednesdayClear,thursdayAdd,thursdayClear,fridayAdd,fridayClear,saturdayClear,saturdayAdd,sundayAdd,sundayClear;
    ImageView backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offering_schedule);

        attachID();
        initArrayLists();
        addDummyData();
        setLayoutManagers();
        initAdapter();
        setAdapters();

        setScheduleEditBtns();

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //save all rv datas to backend
            }
        });

    }

    private void setScheduleEditBtns() {

        mondayAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addSlot("monday");
            }
        });

        mondayClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearSlots("monday");
            }
        });

        tuesdayAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addSlot("tuesday");

            }
        });

        tuesdayClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearSlots("tuesday");

            }
        });

        wednesdayAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addSlot("wednesday");

            }
        });

        wednesdayClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearSlots("wednesday");

            }
        });

        thursdayAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addSlot("thursday");

            }
        });

        thursdayClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearSlots("thursday");

            }
        });

        fridayAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addSlot("friday");

            }
        });

        fridayClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearSlots("friday");

            }
        });

        saturdayAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addSlot("saturday");

            }
        });

        saturdayClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearSlots("saturday");

            }
        });

        sundayAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addSlot("sunday");

            }
        });

        sundayClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearSlots("sunday");

            }
        });
    }

    private void clearSlots(String day) {
        //add slot to dayRV
    }

    private void addSlot(String day) {
        //clear all slots from dayRV
    }


    private void setAdapters() {
        mondaySlotsRV.setAdapter(mondayAdapter);
        tuesdaySlotsRV.setAdapter(tuesdayAdapter);
        wednesdaySlotsRV.setAdapter(wednesdayAdapter);
        thursdaySlotsRV.setAdapter(thursdayAdapter);
        fridaySlotsRV.setAdapter(fridayAdapter);
        saturdaySlotsRV.setAdapter(saturdayAdapter);
        sundaySlotsRV.setAdapter(sundayAdapter);

        mondayAdapter.notifyDataSetChanged();
        tuesdayAdapter.notifyDataSetChanged();
        wednesdayAdapter.notifyDataSetChanged();
        thursdayAdapter.notifyDataSetChanged();
        fridayAdapter.notifyDataSetChanged();
        saturdayAdapter.notifyDataSetChanged();
        sundayAdapter.notifyDataSetChanged();
    }

    private void initAdapter() {
        mondayAdapter = new OfferingScheduleAdapter(mondaySlots,OfferingScheduleActivity.this);
        tuesdayAdapter = new OfferingScheduleAdapter(tuesdaySlots,OfferingScheduleActivity.this);
        wednesdayAdapter = new OfferingScheduleAdapter(wednesdaySlots,OfferingScheduleActivity.this);
        thursdayAdapter = new OfferingScheduleAdapter(thursdaySlots,OfferingScheduleActivity.this);
        fridayAdapter = new OfferingScheduleAdapter(fridaySlots,OfferingScheduleActivity.this);
        saturdayAdapter = new OfferingScheduleAdapter(saturdaySlots,OfferingScheduleActivity.this);
        sundayAdapter = new OfferingScheduleAdapter(sundaySlots,OfferingScheduleActivity.this);

    }

    private void setLayoutManagers() {
        mondaySlotsRV.setLayoutManager(new LinearLayoutManager(OfferingScheduleActivity.this,LinearLayoutManager.VERTICAL,false));
        tuesdaySlotsRV.setLayoutManager(new LinearLayoutManager(OfferingScheduleActivity.this,LinearLayoutManager.VERTICAL,false));
        wednesdaySlotsRV.setLayoutManager(new LinearLayoutManager(OfferingScheduleActivity.this,LinearLayoutManager.VERTICAL,false));
        thursdaySlotsRV.setLayoutManager(new LinearLayoutManager(OfferingScheduleActivity.this,LinearLayoutManager.VERTICAL,false));
        fridaySlotsRV.setLayoutManager(new LinearLayoutManager(OfferingScheduleActivity.this,LinearLayoutManager.VERTICAL,false));
        saturdaySlotsRV.setLayoutManager(new LinearLayoutManager(OfferingScheduleActivity.this,LinearLayoutManager.VERTICAL,false));
        sundaySlotsRV.setLayoutManager(new LinearLayoutManager(OfferingScheduleActivity.this,LinearLayoutManager.VERTICAL,false));

    }

    private void addDummyData() {
        for (int i=0;i<3;i++){
            mondaySlots.add(new OfferingSlotModel("Monday","7:00 AM","8:30 AM"));
            tuesdaySlots.add(new OfferingSlotModel("Tuesday","7:00 AM","8:30 AM"));
            wednesdaySlots.add(new OfferingSlotModel("Wednesday","7:00 AM","8:30 AM"));
            thursdaySlots.add(new OfferingSlotModel("Thursday","7:00 AM","8:30 AM"));
            fridaySlots.add(new OfferingSlotModel("Friday","7:00 AM","8:30 AM"));
            saturdaySlots.add(new OfferingSlotModel("Saturday","7:00 AM","8:30 AM"));
            sundaySlots.add(new OfferingSlotModel("Sunday","7:00 AM","8:30 AM"));

        }
    }

    private void initArrayLists() {
        mondaySlots = new ArrayList<>();
        tuesdaySlots = new ArrayList<>();
        wednesdaySlots = new ArrayList<>();
        thursdaySlots = new ArrayList<>();
        fridaySlots = new ArrayList<>();
        saturdaySlots = new ArrayList<>();
        sundaySlots = new ArrayList<>();
    }

    private void attachID() {
    }
}