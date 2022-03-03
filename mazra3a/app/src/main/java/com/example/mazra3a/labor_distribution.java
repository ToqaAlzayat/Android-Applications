package com.example.mazra3a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class labor_distribution extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_labor_distribution);
        Button btn_add_labor_distribution=findViewById(R.id.btn_add_labor_distribution);
        btn_add_labor_distribution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(labor_distribution.this,labor.class);
                startActivity(intent);
            }
        });
    }
}