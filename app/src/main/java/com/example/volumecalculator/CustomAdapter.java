package com.example.volumecalculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Shape> {

    private ArrayList<Shape> shapeArrayList;
    Context context;

    public CustomAdapter(@NonNull Context context, ArrayList<Shape> shapeArrayList) {
        super(context, R.layout.grid_layout,shapeArrayList);
        this.shapeArrayList = shapeArrayList;
        this.context = context;

    }
    private static class MyViewHolder{
        TextView name;
        ImageView image;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Shape shape=getItem(position);
        MyViewHolder myViewHolder;
        if(convertView==null){
            myViewHolder=new MyViewHolder();
            LayoutInflater inflater=LayoutInflater.from(getContext());
            convertView=inflater.inflate(R.layout.grid_layout,parent,false);
            myViewHolder.name=(TextView) convertView.findViewById(R.id.name);
            myViewHolder.image=(ImageView) convertView.findViewById(R.id.image);
            convertView.setTag(myViewHolder);
        }
        else{
            myViewHolder=(MyViewHolder) convertView.getTag();

        }
        myViewHolder.name.setText(shape.getName());
        myViewHolder.image.setImageResource(shape.getImage());

        return convertView;
    }
}
