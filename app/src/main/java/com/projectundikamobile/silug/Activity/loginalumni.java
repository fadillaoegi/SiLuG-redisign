package com.projectundikamobile.silug.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.projectundikamobile.silug.R;

public class loginalumni extends AppCompatActivity{

    protected TextView mhs;
    protected Button alumMasuk;
    protected CardView cv_sskm, cv_event, cv_ipk, cv_bop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginalumni);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        initial();
        klik();

    }



    public void initial(){

        mhs = (TextView) findViewById(R.id.mhs);
        alumMasuk = (Button) findViewById(R.id.alum_masuk);

    }

    public void klik() {

        mhs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), login.class);
                startActivity(intent);

            }
        });

        alumMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), dashboard.class);
                startActivity(intent);

            }
        });

    }


}