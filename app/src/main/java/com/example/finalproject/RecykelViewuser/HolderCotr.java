package com.example.finalproject.RecykelViewuser;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalproject.R;

public class HolderCotr extends RecyclerView.ViewHolder {
    View view;
    TextView textView;
    ImageButton imagebutton;

    public HolderCotr(@NonNull View itemView) {
        super(itemView);
        view=itemView;
        textView=itemView.findViewById(R.id.textviewe);
        imagebutton=itemView.findViewById(R.id.imagebutton);
    }
}
