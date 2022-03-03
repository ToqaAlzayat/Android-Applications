package com.example.mazra3a;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class update_account extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view=  inflater.inflate(R.layout.fragment_update_account, container, false);
        String [] role =
                {"Owner","Developer"};
        Spinner sp_update = (Spinner) view.findViewById(R.id.sp_update);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, role);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp_update.setAdapter(adapter);

        return view;
    }
}