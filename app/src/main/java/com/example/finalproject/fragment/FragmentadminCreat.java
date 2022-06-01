package com.example.finalproject.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.finalproject.R;
import com.example.finalproject.admin.adminCategories;


public class FragmentadminCreat extends Fragment {
    EditText number,password,email;
    Button btnlogin;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.createadmin, container, false);
         btnlogin=view.findViewById(R.id.admincreate);
//        email=view.findViewById(R.id.emailadmin);
//        password=view.findViewById(R.id.fieldpassadmin);
//        number=view.findViewById(R.id.fieldnameadmin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //              String number1=number.getText().toString();
                //              String email1=email.getText().toString();
//                String password1=password.getText().toString();
//                if (email1.equals("")){
//                    Toast.makeText(getApplicationContext(), "Enter email", Toast.LENGTH_SHORT).show();  }
//            else if(password1.equals("")){
//                    Toast.makeText(getApplicationContext(), "Enter password", Toast.LENGTH_SHORT).show();  }
//             else if(number1.equals("")){
////                    Toast.makeText(getApplicationContext(), "Enter number", Toast.LENGTH_SHORT).show();  }
////            else{}
//            }

            }
        });


        return view;
    }
}