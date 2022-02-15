package com.example.age_calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
EditText edt_Year;
TextView txt_Age_Result;
Button btn_calculate;
int age_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_Year=findViewById(R.id.edt_Year);

        txt_Age_Result=findViewById(R.id.txt_Age_Result);
        if(savedInstanceState!=null)
        {
            age_result=savedInstanceState.getInt("AGE");
            txt_Age_Result.setText(""+age_result);
        }
        btn_calculate=findViewById(R.id.btn_calculate);
        btn_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            age_result= Calendar.getInstance().get(Calendar.YEAR)-Integer.parseInt(edt_Year.getText().toString());
            txt_Age_Result.setText(""+age_result);
            }
        });
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("AGE",age_result);
    }
}