package com.example.finalproject.admin.Categories;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.finalproject.R;
import com.example.finalproject.admin.Clothesa.Updatecolthes;
import com.example.finalproject.admin.Clothesa.Updatedevice;
import com.example.finalproject.admin.Clothesa.deletecolthes;
import com.example.finalproject.admin.Clothesa.deletedevice;
import com.example.finalproject.admin.adminCategories;

public class delete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.delete);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menudelete,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.homedelete){
            Intent intent=new Intent(getApplicationContext(), adminCategories.class);
            startActivity(intent);

        }else if(id==R.id.deletecoltes){
            Intent intent=new Intent(getApplicationContext(), deletecolthes.class);
            startActivity(intent);
        }
        else if(id==R.id.deletedevices){
            Intent intent=new Intent(getApplicationContext(), deletedevice.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

}