package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SphereVolume extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere_volume);

        Button button=findViewById(R.id.btn1);
        EditText radiustxt = findViewById(R.id.radius);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String r = radiustxt.getText().toString();


                double rad = Double.parseDouble(r);
                double ans = 1.33*3.14*rad*rad*rad;
                TextView answertxt=findViewById(R.id.volume);
                answertxt.setText(""+ans);

            }
        });


////        Intent intsphere2=getIntent();

//        startActivity(intsphere2);

    }
}