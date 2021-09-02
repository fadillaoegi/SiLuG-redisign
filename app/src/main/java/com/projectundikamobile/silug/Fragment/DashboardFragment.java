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
import com.projectundikamobile.silug.mp_akun;
import com.projectundikamobile.silug.tes;
import com.projectundikamobile.silug.Activity.sskm_second;
import com.projectundikamobile.silug.Activity.BOP;
import com.projectundikamobile.silug.Activity.ipk;
import com.projectundikamobile.silug.Event;

public class DashboardFragment extends Fragment {

    protected CardView cv_sskm, cv_event, cv_ipk, cv_bop;

    public DashboardFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        cv_sskm = view.findViewById(R.id.cvsskm);
        cv_event = view.findViewById(R.id.cvevent);
        cv_ipk = view.findViewById(R.id.cvipk);
        cv_bop = view.findViewById(R.id.cvbop);

        cv_sskm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity().getApplicationContext(), sskm_second.class);
                startActivity(i);
            }
        });

        cv_event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity().getApplicationContext(), Event.class);
                startActivity(i);
            }
        });

        cv_ipk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity().getApplicationContext(), ipk.class);
                startActivity(i);
            }
        });

        cv_bop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity().getApplicationContext(), BOP.class);
                startActivity(i);
            }
        });
        return view;

    }

}
