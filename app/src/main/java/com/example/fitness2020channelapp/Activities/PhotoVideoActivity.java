package com.example.fitness2020channelapp.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fitness2020channelapp.Adapters.PhotoPageAdapter;
import com.example.fitness2020channelapp.Fragments.EventsPhotosFragment;
import com.example.fitness2020channelapp.Fragments.LivePhotosFragment;
import com.example.fitness2020channelapp.Fragments.StudioPhotosFragment;
import com.example.fitness2020channelapp.R;
import com.google.android.material.tabs.TabLayout;

public class PhotoVideoActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ImageView backBtn;
    TextView centerName;
    PhotoPageAdapter slideAdapter;
    ViewPager viewPager;
    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_video);
        attachID();

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        slideAdapter=new PhotoPageAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT,tabLayout.getTabCount());
        viewPager.setAdapter(slideAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

                switch(tab.getPosition())
                {
                    case 0: fragment=new StudioPhotosFragment();
                        loadFragment(fragment);
                        break;
                    case 1: fragment=new LivePhotosFragment();
                        loadFragment(fragment);
                        break;
                    case 2: fragment=new EventsPhotosFragment();
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
    }

    private void attachID() {
        tabLayout = findViewById(R.id.tab_layout);
        backBtn = findViewById(R.id.back_btn);
        viewPager = findViewById(R.id.photo_video_activity_viewpager);
//        centerName = findViewById(R.id.);
    }

    public void loadFragment(Fragment fragment)
    {
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout,fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}