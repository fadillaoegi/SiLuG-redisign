package com.projectundikamobile.silug;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class navbar extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{
    BottomNavigationView bottomNavigationView;
    Fragment fragment = null;
    private long backPressedTime;
    private String id;
    private int test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navbar);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        bottomNavigationView = findViewById(R.id.bottom_nav);

        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        if (savedInstanceState != null) {
            fragment = getSupportFragmentManager().getFragment(savedInstanceState, "myFragmentName");
            loadFragment(fragment);
        }

//        Intent terima = getIntent();
//        id = terima.getStringExtra(mp_akun.id_profil);
//        id = terima.getStringExtra(mp_krs.id_profil);
//        id = terima.getStringExtra(login.id2);
//
//        test = Integer.valueOf(id);
//
//        if(test == 1){
//            loadFragment(new DashboardFragment());
//        }else if(test == 2){
//            fragment = null;
//            loadFragment(new ProfilFragment());
//        }else {
//            loadFragment(new DashboardFragment());
//        }


        loadFragment(new DashboardFragment());
    }

    private boolean loadFragment(Fragment fragment){
        if (fragment != null){
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.flMain, fragment)
                    .commit();

            return true;
        }
        return false;
    }


    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch (menuItem.getItemId()){
            case R.id.menu_home:
                fragment = new DashboardFragment();
                break;
            case R.id.menu_profil:
                fragment = new ProfilFragment();
                break;
            case R.id.menu_jadwal:
                fragment = new ProfilFragment();
                break;
        }

        return loadFragment(fragment);
    }

    @Override
    public void onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()){
            super.onBackPressed();
        }else {
            Toast.makeText(this, "Tekan 2 kali untuk keluar", Toast.LENGTH_SHORT).show();
        }

        backPressedTime = System.currentTimeMillis();
    }
}