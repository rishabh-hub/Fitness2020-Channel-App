package com.example.fitness2020channelapp.Fragments;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitness2020channelapp.Adapters.PhotoVideoFragmentAdapter;
import com.example.fitness2020channelapp.Models.PhotoModel;
import com.example.fitness2020channelapp.Models.VideoModel;
import com.example.fitness2020channelapp.R;

import java.util.ArrayList;

import pub.devrel.easypermissions.EasyPermissions;

import static android.app.Activity.RESULT_OK;


public class LivePhotosFragment extends Fragment {

    private static final int PERMISSION_REQUEST_CODE = 777;
    private static final int GALLERY_REQUEST_CODE = 107;

    View view;
    RecyclerView photoGridRV,videoGridRV;
    PhotoVideoFragmentAdapter videoAdapter,photoAdapter;
    ImageView addPhotoBtn,addVideoBtn;
    ArrayList<PhotoModel> photos;
    ArrayList<VideoModel> videos;
    Uri uri;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_live_photos, container, false);
        attachID();
        initArrayLists();
        addDummyData();
        setLayoutManagers();
        initAdapter();
        setAdapters();

        photopermissions();
        return view;
    }

    private void photopermissions() {
        addPhotoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EasyPermissions.hasPermissions(getContext(), Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
                    openGallery();
                } else {
                    EasyPermissions.requestPermissions(getActivity(), "Allow this app to access your storage", PERMISSION_REQUEST_CODE, Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE);
                }

            }
        });
    }

    private void openGallery() {
        Log.i("EventsFragment", ">>>>>>>>>>>>>>>>>>>>>>>> openGallery started");
        Intent galleryIntent = new Intent(Intent.ACTION_PICK);
        galleryIntent.setType("image/*");
        startActivityForResult(galleryIntent, GALLERY_REQUEST_CODE);
    }

    private void initArrayLists() {
        photos = new ArrayList<>();
        videos = new ArrayList<>();
    }

    private void addDummyData() {
        for (int i=0;i<7;i++)
        {
            photos.add(new PhotoModel(Uri.parse("android.resource://com.example.fitness2020channelapp/drawable/"+R.drawable.ic_home)));
            videos.add(new VideoModel("hello"));
        }
    }

    private void setAdapters() {
        photoGridRV.setAdapter(photoAdapter);
        videoGridRV.setAdapter(videoAdapter);

        photoAdapter.notifyDataSetChanged();
        videoAdapter.notifyDataSetChanged();
    }

    private void initAdapter() {
        photoAdapter = new PhotoVideoFragmentAdapter(photos,videos,view.getContext(),1,0);
        videoAdapter = new PhotoVideoFragmentAdapter(photos,videos,view.getContext(),1,1);
    }

    private void setLayoutManagers() {
        photoGridRV.setLayoutManager(new GridLayoutManager(view.getContext(),3));
        videoGridRV.setLayoutManager(new GridLayoutManager(view.getContext(),3));
    }

    private void attachID() {
        photoGridRV = view.findViewById(R.id.live_photos_rv);
        videoGridRV = view.findViewById(R.id.live_videos_rv);
        addPhotoBtn = view.findViewById(R.id.live_photo_add_btn);
//        addVideoBtn = view.findViewById();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if ((requestCode == GALLERY_REQUEST_CODE) && resultCode == RESULT_OK && data != null && data.getData() != null) {
            uri = data.getData();
            addPhoto(uri);
        }
    }

    private void addPhoto(Uri uri) {
        photoAdapter.addPhoto(uri);
    }
}