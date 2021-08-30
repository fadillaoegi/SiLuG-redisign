package com.projectundikamobile.silug.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.projectundikamobile.silug.R;
import com.projectundikamobile.silug.tes;

public class DashboardFragment extends Fragment {

    protected CardView cv_sskm, cv_event, cv_ipk, cv_bop;

    public DashboardFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        return view;

    }

}
