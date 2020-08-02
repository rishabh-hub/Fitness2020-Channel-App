package com.example.fitness2020channelapp.Activities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fitness2020channelapp.Adapters.AddressAdapter;
import com.example.fitness2020channelapp.Adapters.ManagerAdapter;
import com.example.fitness2020channelapp.Models.AddressModel;
import com.example.fitness2020channelapp.Models.ManagerModel;
import com.example.fitness2020channelapp.R;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import java.util.ArrayList;

public class InfoActivity extends AppCompatActivity {

    TextView saveInfoBtn,centerName,centerDescripton,centrTnC;
    ImageView addAddressBtn,editNameBtn,editDescriptionBtn,editTnCBtn,backBtn;
    RecyclerView addressRV;
    AddressAdapter addressAdapter;
    ArrayList<AddressModel> addressModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        attachID();

        getCenterData();

        setEditActions();

        initArrayLists();
        addDummyData();
        setLayoutManagers();
        initAdapter();
        setAdapters();

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void setEditActions() {
        editNameBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View dialogLayout = getLayoutInflater().inflate(R.layout.input_dialog_layout,null);
                final EditText nameET = dialogLayout.findViewById(R.id.dialog_edit_text);
                AlertDialog dialogBuilder = new MaterialAlertDialogBuilder(InfoActivity.this)
                        .setTitle("Edit Name")
                        .setView(R.layout.input_dialog_layout)
                        .setPositiveButton("confirm", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(InfoActivity.this,nameET.getText().toString(),Toast.LENGTH_SHORT).show();

                            }
                        })
                        .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        })
                        .show();

            }
        });

        editDescriptionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        editTnCBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        addAddressBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void getCenterData() {
        //call api to get various data

    }

    private void setAdapters() {
        addressRV.setAdapter(addressAdapter);
        addressAdapter.notifyDataSetChanged();
    }

    private void initAdapter() {
        addressAdapter = new AddressAdapter(addressModels,InfoActivity.this);
    }

    private void setLayoutManagers() {
        addressRV.setLayoutManager(new LinearLayoutManager(InfoActivity.this,LinearLayoutManager.VERTICAL,false));
    }

    private void addDummyData() {
        for (int i=0;i<4;i++)
            addressModels.add(new AddressModel("2nd Floor, Ravindra Natya Mandir, Sayani Marg,Prabhadevi."));
    }

    private void initArrayLists() {
        addressModels = new ArrayList<>();
    }

    private void attachID() {
//        addressRV = findViewById(R.id.);
//        backBtn = findViewById(R.id.);
//        saveInfoBtn = findViewById();
//        centerName = findViewById();
//        centerDescripton = findViewById();
//        centrTnC = findViewById();
//        addAddressBtn = findViewById();
//        editNameBtn = findViewById();
//        editDescriptionBtn = findViewById();
//        editTnCBtn = findViewById();
    }
}