package com.example.finalproject.user.Clothes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.finalproject.R;
import com.example.finalproject.RecykelViewuser.AdapterCotr;
import com.example.finalproject.RecykelViewuser.ClassCotr;

import java.util.ArrayList;

public class userfemale extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userfemale);
        ArrayList<ClassCotr> data=new ArrayList<>();
        data.add(new ClassCotr("jacket",R.drawable.jacuetfemale));
        data.add(new ClassCotr("shoe",R.drawable.shosefemale));
        data.add(new ClassCotr("dress",R.drawable.fastun));
        data.add(new ClassCotr("hat",R.drawable.hatfemale));

        RecyclerView rv=findViewById(R.id.rec3);
        AdapterCotr ad=new AdapterCotr(data);
        rv.setAdapter(ad);
        rv.hasFixedSize();
        RecyclerView.LayoutManager lm=new LinearLayoutManager(this);
        rv.setLayoutManager(lm);
    }
}