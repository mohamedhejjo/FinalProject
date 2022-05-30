package com.example.finalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.finalproject.admin.Clothesa.addcolthes;
import com.example.finalproject.admin.Clothesa.adddevices;
import com.example.finalproject.admin.ViewPageradmin.Mytabadmin;
import com.example.finalproject.admin.ViewPageradmin.adapterpaferadmin;
import com.example.finalproject.admin.admin;
import com.example.finalproject.admin.adminCategories;
import com.example.finalproject.fragment.FragmentuserCreate;
import com.example.finalproject.fragment.FragmentuserUpdate;
import com.example.finalproject.fragment.Fragmentuserlogin;
import com.example.finalproject.fragment.mainadmin;
import com.example.finalproject.fragment.mainuser;
import com.example.finalproject.user.user;
import com.google.android.material.tabs.TabLayout;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=findViewById(R.id.tabLayouthome);
        viewPager=findViewById(R.id.viewpagerhome);
        tabLayout.setupWithViewPager(viewPager);
        adapterpaferadmin adapter=new adapterpaferadmin(getSupportFragmentManager());
        adapter.addtaps(new Mytabadmin( new mainadmin(),"admin"));
        adapter.addtaps(new Mytabadmin(new mainuser(),"user"));
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
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.lang,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.Arabic){
         setLocale("ar");

        }else if(id==R.id.Einglish){
           setLocale("en");
        }

        return super.onOptionsItemSelected(item);
    }
    @SuppressWarnings("deprecation")
    public  void setLocale(String lang){
        Locale mylocale=new Locale(lang);
        DisplayMetrics dm=getResources().getDisplayMetrics();
        Configuration conf=getResources().getConfiguration();
        conf.locale=mylocale;
        getResources().updateConfiguration(conf,dm);
        Intent intent=new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
        finish();

    }
}