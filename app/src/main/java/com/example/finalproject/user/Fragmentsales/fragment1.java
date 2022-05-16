package com.example.finalproject.user.Fragmentsales;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.finalproject.R;
import com.example.finalproject.RecykelViewUserConterg.AdapterUbdate;
import com.example.finalproject.RecykelViewUserConterg.Adapterfinaluser;
import com.example.finalproject.RecykelViewUserConterg.ClassShowPrice;

import java.util.ArrayList;


public class fragment1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment1, container, false);
        ArrayList<ClassShowPrice> data=new ArrayList<>();
        data.add(new ClassShowPrice("male1",R.drawable.male,"300","jacket","female"));
        data.add(new ClassShowPrice("female",R.drawable.female,"400","jacket","female"));
        data.add(new ClassShowPrice("male",R.drawable.male,"500","jacket","female"));
        data.add(new ClassShowPrice("female",R.drawable.female,"600","jacket","female"));
        RecyclerView rv=view.findViewById(R.id.recy1);
        Adapterfinaluser ad=new Adapterfinaluser(data);
        rv.setAdapter(ad);
        rv.hasFixedSize();
        RecyclerView.LayoutManager lm=new LinearLayoutManager(container.getContext());
        rv.setLayoutManager(lm);
        return view;
    }
}