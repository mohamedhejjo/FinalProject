package com.example.finalproject.user;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.finalproject.RecykelViewuser.AdapterCotr;
import com.example.finalproject.RecykelViewuser.ClassCotr;
import com.example.finalproject.R;

import java.util.ArrayList;

public class userCategories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewcategories);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
     /*   ImageButton imageclothes=findViewById(R.id.Clotheshome);
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
        });*/
        ArrayList<ClassCotr> data=new ArrayList<>();
        String clothes= getString(R.string.app_name4);
        String devices= getString(R.string.app_name5);
        data.add(new ClassCotr(clothes,R.drawable.clothes));
        data.add(new ClassCotr(devices,R.drawable.computer));

        RecyclerView rv=findViewById(R.id.rec);
        AdapterCotr ad=new AdapterCotr(data);
        rv.setAdapter(ad);
        rv.hasFixedSize();
        RecyclerView.LayoutManager lm=new LinearLayoutManager(this);
        rv.setLayoutManager(lm);
    }
}

