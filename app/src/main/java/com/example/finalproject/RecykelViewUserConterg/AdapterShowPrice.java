package com.example.finalproject.RecykelViewUserConterg;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalproject.R;
import com.example.finalproject.admin.Clothesa.Updateprofinalcolthes;
import com.example.finalproject.admin.Clothesa.Updateprofinaldevice;
import com.example.finalproject.admin.Clothesa.deletefinal;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class AdapterShowPrice extends RecyclerView.Adapter<HolderShowPrice> {
    ArrayList<ClassShowPrice>data;
    Context context;

    public AdapterShowPrice(ArrayList<ClassShowPrice> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public HolderShowPrice onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context=parent.getContext();
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.itemshowprice,parent,false);
        return new HolderShowPrice(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderShowPrice holder, int position) {
        ClassShowPrice csp=data.get(position);
        holder.name.setText(csp.getName());
holder.image.setImageResource(csp.getImage());
holder.price.setText(csp.getPrice());
        holder.pro.setText(csp.getPro());
        holder.female.setText(csp.getFemal());

            holder.item.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(csp.getPro().equals("laptop")||csp.getPro().equals("mouse")||csp.getPro().equals("keyboard")||csp.getPro().equals("playstation")){
                        Intent intent=new Intent(context, Updateprofinaldevice.class);
                        intent.putExtra("ClassShowPrice",csp);
                        context.startActivity(intent);

                    }
                }
            });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
