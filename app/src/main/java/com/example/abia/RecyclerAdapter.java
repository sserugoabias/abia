package com.example.abia;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ExampleViewHolder> {
    private ArrayList<ExampleItemRecycler> mExampleList;

    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recy2, parent,false);
        ExampleViewHolder vh=new ExampleViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {
        ExampleItemRecycler exampleItemRecycler=mExampleList.get(position);
        holder.imageView.setImageResource(exampleItemRecycler.getImageResource());
        holder.textView1.setText(exampleItemRecycler.getText1());
        holder.textView2.setText(exampleItemRecycler.getText2());

    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }

    public static class ExampleViewHolder extends RecyclerView.ViewHolder{
        public ImageView imageView;
        public TextView textView1;
        public TextView textView2;

        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.immage);
            textView1=itemView.findViewById(R.id.txt1);
            textView2=itemView.findViewById(R.id.txt2);

        }


    }
    public RecyclerAdapter(ArrayList<ExampleItemRecycler>examplelist){
        mExampleList =examplelist;
    }

}
