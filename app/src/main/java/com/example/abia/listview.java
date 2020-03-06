package com.example.abia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class listview extends AppCompatActivity {
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        listView=findViewById(R.id.list);
        final ArrayList<String>arrayList=new ArrayList<>();


        arrayList.add("androidPrograming");
        arrayList.add("DatabaseProgramming");
        arrayList.add("ComputerGraphics");
        arrayList.add("ClientServer");
        arrayList.add("oop2");
        arrayList.add("information systems");
        arrayList.add("mathematics for IT");
        arrayList.add("systems security");
        arrayList.add("computer networks");
        arrayList.add("Business Intelligence");
        arrayList.add("E_Commerce");
        arrayList.add("ClientServer");
        arrayList.add("mathematics for IT");
        arrayList.add("systems security");
        arrayList.add("System Analysis");
        arrayList.add("Computer Security");
        arrayList.add("Web development");
        arrayList.add("ClientServer");
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int index, long l) {
                Object clickItemObj = adapterView.getAdapter().getItem(index);
                Toast.makeText(listview.this, "You clicked " + clickItemObj.toString(), Toast.LENGTH_SHORT).show();
                {
                }
            }
        });


    }
    }

