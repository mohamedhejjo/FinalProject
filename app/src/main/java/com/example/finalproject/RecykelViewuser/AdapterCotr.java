package com.example.finalproject.RecykelViewuser;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalproject.R;
import com.example.finalproject.user.Categories.book;
import com.example.finalproject.user.Categories.clothes;
import com.example.finalproject.user.Categories.devices;
import com.example.finalproject.user.Clothes.userfemale;
import com.example.finalproject.user.Clothes.usermale;

import java.util.ArrayList;

public class AdapterCotr extends RecyclerView.Adapter<HolderCotr> {
    ArrayList<ClassCotr>data;
    Context context;

    public AdapterCotr(ArrayList<ClassCotr> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public HolderCotr onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context=parent.getContext();
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.itemde,parent,false);
        return new HolderCotr(v);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderCotr holder, int position) {
        ClassCotr c=data.get(position);
        holder.imagebutton.setImageResource(c.getImageview());
        holder.textView.setText(c.getTextview());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            if (holder.textView.getText().equals("book")){
                Intent intent=new Intent(context, book.class);
                context.startActivity(intent);           }
            else if(holder.textView.getText().equals("clothes")) {
                Intent intent=new Intent(context, clothes.class);
                context.startActivity(intent);           }
            else if(holder.textView.getText().equals("devices")) {
                Intent intent=new Intent(context, devices.class);
                context.startActivity(intent);           }
            else if(holder.textView.getText().equals("male")) {
                Intent intent=new Intent(context, usermale.class);
                context.startActivity(intent);           }
            else if(holder.textView.getText().equals("female")) {
                Intent intent=new Intent(context, userfemale.class);
                context.startActivity(intent);           }
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
