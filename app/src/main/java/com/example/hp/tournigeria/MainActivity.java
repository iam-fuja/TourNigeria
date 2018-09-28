package com.example.hp.tournigeria;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // locate view pager that allows user swipe between fragments
        ViewPager viewPager = findViewById(R.id.viewpager);
        // Create an new adapter allows fragment to be shown on each page
        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager());
        // Set adapter on the view pager
        viewPager.setAdapter(adapter);
        // locate tab layout that shows the tabs
        TabLayout tabLayout = findViewById(R.id.tab);

        tabLayout.setupWithViewPager(viewPager);
    }
}
