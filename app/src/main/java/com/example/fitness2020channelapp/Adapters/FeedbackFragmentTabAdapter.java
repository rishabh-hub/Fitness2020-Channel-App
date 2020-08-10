package com.example.fitness2020channelapp.Adapters;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.fitness2020channelapp.Fragments.CheckinTabFragment;
import com.example.fitness2020channelapp.Fragments.DataTabFragment;
import com.example.fitness2020channelapp.Fragments.EventsPhotosFragment;
import com.example.fitness2020channelapp.Fragments.FeedbackTabFragment;
import com.example.fitness2020channelapp.Fragments.LivePhotosFragment;
import com.example.fitness2020channelapp.Fragments.StudioPhotosFragment;


public class FeedbackFragmentTabAdapter extends FragmentPagerAdapter {

    private int noOfTabs;
    Context context;


    public FeedbackFragmentTabAdapter(@NonNull FragmentManager fm, int behavior, int noOfTabs) {
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
                return new CheckinTabFragment();
                }

            case 1: {
                return new FeedbackTabFragment();
            }

            case 2:
                return new DataTabFragment();
            default:return null;
        }

    }

    @Override
    public int getCount() {
        return noOfTabs;
    }
}
