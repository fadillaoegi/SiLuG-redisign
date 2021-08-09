package com.projectundikamobile.silug.Adapter;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.projectundikamobile.silug.Fragment.HarianFragment;
import com.projectundikamobile.silug.Fragment.MingguanFragment;
import com.projectundikamobile.silug.Fragment.UasFragment;
import com.projectundikamobile.silug.Fragment.UtsFragment;


public class JadwalPagerAdapter extends FragmentPagerAdapter {

    private final Context mContext;
    public JadwalPagerAdapter(FragmentManager fm, Context mContext) {
        super(fm);
        this.mContext = mContext;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new HarianFragment();
                break;
            case 1:
                fragment = new MingguanFragment();
                break;
            case 2:
                fragment = new UtsFragment();
                break;
            case 3:
                fragment = new UasFragment();
                break;
        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Harian";
            case 1:
                return "Mingguan";
            case 2:
                return "UTS";
            case 3:
                return "UAS";
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
