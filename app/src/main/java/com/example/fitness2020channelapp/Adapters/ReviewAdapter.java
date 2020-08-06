package com.example.fitness2020channelapp.Adapters;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitness2020channelapp.Models.ReviewModel;
import com.example.fitness2020channelapp.R;

import java.util.ArrayList;

public class ReviewAdapter extends RecyclerView.Adapter<ReviewAdapter.reviewVH> {
    ArrayList<ReviewModel> reviewModels;
    Context context;

    public ReviewAdapter(ArrayList<ReviewModel> reviewModels, Context context) {
        this.reviewModels = reviewModels;
        this.context = context;
    }

    @NonNull
    @Override
    public ReviewAdapter.reviewVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new reviewVH(LayoutInflater.from(parent.getContext()).inflate(R.layout.reviews_rv_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ReviewAdapter.reviewVH holder, int position) {
        holder.populateReview(reviewModels.get(position));
    }

    @Override
    public int getItemCount() {
        return reviewModels.size();
    }

    private void cycleTextViewExpansion(TextView tv,TextView txt){
        int collapsedMaxLines = 4;
        String text = tv.getMaxLines()==collapsedMaxLines?"View Less":"View More";
        ObjectAnimator animation = ObjectAnimator.ofInt(tv, "maxLines", tv.getMaxLines() == collapsedMaxLines? tv.getLineCount() : collapsedMaxLines);
        txt.setText(text);
        animation.setDuration(150).start();
    }

    public class reviewVH extends RecyclerView.ViewHolder {
        TextView centerReview,personName,reviewDate,centerRating,readMorebtn;
        public reviewVH(@NonNull View itemView) {
            super(itemView);
//            centerRating = itemView.findViewById();
//            centerReview = itemView.findViewById();
//            personName = itemView.findViewById();
//            reviewDate = itemView.findViewById();
//            readMorebtn = itemView.findViewById();
        }

        public void populateReview(ReviewModel reviewModel) {
            centerReview.setText(reviewModel.getGymReview());
            centerRating.setText(reviewModel.getGymRating());
            personName.setText(reviewModel.getUserName());
            reviewDate.setText(reviewModel.getReviewDate());

            readMorebtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    cycleTextViewExpansion(centerReview,readMorebtn);
                }
            });
        }
    }
}
