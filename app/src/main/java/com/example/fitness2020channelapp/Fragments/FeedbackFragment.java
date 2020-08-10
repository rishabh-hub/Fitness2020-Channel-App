package com.example.fitness2020channelapp.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import com.example.fitness2020channelapp.Adapters.FeedbackFragmentTabAdapter;
import com.example.fitness2020channelapp.Adapters.PhotoPageAdapter;
import com.example.fitness2020channelapp.R;
import com.google.android.material.tabs.TabLayout;

public class FeedbackFragment extends Fragment {

    View view;
    TabLayout tabLayout;
    FeedbackFragmentTabAdapter feedbackSlideAdapter;
    ViewPager viewPager;
    Fragment fragment;


    public FeedbackFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.fragment_feedback,container,false);

        attachID();

        feedbackSlideAdapter=new FeedbackFragmentTabAdapter(getChildFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT,tabLayout.getTabCount());
        viewPager.setAdapter(feedbackSlideAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

                switch(tab.getPosition())
                {
                    case 0: fragment=new CheckinTabFragment();
                        loadFragment(fragment);
                        break;
                    case 1: fragment=new FeedbackTabFragment();
                        loadFragment(fragment);
                        break;
                    case 2: fragment=new DataTabFragment();
                        loadFragment(fragment);
                        break;
                }
            }


            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {


            }


        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        return view;
    }

    private void attachID() {
        tabLayout = view.findViewById(R.id.tab_layout);
        viewPager = view.findViewById(R.id.feedback_viewpager);
    }

    public void loadFragment(Fragment fragment)
    {
        getChildFragmentManager().popBackStack();
        FragmentTransaction fragmentTransaction=getChildFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.feedback_frameLayout,fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
