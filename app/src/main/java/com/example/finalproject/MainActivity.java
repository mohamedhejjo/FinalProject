package com.example.finalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

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
import com.example.finalproject.admin.admin;
import com.example.finalproject.admin.adminCategories;
import com.example.finalproject.user.user;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button loginadmin=findViewById(R.id.loginadmin);
        Button loginuser=findViewById(R.id.loginuser);
        loginadmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), admin.class);
                startActivity(intent);
            }
        });
        loginuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), user.class);
                startActivity(intent);
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
    }
}