package com.projectundikamobile.silug;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.projectundikamobile.silug.Adapter.EventAdapter;

import java.util.ArrayList;

public class Event extends AppCompatActivity implements EventAdapter.AdapterListener{
    private RecyclerView rv_event, rv_event2;
    private ArrayList<DaftarEvent> daftar_event = new ArrayList<>();
    private EventAdapter adapter;
    private Button btn_event;

    private long backPressedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        rv_event = (RecyclerView) findViewById(R.id.rv_event);
        rv_event2 = (RecyclerView) findViewById(R.id.rv_event2);
        btn_event  = (Button) findViewById(R.id.btn_event);

        setData();
        setRecyclerView(daftar_event);
        setRecyclerView2(daftar_event);

        btn_event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    private void setRecyclerView(ArrayList<DaftarEvent> list) {
        adapter = new EventAdapter(this, list,this);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,1);
        rv_event.setLayoutManager(layoutManager);
        rv_event.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private void setRecyclerView2(ArrayList<DaftarEvent> list) {
        adapter = new EventAdapter(this, list,this);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,1);
        rv_event2.setLayoutManager(layoutManager);
        rv_event2.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private void setData(){
        DaftarEvent d = new DaftarEvent(1, R.drawable.figma, "Workshop UI/UX", "With Figma");
        daftar_event.add(d);
        d = new DaftarEvent(2, R.drawable.vscode, "Workshop Website Portofolio", "With Visual Stuidio Code");
        daftar_event.add(d);
        d = new DaftarEvent(3, R.drawable.xd, "Workshop UI/UX", "With Adobe Xd");
        daftar_event.add(d);
        d = new DaftarEvent(4, R.drawable.arduino, "Workshop Internet Of Things", "With Arduino");
        daftar_event.add(d);
        return;
    }

    public void onBackPressed() {
        super.onBackPressed();
        backPressedTime = System.currentTimeMillis();
    }

    @Override
    public void onSelectedItem(int id) {

        Intent i = new Intent(this, DetailEvent.class);
        startActivity(i);

    }
}