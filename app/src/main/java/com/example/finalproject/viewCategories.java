package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import com.example.finalproject.Categories.book;
import com.example.finalproject.Categories.clothes;
import com.example.finalproject.Categories.devices;

public class viewCategories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewcategories);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ImageButton imageclothes=findViewById(R.id.Clotheshome);
        ImageButton imagecomputer=findViewById(R.id.deviceshome);
        ImageButton imagebook=findViewById(R.id.bookhome);

        imageclothes.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(), clothes.class);
            startActivity(intent);
        });
        imagecomputer.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(), devices.class);
            startActivity(intent);
        });
        imagebook.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(), book.class);
            startActivity(intent);
        });

    }
}