package com.example.finalproject.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.finalproject.R;
import com.example.finalproject.Users;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class FragmentuserCreate extends Fragment {

    EditText ed1,ed2,ed3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v= inflater.inflate(R.layout.fragmentusercreate, container, false);
          ed1 = v.findViewById(R.id.ed1user);
         ed2 = v.findViewById(R.id.ed2user);
         ed3 = v.findViewById(R.id.ed3user);

        Button btun =v.findViewById(R.id.usercreate);
        btun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
         addusertodatabase();

            }
        });



        return v;
    }

    private void addusertodatabase() {
        String name = ed1.getText().toString();
        String number = ed2.getText().toString();
        String password = ed3.getText().toString();
        if (name.isEmpty()){
            ed1.setError("can not be empty");
        }else if (number.isEmpty()){
            ed2.setError("can not be empty");
        }else if (password.isEmpty()){
            ed3.setError("can not be empty");
        }else{
            FirebaseDatabase db =FirebaseDatabase.getInstance();
            DatabaseReference drf =db.getReference("Users");
            String id = drf.push().getKey();
            Users users= new Users(id,name,number,password);

            drf.child(id).setValue(users).addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {
                    if (task.isSuccessful()){
                        Toast.makeText(getActivity(), "Successful"+"----and go to login ", Toast.LENGTH_SHORT).show();
                       ed1.setText("");
                        ed2.setText("");
                        ed3.setText("");


                    }else{
                        Toast.makeText(getActivity(), "filed", Toast.LENGTH_SHORT).show();


                    }
                }
            });
        }
    }
}