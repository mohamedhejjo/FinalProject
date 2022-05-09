package com.example.finalproject.user.Categories;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.finalproject.R;
import com.example.finalproject.user.Clothes.userfemale;
import com.example.finalproject.user.Clothes.usermale;

public class clothes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clothes);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ImageButton male=findViewById(R.id.malename);
        ImageButton female=findViewById(R.id.femalename);
        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), usermale.class);
                startActivity(intent);
            }
        });
        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), userfemale.class);
                startActivity(intent);
            }
        });
    }
}