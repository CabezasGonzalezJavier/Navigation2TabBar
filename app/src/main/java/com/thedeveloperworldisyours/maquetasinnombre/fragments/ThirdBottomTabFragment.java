package com.thedeveloperworldisyours.maquetasinnombre.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thedeveloperworldisyours.maquetasinnombre.R;

public class ThirdBottomTabFragment extends Fragment {

    public ThirdBottomTabFragment() {
        // Required empty public constructor
    }

    public static ThirdBottomTabFragment newInstance() {
        return new ThirdBottomTabFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third_bottom_tab, container, false);
    }

}
