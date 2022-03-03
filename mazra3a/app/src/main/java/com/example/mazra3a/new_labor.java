package com.example.mazra3a;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;


public class new_labor extends Fragment {

    private static final String TAG="new_labor";
    private TextView tv_date_new_labor;
    private DatePickerDialog.OnDateSetListener onDateSetListener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_new_labor, container, false);

        tv_date_new_labor=(TextView) view.findViewById(R.id.tv_date_new_labor);
        tv_date_new_labor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar=Calendar.getInstance();
                int year=calendar.get(Calendar.YEAR);
                int month=calendar.get(Calendar.MONTH);
                int day=calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog=new DatePickerDialog(getActivity(), android.R.style.Theme_Holo_Dialog_MinWidth,onDateSetListener,year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
        onDateSetListener=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month=month+1;
                Log.d(TAG,"onDateSet: date: "+month+"/"+dayOfMonth+"/"+year);
                 String date=month+"/"+dayOfMonth+"/"+year;
                tv_date_new_labor.setText(date);
            }
        };

        String [] activity_code =
                {"one","two","three"};
        Spinner sp_activity_code_new_labor = (Spinner) view.findViewById(R.id.sp_activity_code_new_labor);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, activity_code);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp_activity_code_new_labor.setAdapter(adapter);

        String [] activity =
                {"one","two"};
        Spinner sp_activity_new_labor = (Spinner) view.findViewById(R.id.sp_activity_new_labor);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, activity);
        adapter2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp_activity_new_labor.setAdapter(adapter2);

        String [] farm_name =
                {"one","two","five"};
        Spinner sp_farm_name_new_labor = (Spinner) view.findViewById(R.id.sp_farm_name_new_labor);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, farm_name);
        adapter3.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp_farm_name_new_labor.setAdapter(adapter3);

        String [] sector =
                {"one","two","six","seven"};
        Spinner sp_sector_new_labor = (Spinner) view.findViewById(R.id.sp_sector_new_labor);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, sector);
        adapter4.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp_sector_new_labor.setAdapter(adapter4);





        return view;
    }
}