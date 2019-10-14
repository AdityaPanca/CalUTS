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
public class KubusFragment extends Fragment {


    public KubusFragment() {
        // Required empty public constructor
    }

    EditText sisi;
    TextView hasilBalok;
    Button hitung_balok;
    double panjang,tinggi,lebar, hsb;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_balok, container, false);
        sisi =  view.findViewById(R.id.edt_width);
        hasilBalok = view.findViewById(R.id.tv_result_balok);

        hitung_balok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                panjang = Double.valueOf(input_panjang.getText().toString());
                tinggi = Double.valueOf(input_tinggi.getText().toString());
                lebar = Double.valueOf(input_lebar.getText().toString());
                hsb = (panjang * lebar * tinggi);
                hasilBalok.setText(NumberFormat.getInstance().format(hsb));

            }

        });
        return view;
    }
}
