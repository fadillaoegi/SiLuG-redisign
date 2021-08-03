package com.projectundikamobile.silug;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class loginalumni extends AppCompatActivity {

    protected TextView mhs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginalumni);

        initial();
        klik();

    }

    public void initial(){

        mhs = (TextView) findViewById(R.id.mhs);

    }

    public void klik() {

        mhs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), login.class);
                startActivity(intent);

            }
        });

    }

}