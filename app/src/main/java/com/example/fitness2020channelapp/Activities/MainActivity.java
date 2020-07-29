package com.example.fitness2020channelapp.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.fitness2020channelapp.Fragments.AnalyticsFragment;
import com.example.fitness2020channelapp.Fragments.FeedbackFragment;
import com.example.fitness2020channelapp.Fragments.HomeFragment;
import com.example.fitness2020channelapp.Fragments.ListingFragment;
import com.example.fitness2020channelapp.Fragments.OrderFragment;
import com.example.fitness2020channelapp.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    FrameLayout frameLayout;
    DrawerLayout drawerLayout;
    public BottomNavigationView bottomNavigationView;
    private static  MainActivity instance;
    String nav = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        attachId();


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId())
                {
                    case R.id.home:
                        loadFragment(new HomeFragment());
                        return true;
                    case R.id.fitness_pass:
                        loadFragment(new ListingFragment());
                        return true;
                    case R.id.vouchers:
                        loadFragment(new FeedbackFragment());
                        return true;
                    case R.id.events:
                        loadFragment(new OrderFragment());
                        return true;
                    case R.id.analytics:
                        loadFragment(new AnalyticsFragment());
                        return true;
                }

                return false;
            }
        });

    }

    void attachId()
    {
        frameLayout=findViewById(R.id.frame_layout);
        bottomNavigationView=findViewById(R.id.bottom_nav);
        drawerLayout=findViewById(R.id.drawer);
    }

    public void loadFragment(Fragment fragment)
    {
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout,fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

}