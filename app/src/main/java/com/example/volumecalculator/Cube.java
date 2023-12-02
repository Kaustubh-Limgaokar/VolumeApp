package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cube extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);
        Button button=findViewById(R.id.btn2);
        EditText sidetxt=findViewById(R.id.side);
        TextView v=findViewById(R.id.volume);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double side=Double.parseDouble(sidetxt.getText().toString());
                double volume=side*side*side;
                v.setText(""+volume);

            }
        });
    }
}