package com.example.fitness2020channelapp.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitness2020channelapp.Adapters.PhotoVideoFragmentAdapter;
import com.example.fitness2020channelapp.Models.PhotoModel;
import com.example.fitness2020channelapp.Models.VideoModel;
import com.example.fitness2020channelapp.R;

import java.util.ArrayList;


public class EventsPhotosFragment extends Fragment {

    View view;
    RecyclerView photoGridRV,videoGridRV;
    PhotoVideoFragmentAdapter videoAdapter,photoAdapter;
    ImageView addPhotoBtn,addVideoBtn;
    ArrayList<PhotoModel> photos;
    ArrayList<VideoModel> videos;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_events_photos, container, false);
        attachID();
        initArrayLists();
        addDummyData();
        setLayoutManagers();
        initAdapter();
        setAdapters();
        return view;
    }
    private void initArrayLists() {
        photos = new ArrayList<>();
        videos = new ArrayList<>();
    }

    private void addDummyData() {
        for (int i=0;i<7;i++)
        {
            photos.add(new PhotoModel(R.drawable.ic_home));
            videos.add(new VideoModel("hello"));
        }
    }

    private void setAdapters() {
        photoGridRV.setAdapter(photoAdapter);
        videoGridRV.setAdapter(videoAdapter);
    }

    private void initAdapter() {
        photoAdapter = new PhotoVideoFragmentAdapter(photos,videos,view.getContext(),2,0);
        videoAdapter = new PhotoVideoFragmentAdapter(photos,videos,view.getContext(),2,1);
    }

    private void setLayoutManagers() {
        photoGridRV.setLayoutManager(new GridLayoutManager(view.getContext(),3));
        videoGridRV.setLayoutManager(new GridLayoutManager(view.getContext(),3));
    }

    private void attachID() {
        photoGridRV = view.findViewById(R.id.events_photos_rv);
        videoGridRV = view.findViewById(R.id.events_videos_rv);
//        addPhotoBtn = view.findViewById();
//        addVideoBtn = view.findViewById();
    }
}