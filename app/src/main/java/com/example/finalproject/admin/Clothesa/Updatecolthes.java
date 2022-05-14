package com.example.finalproject.admin.Clothesa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.finalproject.R;
import com.example.finalproject.admin.ViewPageradmin.Mytabadmin;
import com.example.finalproject.admin.ViewPageradmin.adapterpaferadmin;
import com.example.finalproject.fragment.FragmentUpdatecolthesfemale;
import com.example.finalproject.fragment.FragmentUpdatecolthesmale;
import com.example.finalproject.fragment.FragmentadminHome;
import com.example.finalproject.fragment.FragmentadminUpdate;
import com.example.finalproject.fragment.Fragmentadminlogin;
import com.google.android.material.tabs.TabLayout;

public class Updatecolthes extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_updatecolthes);
        tabLayout=findViewById(R.id.tabLayoutadminUpdate);
        viewPager=findViewById(R.id.viewpageradminUpdate);
        tabLayout.setupWithViewPager(viewPager);
        adapterpaferadmin adapter=new adapterpaferadmin(getSupportFragmentManager());
        adapter.addtaps(new Mytabadmin( new FragmentUpdatecolthesmale(),"Male"));
        adapter.addtaps(new Mytabadmin(new FragmentUpdatecolthesfemale(),"Female"));
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