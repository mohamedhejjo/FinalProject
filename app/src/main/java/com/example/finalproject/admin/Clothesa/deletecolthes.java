package com.example.finalproject.admin.Clothesa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.finalproject.R;
import com.example.finalproject.admin.ViewPageradmin.Mytabadmin;
import com.example.finalproject.admin.ViewPageradmin.adapterpaferadmin;
import com.example.finalproject.fragment.FragmentUpdatecolthesfemale;
import com.example.finalproject.fragment.FragmentUpdatecolthesmale;
import com.example.finalproject.fragment.Fragmentdeletecolthesfemale;
import com.example.finalproject.fragment.Fragmentdeletecolthesmale;
import com.google.android.material.tabs.TabLayout;

public class deletecolthes extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_deletecolthes);
        tabLayout=findViewById(R.id.tabLayoutadmindelete);
        viewPager=findViewById(R.id.viewpageradmindelete);
        tabLayout.setupWithViewPager(viewPager);
        String Male=getString(R.string.male);
        String Female=getString(R.string.female);
        adapterpaferadmin adapter=new adapterpaferadmin(getSupportFragmentManager());
        adapter.addtaps(new Mytabadmin( new Fragmentdeletecolthesmale(),Male));
        adapter.addtaps(new Mytabadmin(new Fragmentdeletecolthesfemale(),Female));
        viewPager.setAdapter(adapter);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}