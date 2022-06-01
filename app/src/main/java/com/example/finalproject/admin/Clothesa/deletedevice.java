package com.example.finalproject.admin.Clothesa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.finalproject.R;
import com.example.finalproject.RecykelViewUserConterg.AdapterShowPrice;
import com.example.finalproject.RecykelViewUserConterg.Adapterdelete;
import com.example.finalproject.RecykelViewUserConterg.ClassShowPrice;

import java.util.ArrayList;

public class deletedevice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_deletedevice);
        ArrayList<ClassShowPrice> data=new ArrayList<>();
        data.add(new ClassShowPrice("male!",R.drawable.male,"77","ee"));
        data.add(new ClassShowPrice("female!",R.drawable.female,"88","ee"));
        data.add(new ClassShowPrice("male!",R.drawable.male,"99","ee"));
        data.add(new ClassShowPrice("female!",R.drawable.female,"55","ee"));
        RecyclerView rv=findViewById(R.id.rec11);
        Adapterdelete ad=new Adapterdelete(data);
        rv.setAdapter(ad);
        rv.hasFixedSize();
        RecyclerView.LayoutManager lm=new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(lm);
    }
}