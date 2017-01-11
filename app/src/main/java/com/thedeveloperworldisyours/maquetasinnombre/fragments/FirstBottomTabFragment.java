package com.thedeveloperworldisyours.maquetasinnombre.fragments;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thedeveloperworldisyours.maquetasinnombre.R;
import com.thedeveloperworldisyours.maquetasinnombre.adapter.TabsAdapter;

public class FirstBottomTabFragment extends Fragment {

    public FirstBottomTabFragment() {
        // Required empty public constructor
    }

    public static FirstBottomTabFragment newInstance() {
        return new FirstBottomTabFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first_bottom_tab, container, false);

        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tab_layout);
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.pager);

        viewPager.setAdapter(new TabsAdapter(getFragmentManager(), this));
        tabLayout.setupWithViewPager(viewPager);

        return view;
    }

}
