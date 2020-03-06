package com.example.abia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class cprogram extends AppCompatActivity {
    TextView cprog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cprogram);

        cprog=findViewById(R.id.cpro);
        String text="";
        try{
            InputStream input=getAssets().open("cprogram.c");
            int size=input.available();
            byte[]buffer=new byte[size];
            input.read(buffer);
            input.close();
            text=new String(buffer);
        }
        catch (IOException ex){
            ex.printStackTrace();

        }
        cprog.setText((CharSequence)text);



    }
}
