package com.example.finalproject.admin.Categories;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;

import com.example.finalproject.MainActivity;
import com.example.finalproject.R;
import com.example.finalproject.admin.Clothesa.addcolthes;
import com.example.finalproject.admin.Clothesa.adddevices;
import com.example.finalproject.admin.ViewPageradmin.Mytabadmin;
import com.example.finalproject.admin.ViewPageradmin.adapterpaferadmin;
import com.example.finalproject.admin.adminCategories;
import com.example.finalproject.splash.splash;
import com.google.android.material.tabs.TabLayout;

public class add extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            }
        }, 10000);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
getMenuInflater().inflate(R.menu.menuadd,menu);
return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.home){
            Intent intent=new Intent(getApplicationContext(), adminCategories.class);
            startActivity(intent);

        }else if(id==R.id.addcoltes){
            Intent intent=new Intent(getApplicationContext(), addcolthes.class);
            startActivity(intent);
        }
        else if(id==R.id.adddevices){
            Intent intent=new Intent(getApplicationContext(), adddevices.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}