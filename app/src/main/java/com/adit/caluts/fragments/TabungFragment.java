package com.adit.caluts.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.adit.caluts.R;

import java.text.NumberFormat;

/**
 * A simple {@link Fragment} subclass.
 */
public class TabungFragment extends Fragment {


    public TabungFragment() {
        // Required empty public constructor
    }

    EditText input_tinggi_tabung;
    EditText input_jari;
    TextView hasilTabung;
    Button hitung_tabung;
    double jari,tinggi, hst;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tabung, container, false);
        input_jari =  view.findViewById(R.id.edt_jari);
        input_tinggi_tabung =  view.findViewById(R.id.edt_height_tabung);
        hasilTabung = view.findViewById(R.id.tv_result_tabung);
        hitung_tabung = view.findViewById(R.id.btn_calculate_tabung);

        hitung_tabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jari = Double.valueOf(input_jari.getText().toString());
                tinggi = Double.valueOf(input_tinggi_tabung.getText().toString());
                hst = (3.14 * jari * jari * tinggi);
                hasilTabung.setText(NumberFormat.getInstance().format(hst));

            }

        });
        return view;
    }

}
