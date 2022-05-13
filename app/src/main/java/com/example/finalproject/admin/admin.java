package com.example.finalproject.admin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.finalproject.R;
import com.example.finalproject.admin.ViewPageradmin.Mytabadmin;
import com.example.finalproject.admin.ViewPageradmin.adapterpaferadmin;
import com.example.finalproject.fragment.FragmentadminUpdate;
import com.example.finalproject.fragment.Fragmentadminlogin;
import com.example.finalproject.fragment.FragmentadminHome;
import com.google.android.material.tabs.TabLayout;

public class admin extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        Button btnlogin=findViewById(R.id.loginadminhome);
//        Button btncreate=findViewById(R.id.createadminhome);
//        btnlogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Fragmentadminlogin fal=new Fragmentadminlogin();
//                FragmentManager FM=getSupportFragmentManager();
//                FragmentTransaction FT=FM.beginTransaction();
//                FT.replace(R.id.fragmentadmin,fal);
//                FT.commit();
//            }
//        });
//        btncreate.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FragmentadminCreate fac=new FragmentadminCreate();
//                FragmentManager FM=getSupportFragmentManager();
//                FragmentTransaction FT=FM.beginTransaction();
//                FT.replace(R.id.fragmentadmin,fac);
//                FT.commit();
//            }
//        });

        tabLayout=findViewById(R.id.tabLayoutadmin);
        viewPager=findViewById(R.id.viewpageradmin);
        tabLayout.setupWithViewPager(viewPager);
        adapterpaferadmin adapter=new adapterpaferadmin(getSupportFragmentManager());
        adapter.addtaps(new Mytabadmin( new FragmentadminHome(),"Home"));
        adapter.addtaps(new Mytabadmin(new Fragmentadminlogin(),"Login"));
        adapter.addtaps(new Mytabadmin(new FragmentadminUpdate(),"Update"));
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

