package com.projectundikamobile.silug.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.projectundikamobile.silug.Adapter.JadwalPagerAdapter;
import com.projectundikamobile.silug.R;

public class JadwalFragment extends Fragment {

    public JadwalFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_jadwal, container, false);

        JadwalPagerAdapter jadwalPagerAdapter= new JadwalPagerAdapter(getChildFragmentManager(), getContext());
        ViewPager viewPager = view.findViewById(R.id.view_pager);
        viewPager.setAdapter(jadwalPagerAdapter);
        TabLayout tabs = view.findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

        return view;
    }
}
