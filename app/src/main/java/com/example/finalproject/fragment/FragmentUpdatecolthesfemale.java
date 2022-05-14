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
import com.example.finalproject.RecykelViewUserConterg.AdapterUbdate;
import com.example.finalproject.RecykelViewUserConterg.ClassShowPrice;

import java.util.ArrayList;


public class FragmentUpdatecolthesfemale extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup pernet,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_updatecolthesfemale, pernet, false);
        ArrayList<ClassShowPrice> data=new ArrayList<>();
        data.add(new ClassShowPrice("male",R.drawable.male,"300","ee","female"));
        data.add(new ClassShowPrice("female",R.drawable.female,"400","ee","female"));
        data.add(new ClassShowPrice("male",R.drawable.male,"500","ee","female"));
        data.add(new ClassShowPrice("female",R.drawable.female,"600","ee","female"));
        RecyclerView rv=view.findViewById(R.id.rec7);
        AdapterUbdate ad=new AdapterUbdate(data);
        rv.setAdapter(ad);
        rv.hasFixedSize();
        RecyclerView.LayoutManager lm=new LinearLayoutManager(pernet.getContext());
        rv.setLayoutManager(lm);
        return view;
    }
}