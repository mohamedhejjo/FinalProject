package com.example.finalproject.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.finalproject.R;
import com.example.finalproject.RecykelViewUserConterg.AdapterShowPrice;
import com.example.finalproject.RecykelViewUserConterg.Adapterdelete;
import com.example.finalproject.RecykelViewUserConterg.ClassShowPrice;

import java.util.ArrayList;

public class Fragmentdeletecolthesmale extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup pernet,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_fragmentdeletecolthesmale, pernet, false);
        ArrayList<ClassShowPrice> data=new ArrayList<>();
        String male= getString(R.string.male);
        String jacket=getString(R.string.jacket);
        String shoe= getString(R.string.shoe);
        String jeans= getString(R.string.jeans);
        String hat= getString(R.string.hat);
        data.add(new ClassShowPrice("male!",R.drawable.male,"50",jacket,male));
        data.add(new ClassShowPrice("male!",R.drawable.female,"80",shoe,male));
        data.add(new ClassShowPrice("male!",R.drawable.male,"100",jeans,male));
        data.add(new ClassShowPrice("male!",R.drawable.female,"200",hat,male));
        RecyclerView rv=view.findViewById(R.id.rec9);
        Adapterdelete ad=new Adapterdelete(data);
        rv.setAdapter(ad);
        rv.hasFixedSize();
        RecyclerView.LayoutManager lm=new LinearLayoutManager(pernet.getContext());
        rv.setLayoutManager(lm);
        return view;
    }
}