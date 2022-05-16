package com.example.finalproject.user.Categories;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;

import com.example.finalproject.R;
import com.example.finalproject.RecykelViewUserConterg.ClassShowPrice;
import com.example.finalproject.RecykelViewuser.ClassCotr;
import com.example.finalproject.user.Fragmentsales.fragment1;
import com.example.finalproject.user.Fragmentsales.fragment10;
import com.example.finalproject.user.Fragmentsales.fragment11;
import com.example.finalproject.user.Fragmentsales.fragment12;
import com.example.finalproject.user.Fragmentsales.fragment2;
import com.example.finalproject.user.Fragmentsales.fragment3;
import com.example.finalproject.user.Fragmentsales.fragment4;
import com.example.finalproject.user.Fragmentsales.fragment5;
import com.example.finalproject.user.Fragmentsales.fragment6;
import com.example.finalproject.user.Fragmentsales.fragment7;
import com.example.finalproject.user.Fragmentsales.fragment8;
import com.example.finalproject.user.Fragmentsales.fragment9;

public class activityuserfinal extends AppCompatActivity {
FragmentManager fm;
FragmentTransaction ft;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityuserfinal);
        Intent intent=getIntent();
        String pro=intent.getStringExtra("finaluser");
        if (pro.equals("jacket")){
            fragment1 f1=new fragment1();
            FragmentManager   fm=getSupportFragmentManager();
            FragmentTransaction     ft=fm.beginTransaction();
            ft.replace(R.id.Fragmentuserfinal,f1);
            ft.commit();
        }else if(pro.equals("shoe")){
            fragment2 f2=new fragment2();
            fm=getSupportFragmentManager();
            ft=fm.beginTransaction();
            ft.replace(R.id.Fragmentuserfinal,f2);
            ft.commit();
        }else if(pro.equals("jeans")){
            fragment3 f3=new fragment3();
            fm=getSupportFragmentManager();
            ft=fm.beginTransaction();
            ft.replace(R.id.Fragmentuserfinal,f3);
            ft.commit();
        }else if(pro.equals("hat")){
            fragment4 f4=new fragment4();
            fm=getSupportFragmentManager();
            ft=fm.beginTransaction();
            ft.replace(R.id.Fragmentuserfinal,f4);
            ft.commit();
        }else if(pro.equals("fjacket")){
            fragment5 f5=new fragment5();
            fm=getSupportFragmentManager();
            ft=fm.beginTransaction();
            ft.replace(R.id.Fragmentuserfinal,f5);
            ft.commit();
        }else if(pro.equals("fshoe")){
            fragment6 f6=new fragment6();
            fm=getSupportFragmentManager();
            ft=fm.beginTransaction();
            ft.replace(R.id.Fragmentuserfinal,f6);
            ft.commit();
        }else if(pro.equals("fdress")){
            fragment7 f7=new fragment7();
            fm=getSupportFragmentManager();
            ft=fm.beginTransaction();
            ft.replace(R.id.Fragmentuserfinal,f7);
            ft.commit();
        }else if(pro.equals("fhat")){
            fragment8 f8=new fragment8();
            fm=getSupportFragmentManager();
            ft=fm.beginTransaction();
            ft.replace(R.id.Fragmentuserfinal,f8);
            ft.commit();
        }else if(pro.equals("laptop")){
            fragment9 f9=new fragment9();
            fm=getSupportFragmentManager();
            ft=fm.beginTransaction();
            ft.replace(R.id.Fragmentuserfinal,f9);
            ft.commit();
        }else if(pro.equals("mouse")){
            fragment10 f10=new fragment10();
            fm=getSupportFragmentManager();
            ft=fm.beginTransaction();
            ft.replace(R.id.Fragmentuserfinal,f10);
            ft.commit();
        }else if(pro.equals("keyboard")){
            fragment11 f11=new fragment11();
            fm=getSupportFragmentManager();
            ft=fm.beginTransaction();
            ft.replace(R.id.Fragmentuserfinal,f11);
            ft.commit();
        }else if(pro.equals("playstation")){
            fragment12 f12=new fragment12();
            fm=getSupportFragmentManager();
            ft=fm.beginTransaction();
            ft.replace(R.id.Fragmentuserfinal,f12);
            ft.commit();
        }

    }
}