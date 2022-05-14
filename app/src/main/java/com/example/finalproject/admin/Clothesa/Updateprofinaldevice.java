package com.example.finalproject.admin.Clothesa;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.finalproject.R;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class Updateprofinaldevice extends AppCompatActivity {
    private ImageView addimage;
    static byte[] imageContentdevicesUpdate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.updateprofinaldevice);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
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
                imageContentdevicesUpdate=getBytes(descorStream);
            }catch (Exception ex){
                ex.printStackTrace();
            }

        }}
    private byte[] getBytes(Bitmap descorStream) {
        ByteArrayOutputStream stream=new ByteArrayOutputStream();
        descorStream.compress(Bitmap.CompressFormat.PNG,0,stream);
        return stream.toByteArray();
    }

}