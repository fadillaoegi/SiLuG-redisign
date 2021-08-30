package com.projectundikamobile.silug.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.projectundikamobile.silug.Activity.loginalumni;
import com.projectundikamobile.silug.R;

public class login extends AppCompatActivity {

    protected TextView alumni;
    protected Button mhsMasuk;
    static String id2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        setContentView(R.layout.activity_login);
        initial();
        klik();
    }

    public void initial(){

        alumni = (TextView) findViewById(R.id.alumni);
        mhsMasuk= (Button)  findViewById(R.id.mhs_masuk);

    }

    public void klik () {

        alumni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), loginalumni.class);
                startActivity(intent);

            }
        });

        mhsMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), navbar.class);
                intent.putExtra(id2, "1");
                startActivity(intent);
            }
        });

    }

}