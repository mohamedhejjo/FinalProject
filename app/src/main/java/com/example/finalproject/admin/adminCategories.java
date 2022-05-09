package com.example.finalproject.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import com.example.finalproject.R;
import com.example.finalproject.admin.Categories.bookadmin;
import com.example.finalproject.admin.Categories.clothesadmin;
import com.example.finalproject.admin.Categories.devicesadmin;

public class adminCategories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admincategories);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ImageButton imageclothes=findViewById(R.id.Clotheshomeadmin);
        ImageButton imagecomputer=findViewById(R.id.deviceshomeadmin);
        ImageButton imagebook=findViewById(R.id.bookhomeadmin);

        imageclothes.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(), clothesadmin.class);
            startActivity(intent);
        });
        imagecomputer.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(), devicesadmin.class);
            startActivity(intent);
        });
        imagebook.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(), bookadmin.class);
            startActivity(intent);
        });

    }
}