package com.example.finalproject.admin.Categories;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.finalproject.R;

public class bookadmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bookadmin);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}