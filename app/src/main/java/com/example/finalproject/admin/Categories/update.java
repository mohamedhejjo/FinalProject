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

import com.example.finalproject.R;
import com.example.finalproject.admin.Clothesa.Updatecolthes;
import com.example.finalproject.admin.Clothesa.Updatedevice;
import com.example.finalproject.admin.adminCategories;
import com.google.android.material.tabs.TabLayout;

public class update extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.update);
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
        getMenuInflater().inflate(R.menu.meunupdate,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.homeupdate){
            Intent intent=new Intent(getApplicationContext(), adminCategories.class);
            startActivity(intent);

        }else if(id==R.id.updatecoltes){
            Intent intent=new Intent(getApplicationContext(), Updatecolthes.class);
            startActivity(intent);
        }
        else if(id==R.id.updatedevices){
            Intent intent=new Intent(getApplicationContext(), Updatedevice.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}