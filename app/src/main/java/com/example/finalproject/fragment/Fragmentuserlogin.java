package com.example.finalproject.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.finalproject.R;
import com.example.finalproject.user.userCategories;


public class Fragmentuserlogin extends Fragment {

EditText email,password;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragmentuserlogin, container, false);
        Button btnuser=view.findViewById(R.id.userlogin);
//        email=view.findViewById(R.id.fieldemaillogin);
//        password=view.findViewById(R.id.fieldpassuserlogin);
        btnuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String email1=email.getText().toString();
//                String pass1=password.getText().toString();
//                if (email1.equals("")){
//                    Toast.makeText(getContext(), "Enter email", Toast.LENGTH_SHORT).show();
//                }else if(pass1.equals("")) {
//                    Toast.makeText(getContext(), "Enter password", Toast.LENGTH_SHORT).show();  }
//                else {}

                Intent intent = new Intent(getActivity().getBaseContext(), userCategories.class);
                startActivity(intent);
            }
        });
        return view;
    }
}