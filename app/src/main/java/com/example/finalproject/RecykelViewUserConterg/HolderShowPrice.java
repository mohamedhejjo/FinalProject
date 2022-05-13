package com.example.finalproject.RecykelViewUserConterg;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalproject.R;

public class HolderShowPrice extends RecyclerView.ViewHolder {
    TextView name;
    TextView price;
    ImageView image;
    View view;
    public HolderShowPrice(@NonNull View itemView) {
        super(itemView);
        view =itemView;
        name=itemView.findViewById(R.id.nameuser);
        image=itemView.findViewById(R.id.imageuser);
        price=itemView.findViewById(R.id.priceuser);

    }
}
