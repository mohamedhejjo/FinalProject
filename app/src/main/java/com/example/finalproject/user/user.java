package com.example.finalproject.user;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.finalproject.R;
import com.example.finalproject.admin.ViewPageradmin.Mytabadmin;
import com.example.finalproject.admin.ViewPageradmin.adapterpaferadmin;
import com.example.finalproject.fragment.FragmentadminUpdate;
import com.example.finalproject.fragment.Fragmentadminlogin;
import com.example.finalproject.fragment.FragmentadminHome;
import com.example.finalproject.fragment.FragmentuserCreate;
import com.example.finalproject.fragment.FragmentuserUpdate;
import com.example.finalproject.fragment.Fragmentuserlogin;
import com.google.android.material.tabs.TabLayout;

public class user extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        Button btnlogin=findViewById(R.id.userloginhome);
//        Button btnCreate=findViewById(R.id.usercreatehome);
//
//        btnlogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Fragmentuserlogin ful=new Fragmentuserlogin();
//                FragmentManager FM=getSupportFragmentManager();
//                FragmentTransaction FT=FM.beginTransaction();
//                FT.replace(R.id.fragmentuser,ful);
//                FT.commit();
//            }
//        });
//        btnCreate.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FragmentuserCreate fuc=new FragmentuserCreate();
//                FragmentManager FM=getSupportFragmentManager();
//                FragmentTransaction FT=FM.beginTransaction();
//                FT.replace(R.id.fragmentuser,fuc);
//                FT.commit();
//            }
//        });
        tabLayout=findViewById(R.id.tabLayoutuser);
        viewPager=findViewById(R.id.viewpageruser);
        tabLayout.setupWithViewPager(viewPager);
        adapterpaferadmin adapter=new adapterpaferadmin(getSupportFragmentManager());
        adapter.addtaps(new Mytabadmin( new Fragmentuserlogin(),"Login"));
        adapter.addtaps(new Mytabadmin(new FragmentuserCreate(),"Create"));
        adapter.addtaps(new Mytabadmin(new FragmentuserUpdate(),"Update"));
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