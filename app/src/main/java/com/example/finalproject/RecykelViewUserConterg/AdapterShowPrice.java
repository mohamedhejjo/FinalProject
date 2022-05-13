package com.example.finalproject.RecykelViewUserConterg;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalproject.R;

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
    holder.view.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
