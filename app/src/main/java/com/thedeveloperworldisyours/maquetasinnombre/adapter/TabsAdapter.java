package com.thedeveloperworldisyours.maquetasinnombre.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.thedeveloperworldisyours.maquetasinnombre.R;
import com.thedeveloperworldisyours.maquetasinnombre.fragments.FirstBottomTabFragment;
import com.thedeveloperworldisyours.maquetasinnombre.fragments.FirstFragment;
import com.thedeveloperworldisyours.maquetasinnombre.fragments.SecondFragment;
import com.thedeveloperworldisyours.maquetasinnombre.fragments.ThirdFragment;

/**
 * Created by javierg on 06/01/2017.
 */

public class TabsAdapter extends FragmentStatePagerAdapter {

    public static final int TOTAL_TABS = 3;
    public FirstBottomTabFragment mContext;

    public TabsAdapter(FragmentManager fm, FirstBottomTabFragment context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FirstFragment().newInstance();
            case 1:
                return new SecondFragment().newInstance();
            case 2:
            default:
                return new ThirdFragment().newInstance();
        }
    }

    @Override
    public int getCount() {
        return TOTAL_TABS;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.fragment_first_title);
            case 1:
                return mContext.getString(R.string.fragment_second_title);
            case 2:
            default:
                return mContext.getString(R.string.fragment_third_title);
        }
    }

}
