package com.example.finalproject.admin.Clothesa;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import com.example.finalproject.R;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;

public class Updateprofinalcolthes extends AppCompatActivity {

    Spinner spinner1;
    Spinner spinner2;
    private ImageView addimage;
    static byte[] imageContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.updateprofinalcolthes);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        spinner1 = findViewById(R.id.spinner11);
        spinner2 = findViewById(R.id.spinner22);
        addimage=findViewById(R.id.updateimage);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> prent, View view, int i, long l) {
                String selected = prent.getItemAtPosition(i).toString();
                if (selected.equals("male")) {
                    ArrayList<String> male = new ArrayList<>();
                    male.add("mjacket");
                    male.add("mshoe");
                    male.add("mjeans");
                    male.add("mhat");
                    ArrayAdapter<String> adaptermale = new ArrayAdapter<String>(prent.getContext(), android.R.layout.simple_spinner_dropdown_item, male);
                    spinner2.setAdapter(adaptermale);
                } else if (selected.equals("female")) {
                    ArrayList<String> female = new ArrayList<>();
                    female.add("fjacket");
                    female.add("fshoe");
                    female.add("fdress");
                    female.add("fhat");
                    ArrayAdapter<String> adapterfemale = new ArrayAdapter<String>(prent.getContext(), android.R.layout.simple_spinner_dropdown_item, female);
                    spinner2.setAdapter(adapterfemale);


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    public void Mohamed(View view) {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("image/*");
        startActivityForResult(intent,100);

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==100 && resultCode==RESULT_OK){
            Uri imageuri =data.getData();
            try {
                InputStream inputStream=getContentResolver().openInputStream(imageuri);
                Bitmap descorStream = BitmapFactory.decodeStream(inputStream);
                addimage.setImageBitmap(descorStream);
                imageContent=getBytes(descorStream);
            }catch (Exception ex){
                ex.printStackTrace();
            }

        }}
    private byte[] getBytes(Bitmap descorStream) {
        ByteArrayOutputStream stream=new ByteArrayOutputStream();
        descorStream.compress(Bitmap.CompressFormat.PNG,0,stream);
        return stream.toByteArray();
    }}
