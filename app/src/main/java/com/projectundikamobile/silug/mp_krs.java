package com.projectundikamobile.silug;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.projectundikamobile.silug.Adapter.MpKrsAdapter;

import java.util.ArrayList;

public class mp_krs extends AppCompatActivity{
    private RecyclerView rv_krs;
    private ArrayList<DaftarKrs> daftar_krs = new ArrayList<>();
    private MpKrsAdapter adapter;

    private Button back;
    static String id_profil;
    private long backPressedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mp_krs);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        rv_krs = (RecyclerView) findViewById(R.id.rv_krs);
        back = (Button) findViewById(R.id.btn_back_mpkrs);

        setData();
        setRecyclerView(daftar_krs);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    private void setRecyclerView(ArrayList<DaftarKrs> list) {

        adapter = new MpKrsAdapter(list);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,1);
        rv_krs.setLayoutManager(layoutManager);
        rv_krs.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private void setData(){
        DaftarKrs d = new DaftarKrs("Pemograman Web (Q1)", "M405", "13:30 - 16:00", "I Gusti Ngurah Alit Widana Putra, S.T., M.Eng.");
        daftar_krs.add(d);
        d = new DaftarKrs("Pemograman Berbasis Mobile (P1)", "M405", "13:30 - 16:00", "Naovianto Lemantoro, S.Kom.");
        daftar_krs.add(d);
        return;
    }


    public void onBackPressed() {
        super.onBackPressed();
        backPressedTime = System.currentTimeMillis();
    }

}