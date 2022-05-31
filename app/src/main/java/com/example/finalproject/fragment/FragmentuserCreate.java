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
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;


public class FragmentuserCreate extends Fragment {
    private FirebaseAuth firebaseAuth;
    private  FirebaseFirestore firebaseFirestore;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v= inflater.inflate(R.layout.fragmentusercreate, container, false);

        firebaseAuth=FirebaseAuth.getInstance();
        EditText name=v.findViewById(R.id.ed1user);
        EditText email=v.findViewById(R.id.ed2user);
        EditText pass=v.findViewById(R.id.ed3user);
        Button bnt=v.findViewById(R.id.usercreate);
        bnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email1=email.getText().toString();
                String pass1=pass.getText().toString();
                firebaseAuth.createUserWithEmailAndPassword(email1,pass1).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(getContext(), "yes", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(getContext(), "No", Toast.LENGTH_SHORT).show();

                        }
                    } });
                } }  );
    return v;
    }}
