package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Cylinder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        EditText radiustxt=findViewById(R.id.radius);
        EditText heighttxt=findViewById(R.id.height);
        Button button=findViewById(R.id.btn3);
        TextView volumetxt=findViewById(R.id.volume);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double radius=Double.parseDouble(radiustxt.getText().toString());
                double height=Double.parseDouble(heighttxt.getText().toString());
                double volume=3.14*radius*radius*height;
                volumetxt.setText(""+volume);
            }
        });
    }
}