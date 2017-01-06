package com.thedeveloperworldisyours.maquetasinnombre.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thedeveloperworldisyours.maquetasinnombre.R;

public class SecondTabFragment extends Fragment {

    public SecondTabFragment() {
        // Required empty public constructor
    }

    public static SecondTabFragment newInstance() {
        return new SecondTabFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second_tab, container, false);
    }

}
