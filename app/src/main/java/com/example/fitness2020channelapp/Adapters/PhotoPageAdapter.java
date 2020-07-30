package com.example.fitness2020channelapp.Adapters;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.fitness2020channelapp.Fragments.EventsPhotosFragment;
import com.example.fitness2020channelapp.Fragments.LivePhotosFragment;
import com.example.fitness2020channelapp.Fragments.StudioPhotosFragment;


public class PhotoPageAdapter extends FragmentPagerAdapter {

    private int noOfTabs;
    Context context;


    public PhotoPageAdapter(@NonNull FragmentManager fm, int behavior, int noOfTabs) {
        super(fm, behavior);
        this.noOfTabs = noOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position)
        {
            case 0:
                {
                return new StudioPhotosFragment();
                }

            case 1: {
                return new LivePhotosFragment();
            }

            case 2:
                return new EventsPhotosFragment();
            default:return null;
        }

    }

    @Override
    public int getCount() {
        return noOfTabs;
    }
}
