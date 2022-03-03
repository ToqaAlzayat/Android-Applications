package com.example.mazra3a;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class delete_account extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_delete_account, container, false);
        String [] role =
                {"Owner","Developer"};
        Spinner sp_delete = (Spinner) view.findViewById(R.id.sp_delete);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, role);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp_delete.setAdapter(adapter);
        return view;
    }
}