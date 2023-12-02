package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cuboid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuboid);

        EditText lengthtxt=findViewById(R.id.length);
        EditText widthtxt=findViewById(R.id.width);
        EditText heighttxt=findViewById(R.id.height);
        Button button=findViewById(R.id.btn4);
        TextView volumetxt=findViewById(R.id.volume);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double length=Double.parseDouble(lengthtxt.getText().toString());
                double width=Double.parseDouble(widthtxt.getText().toString());
                double height=Double.parseDouble(heighttxt.getText().toString());
                double volume=length*width*height;
                volumetxt.setText(""+volume);

            }
        });

    }
}