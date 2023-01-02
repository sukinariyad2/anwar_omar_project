package com.example.anwar_omar_project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.fragment.app.Fragment;

public class MathafBagdadyFragment extends Fragment {

    private static final String ARG_PARAMm1 = "paramm1";
    private static final String ARG_PARAMm2 = "paramm2";
    private static final String ARG_PARAMm3 = "paramm3";
    private static final String ARG_PARAMm4 = "paramm4";


    private String mParamm1;
    private String mParamm2;
    private String mParamm3;
    private String mParamm4;

    public MathafBagdadyFragment() {

    }


    public static MathafBagdadyFragment newInstance(String paramm1, String paramm2,String paramm3, String paramm4) {
        MathafBagdadyFragment fragment = new MathafBagdadyFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAMm1, paramm1);
        args.putString(ARG_PARAMm2, paramm2);
        args.putString(ARG_PARAMm3, paramm3);
        args.putString(ARG_PARAMm4, paramm4);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParamm1 = getArguments().getString(ARG_PARAMm1);
            mParamm2 = getArguments().getString(ARG_PARAMm2);
            mParamm3 = getArguments().getString(ARG_PARAMm3);
            mParamm4 = getArguments().getString(ARG_PARAMm4);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.mathafbagdadyfragment, container, false);
    }
}

