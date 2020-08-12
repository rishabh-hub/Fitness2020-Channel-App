package com.example.fitness2020channelapp.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitness2020channelapp.Activities.FeedbackDetailsActivity;
import com.example.fitness2020channelapp.Models.FeedbackDataModel;
import com.example.fitness2020channelapp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class FeedbackDataAdapter extends RecyclerView.Adapter<FeedbackDataAdapter.feedbackDataVH> {
    ArrayList<FeedbackDataModel> feedbackData;
    Context context;

    public FeedbackDataAdapter(ArrayList<FeedbackDataModel> feedbackData, Context context) {
        this.feedbackData = feedbackData;
        this.context = context;
    }

    @NonNull
    @Override
    public FeedbackDataAdapter.feedbackDataVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new feedbackDataVH(LayoutInflater.from(parent.getContext()).inflate(R.layout.feedback_data_frag_rv_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull FeedbackDataAdapter.feedbackDataVH holder, int position) {
        holder.populateFeedbackData(feedbackData.get(position));
    }

    @Override
    public int getItemCount() {
        return feedbackData.size();
    }

    public class feedbackDataVH extends RecyclerView.ViewHolder {
        TextView name,rating;
        RelativeLayout card;
        public feedbackDataVH(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.data_frag_rv_item_name_tv);
            rating = itemView.findViewById(R.id.data_frag_rv_item_rating);
            card = itemView.findViewById(R.id.data_frag_rv_item);
        }

        public void populateFeedbackData(FeedbackDataModel feedbackDataModel) {
            name.setText(feedbackDataModel.getName());
            rating.setText(String.valueOf(feedbackDataModel.getRating()));

            card.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), FeedbackDetailsActivity.class);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
