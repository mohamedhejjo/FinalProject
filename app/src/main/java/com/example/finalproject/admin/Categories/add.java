package com.example.finalproject.admin.Categories;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.finalproject.R;
import com.example.finalproject.admin.Clothesa.addcolthes;
import com.example.finalproject.admin.Clothesa.adddevices;
import com.example.finalproject.admin.ViewPageradmin.Mytabadmin;
import com.example.finalproject.admin.ViewPageradmin.adapterpaferadmin;
import com.example.finalproject.admin.adminCategories;
import com.google.android.material.tabs.TabLayout;

public class add extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


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