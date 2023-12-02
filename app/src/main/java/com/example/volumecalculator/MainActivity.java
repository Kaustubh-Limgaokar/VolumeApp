package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    ArrayList<Shape> shapeArrayList;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridview);
        shapeArrayList = new ArrayList<>();
        Shape sphere = new Shape("Sphere", R.drawable.sphere);
        Shape cube = new Shape("Cube", R.drawable.cube);
        Shape cylinder = new Shape("Cylinder", R.drawable.cylinder);
        Shape prism = new Shape("Cuboid", R.drawable.prism);

        shapeArrayList.add(sphere);
        shapeArrayList.add(cube);
        shapeArrayList.add(cylinder);
        shapeArrayList.add(prism);

        adapter = new CustomAdapter(getApplicationContext(), shapeArrayList);
        gridView.setAdapter(adapter);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        Intent sphereintent = new Intent(getApplicationContext(), SphereVolume.class);
                        startActivity(sphereintent);
                        break;
                    case 1:
                        Intent cubeint = new Intent(getApplicationContext(), Cube.class);
                        startActivity(cubeint);
                        break;
                    case 2:
                        Intent cylinderint = new Intent(getApplicationContext(), Cylinder.class);
                        startActivity(cylinderint);
                        break;
                    case 3:
                        Intent cuboidint = new Intent(getApplicationContext(), Cuboid.class);
                        startActivity(cuboidint);
                        break;
                }

            }
        });


    }
}