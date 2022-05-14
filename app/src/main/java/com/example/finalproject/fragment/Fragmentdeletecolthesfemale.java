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


public class Fragmentdeletecolthesfemale extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup pernet,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_fragmentdeletecolthesfemale, pernet, false);
        ArrayList<ClassShowPrice> data=new ArrayList<>();
        data.add(new ClassShowPrice("female!",R.drawable.female,"30","jacet","female"));
        data.add(new ClassShowPrice("female!",R.drawable.female,"40","eee","female"));
        data.add(new ClassShowPrice("female!",R.drawable.male,"60","fff","female"));
        data.add(new ClassShowPrice("female!",R.drawable.female,"70","sss","female"));
        RecyclerView rv=view.findViewById(R.id.rec10);
        Adapterdelete ad=new Adapterdelete(data);
        rv.setAdapter(ad);
        rv.hasFixedSize();
        RecyclerView.LayoutManager lm=new LinearLayoutManager(pernet.getContext());
        rv.setLayoutManager(lm);
        return view;
    }
}