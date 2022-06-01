package com.example.finalproject.admin.Clothesa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.finalproject.R;
import com.example.finalproject.RecykelViewUserConterg.AdapterShowPrice;
import com.example.finalproject.RecykelViewUserConterg.ClassShowPrice;

import java.util.ArrayList;

public class Updatedevice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.updatedevice);
        ArrayList<ClassShowPrice> data=new ArrayList<>();
        data.add(new ClassShowPrice("male",R.drawable.male,"100","laptop"));
        data.add(new ClassShowPrice("female",R.drawable.female,"200","mouse"));
        data.add(new ClassShowPrice("male",R.drawable.male,"500","keyboard"));
        data.add(new ClassShowPrice("female",R.drawable.female,"800","playstation"));
        RecyclerView rv=findViewById(R.id.rec6);
        AdapterShowPrice ad=new AdapterShowPrice(data);
        rv.setAdapter(ad);
        rv.hasFixedSize();
        RecyclerView.LayoutManager lm=new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(lm);
    }
}