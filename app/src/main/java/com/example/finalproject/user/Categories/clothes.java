package com.example.finalproject.user.Categories;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.finalproject.R;
import com.example.finalproject.RecykelViewuser.AdapterCotr;
import com.example.finalproject.RecykelViewuser.ClassCotr;

import java.util.ArrayList;

public class clothes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clothes);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        ImageButton male=findViewById(R.id.malename);
//        ImageButton female=findViewById(R.id.femalename);
//        male.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(getApplicationContext(), usermale.class);
//                startActivity(intent);
//            }
//        });
//        female.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(getApplicationContext(), userfemale.class);
//                startActivity(intent);
//            }
//        });
        String male= getString(R.string.male);
        String female= getString(R.string.female);
        ArrayList<ClassCotr> data=new ArrayList<>();
        data.add(new ClassCotr(male,R.drawable.male));
        data.add(new ClassCotr(female,R.drawable.female));
        RecyclerView rv=findViewById(R.id.rec2);
        AdapterCotr ad=new AdapterCotr(data);
        rv.setAdapter(ad);
        rv.hasFixedSize();
        RecyclerView.LayoutManager lm=new LinearLayoutManager(this);
        rv.setLayoutManager(lm);
    }
}