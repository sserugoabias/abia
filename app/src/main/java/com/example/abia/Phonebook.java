package com.example.abia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Phonebook extends AppCompatActivity {
    EditText phoneNumber;
    Button callButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phonebook);
        phoneNumber=findViewById(R.id.number);
        callButton=findViewById(R.id.callbtn);
        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_CALL);
                String num=phoneNumber.getText().toString();
                if(num.trim().isEmpty()){
                    Toast.makeText(Phonebook.this,"Please enter your number",Toast.LENGTH_SHORT);
                }
                else {
                    intent.setData(Uri.parse("tel"+num));
                }
                if(ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    Toast.makeText(Phonebook.this,"Please Grant Permission",Toast.LENGTH_SHORT);
                    requestPermission();
                }

                else{
                    startActivity(intent);
                }
            }

        });
    }
    private void requestPermission(){
        ActivityCompat.requestPermissions(Phonebook.this,new String[]{Manifest.permission.CALL_PHONE},1);
    }
}
