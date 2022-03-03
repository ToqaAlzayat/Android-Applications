package com.example.mazra3a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class opening_screen extends AppCompatActivity {
    ImageButton ib_registration;
    ImageButton ib_add_farm;
    ImageButton ib_add_activity;
    ImageButton ib_labor_distribution;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening_screen);
        ib_registration=findViewById(R.id.ib_registration);
        ib_registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(opening_screen.this,registration.class);
                startActivity(intent);
            }
        });
        ib_add_farm=findViewById(R.id.ib_add_farm);
        ib_add_farm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(opening_screen.this,farm.class);
                startActivity(intent);
            }
        });
        ib_add_activity=findViewById(R.id.ib_add_activity);
        ib_add_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(opening_screen.this,activity.class);
                startActivity(intent);
            }
        });
        ib_labor_distribution=findViewById(R.id.ib_labor_distribution);
        ib_labor_distribution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(opening_screen.this,labor_distribution.class);
                startActivity(intent);
            }
        });
    }
}