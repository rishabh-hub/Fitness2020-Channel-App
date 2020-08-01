package com.example.fitness2020channelapp.Adapters;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.fitness2020channelapp.Models.PhotoModel;
import com.example.fitness2020channelapp.Models.VideoModel;
import com.example.fitness2020channelapp.R;

import java.util.ArrayList;

public class PhotoVideoFragmentAdapter extends RecyclerView.Adapter<PhotoVideoFragmentAdapter.PhotoVideoVH> {

    ArrayList<PhotoModel> photos;
    ArrayList<VideoModel> videos;
    Context context;
    int pageCode;
    int type;

    public PhotoVideoFragmentAdapter(ArrayList<PhotoModel> photos, ArrayList<VideoModel> videos, Context context, int pageCode, int type) {
        this.photos = photos;
        this.videos = videos;
        this.context = context;
        this.pageCode = pageCode;
        this.type = type;
    }

    @NonNull
    @Override
    public PhotoVideoFragmentAdapter.PhotoVideoVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(type == 0)
            return new PhotoVideoVH(LayoutInflater.from(parent.getContext()).inflate(R.layout.photo_model_layout,parent,false));
        else
            return new PhotoVideoVH(LayoutInflater.from(parent.getContext()).inflate(R.layout.video_model_layout,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull PhotoVideoFragmentAdapter.PhotoVideoVH holder, int position) {
        if(type == 0)
            holder.populatePhoto(photos.get(position));
        else
            holder.populateVideo(videos.get(position));

    }

    @Override
    public int getItemCount() {

        if(type==0)
        {
            return photos.size();
        }

        else
            return videos.size();

    }

    public void addPhoto(Uri uri) {
        photos.add(new PhotoModel(uri));
        notifyDataSetChanged();
    }

    public class PhotoVideoVH extends RecyclerView.ViewHolder {
        ImageView photoView,videoView;
        public PhotoVideoVH(@NonNull View itemView) {
            super(itemView);
            photoView = itemView.findViewById(R.id.photo_model_rv_imgvw);
//            videoView = itemView.findViewById(R.id.);
        }

        public void populatePhoto(PhotoModel photoModel) {
//            Glide.with(context).load(photoModel.getImageUri()).into(photoView);
            photoView.setImageURI(photoModel.getImageUri());
        }

        public void populateVideo(VideoModel videoModel) {
            String url = videoModel.getVideoURL();
            //get video thumbnail from uri and put in videoView

        }
    }
}
