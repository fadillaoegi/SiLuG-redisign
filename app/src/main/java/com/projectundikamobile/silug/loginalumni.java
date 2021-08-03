package com.projectundikamobile.silug;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class loginalumni extends AppCompatActivity {

    protected TextView mhs;
    protected Button alumMasuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginalumni);

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