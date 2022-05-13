package com.example.finalproject.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import com.example.finalproject.R;

public class adminCategories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admincategories);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ImageButton add=findViewById(R.id.imageadmin1);
        ImageButton delete=findViewById(R.id.imageadmin2);
        ImageButton update=findViewById(R.id.imageadmin3);

        add.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(), com.example.finalproject.admin.Categories.add.class);
            startActivity(intent);
        });
        delete.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(), com.example.finalproject.admin.Categories.update.class);
            startActivity(intent);
        });
        update.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(), com.example.finalproject.admin.Categories.delete.class);
            startActivity(intent);
        });

    }
}