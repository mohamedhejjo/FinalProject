package com.example.finalproject.admin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.finalproject.R;
import com.example.finalproject.fragment.FragmentadminCreate;
import com.example.finalproject.fragment.Fragmentadminlogin;

public class admin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Button btnlogin=findViewById(R.id.loginadminhome);
        Button btncreate=findViewById(R.id.createadminhome);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragmentadminlogin fal=new Fragmentadminlogin();
                FragmentManager FM=getSupportFragmentManager();
                FragmentTransaction FT=FM.beginTransaction();
                FT.replace(R.id.fragmentadmin,fal);
                FT.commit();
            }
        });
        btncreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentadminCreate fac=new FragmentadminCreate();
                FragmentManager FM=getSupportFragmentManager();
                FragmentTransaction FT=FM.beginTransaction();
                FT.replace(R.id.fragmentadmin,fac);
                FT.commit();
            }
        });
    }
}