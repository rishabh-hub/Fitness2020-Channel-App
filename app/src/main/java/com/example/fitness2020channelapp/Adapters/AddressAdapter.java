package com.example.fitness2020channelapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitness2020channelapp.Models.ManagerModel;
import com.example.fitness2020channelapp.R;

import java.util.ArrayList;

public class AddressAdapter extends RecyclerView.Adapter<AddressAdapter.ManagerVH> {

    ArrayList<ManagerModel> managers;
    Context context;;

    public AddressAdapter(ArrayList<ManagerModel> managers, Context context) {
        this.managers = managers;
        this.context = context;
    }

    @NonNull
    @Override
    public AddressAdapter.ManagerVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ManagerVH(LayoutInflater.from(parent.getContext()).inflate(R.layout.manager_rv_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull AddressAdapter.ManagerVH holder, int position) {
        holder.populateManagers(managers.get(position));
    }

    @Override
    public int getItemCount() {
        return managers.size();
    }

    public class
    ManagerVH extends RecyclerView.ViewHolder {
        TextView name,email,mobileNo;
        public ManagerVH(@NonNull View itemView) {
            super(itemView);
            name =  itemView.findViewById(R.id.manager_rv_item_name);
            email = itemView.findViewById(R.id.manager_rv_item_email);
            mobileNo = itemView.findViewById(R.id.manager_rv_item_phno);
        }

        public void populateManagers(ManagerModel managerModel) {
            name.setText(managerModel.getName());
            email.setText(managerModel.getEmail());
            mobileNo.setText(managerModel.getMobileNo());

        }
    }
}
