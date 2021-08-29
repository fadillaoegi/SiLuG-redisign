package com.projectundikamobile.silug.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.projectundikamobile.silug.R;

public class DashboardFragment extends Fragment implements View.OnClickListener{

    protected CardView cv_sskm, cv_event, cv_ipk, cv_bop;

    public DashboardFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);


        return view;

    }



    @Override
    public void onClick(View view) {

//        findViews();

        cv_event = (CardView) view.findViewById(R.id.cvevent);
        cv_ipk = (CardView) view.findViewById(R.id.cvipk);
        cv_bop = (CardView)  view.findViewById(R.id.cvbop);
        cv_sskm = (CardView) view.findViewById(R.id.cvsskm);

        Intent intent;

        switch (view.getId()) {

            case R.id.cvsskm:

//                intent = new Intent(this, sskm.class);
//                startActivity(intent);

                break;

        }

    }

}
