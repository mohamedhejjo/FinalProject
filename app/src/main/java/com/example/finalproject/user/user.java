package com.example.finalproject.user;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.finalproject.R;
import com.example.finalproject.fragment.FragmentuserCreate;
import com.example.finalproject.fragment.Fragmentuserlogin;

public class user extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Button btnlogin=findViewById(R.id.userloginhome);
        Button btnCreate=findViewById(R.id.usercreatehome);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragmentuserlogin ful=new Fragmentuserlogin();
                FragmentManager FM=getSupportFragmentManager();
                FragmentTransaction FT=FM.beginTransaction();
                FT.replace(R.id.fragmentuser,ful);
                FT.commit();
            }
        });
        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentuserCreate fuc=new FragmentuserCreate();
                FragmentManager FM=getSupportFragmentManager();
                FragmentTransaction FT=FM.beginTransaction();
                FT.replace(R.id.fragmentuser,fuc);
                FT.commit();
            }
        });
    }
}