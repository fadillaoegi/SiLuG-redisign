package com.projectundikamobile.silug;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class login extends AppCompatActivity {

    protected TextView alumni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initial();
        klik();
    }

    public void initial(){

        alumni = (TextView) findViewById(R.id.alumni);

    }

    public void klik () {

        alumni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), loginalumni.class);
                startActivity(intent);

            }
        });

    }

}