package com.example.fitness2020channelapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitness2020channelapp.Models.AddressModel;
import com.example.fitness2020channelapp.Models.ManagerModel;
import com.example.fitness2020channelapp.R;

import java.util.ArrayList;

public class AddressAdapter extends RecyclerView.Adapter<AddressAdapter.AddressVH> {

    ArrayList<AddressModel> addresses;
    Context context;;

    public AddressAdapter(ArrayList<AddressModel> addresses, Context context) {
        this.addresses = addresses;
        this.context = context;
    }

    @NonNull
    @Override
    public AddressAdapter.AddressVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AddressVH(LayoutInflater.from(parent.getContext()).inflate(R.layout.address_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull AddressAdapter.AddressVH holder, int position) {
        holder.populateAddress(addresses.get(position));
    }

    @Override
    public int getItemCount() {
        return addresses.size();
    }

    public class AddressVH extends RecyclerView.ViewHolder {
        TextView addressTV;
        ImageView cutBtn;

        public AddressVH(@NonNull View itemView) {
            super(itemView);
//            addressTV = itemView.findViewById(R.id.);
//            cutBtn = itemView.findViewById(R.id.);

            cutBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //remove from database via api and refresh list
                }
            });
        }

        public void populateAddress(AddressModel addressModel) {
            addressTV.setText(addressModel.getAddress());
        }
    }
}
