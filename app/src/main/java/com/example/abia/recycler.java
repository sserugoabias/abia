package com.example.abia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class recycler extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        ArrayList<ExampleItemRecycler> examplelist=new ArrayList<>();
        examplelist.add(new ExampleItemRecycler(R.drawable.ic_android,"Language","Android"));
        examplelist.add(new ExampleItemRecycler(R.drawable.k1,"Club","Chelsea"));
        examplelist.add(new ExampleItemRecycler(R.drawable.k2,"Club","Arsenal"));
        examplelist.add(new ExampleItemRecycler(R.drawable.k3,"Club","Manchester City"));
        examplelist.add(new ExampleItemRecycler(R.drawable.k4,"Club","Tottenham Hotspurs"));
        examplelist.add(new ExampleItemRecycler(R.drawable.k5,"Club","Barcelona"));
        examplelist.add(new ExampleItemRecycler(R.drawable.k6,"Club","Real Madrid"));
        examplelist.add(new ExampleItemRecycler(R.drawable.k7,"Club","Everton"));
        examplelist.add(new ExampleItemRecycler(R.drawable.k8,"Club","Liverpool"));
        examplelist.add(new ExampleItemRecycler(R.drawable.k9,"Club","PSG"));
        examplelist.add(new ExampleItemRecycler(R.drawable.k10,"Club","Juventus"));
        examplelist.add(new ExampleItemRecycler(R.drawable.k11,"Club","Wolves"));
        examplelist.add(new ExampleItemRecycler(R.drawable.k12,"Club","WestHam United"));
        examplelist.add(new ExampleItemRecycler(R.drawable.k13,"Club","Norwich City"));
        examplelist.add(new ExampleItemRecycler(R.drawable.k14,"Club","Manchester United"));

        recyclerView=findViewById(R.id.cycler);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this);
        adapter=new RecyclerAdapter(examplelist);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
