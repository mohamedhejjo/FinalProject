package com.example.finalproject.user.Categories;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.finalproject.R;
import com.example.finalproject.RecykelViewuser.AdapterCotr;
import com.example.finalproject.RecykelViewuser.ClassCotr;

import java.util.ArrayList;

public class devices extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.devices);
        ArrayList<ClassCotr> data=new ArrayList<>();
        data.add(new ClassCotr("laptop",R.drawable.labtab));
        data.add(new ClassCotr("mouse",R.drawable.mos));
        data.add(new ClassCotr("keyboard",R.drawable.lwha));
        data.add(new ClassCotr("playstation",R.drawable.boks));
        RecyclerView rv=findViewById(R.id.rec5);
        AdapterCotr ad=new AdapterCotr(data);
        rv.setAdapter(ad);
        rv.hasFixedSize();
        RecyclerView.LayoutManager lm=new LinearLayoutManager(this);
        rv.setLayoutManager(lm);
    }
}