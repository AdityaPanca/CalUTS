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
public class BalokFragment extends Fragment {

    private OnFragmentInteractionListener mListener;

    public BalokFragment() {
        // Required empty public constructor
    }
    EditText input_panjang;
    EditText input_lebar;
    EditText input_tinggi;
    TextView hasilBalok;
    Button btn_calculate_balok;
    double panjang,tinggi,lebar,hsb;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_balok, container, false);
        input_lebar =  view.findViewById(R.id.edt_width);
        input_panjang = view.findViewById(R.id.edt_length);
        btn_calculate_balok = view.findViewById(R.id.btn_calculate_balok);
        input_tinggi = view.findViewById(R.id.edt_height);
        hasilBalok = view.findViewById(R.id.tv_result_balok);

        btn_calculate_balok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                panjang = Double.valueOf(input_panjang.getText().toString());
                tinggi = Double.valueOf(input_tinggi.getText().toString());
                lebar = Double.valueOf(input_lebar.getText().toString());
                hsb =(panjang * lebar * tinggi);
                hasilBalok.setText(NumberFormat.getInstance().format(hsb));

            }

        });
        return view;
    }

    private class OnFragmentInteractionListener {
    }

}
