package com.example.finalproject.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.finalproject.R;


public class FragmentadminUpdate extends Fragment {
    EditText numberold,passwordold,numbernew,passwordnew;
    Button btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragmentadminupdate, container, false);
        btn=view.findViewById(R.id.admincreate);
//        numberold=view.findViewById(R.id.fieldnameadminold);
//        passwordold=view.findViewById(R.id.fieldidentadminold);
//        numbernew=view.findViewById(R.id.fieldnumberadminnew);
//        passwordnew=view.findViewById(R.id.fieldpassadminnew);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //              String numberold1=numberold.getText().toString();
//                String passwordold1=passwordold.getText().toString();
                //              String numbernew1=numbernew.getText().toString();
//                String passwordnew1=passwordnew.getText().toString();
//                if (numberold1.equals("")){
//                    Toast.makeText(getApplicationContext(), "Enter numberold", Toast.LENGTH_SHORT).show();  }
//            else if(passwordold1.equals("")){
//                    Toast.makeText(getApplicationContext(), "Enter passwordold", Toast.LENGTH_SHORT).show();  }
//             else if(numbernew1.equals("")){
////                    Toast.makeText(getApplicationContext(), "Enter numbernew", Toast.LENGTH_SHORT).show();  }
//    else if(passwordnew1.equals("")){
//                   Toast.makeText(getApplicationContext(), "Enter passwordnew", Toast.LENGTH_SHORT).show();  }
//       else{}
//            }

            }
        });
        return view;
    }
}