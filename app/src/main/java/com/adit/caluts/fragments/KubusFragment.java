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

    EditText input_sisi;
    TextView hasilKubus;
    Button hitung_Kubus;
    double sisi, hsk;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_kubus, container, false);
        input_sisi =  view.findViewById(R.id.edt_sisi);
        hasilKubus = view.findViewById(R.id.tv_result_kubus);
        hitung_Kubus = view.findViewById(R.id.btn_calculate_kubus);

        hitung_Kubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sisi = Double.valueOf(input_sisi.getText().toString());
                hsk = (sisi * sisi * sisi);
                hasilKubus.setText(NumberFormat.getInstance().format(hsk));

            }

        });
        return view;
    }
}
