package com.projectundikamobile.silug.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.projectundikamobile.silug.Adapter.MpKrsAdapter;
import com.projectundikamobile.silug.DaftarKrs;
import com.projectundikamobile.silug.R;

import java.util.ArrayList;


public class MingguanFragment extends Fragment {
    private ProgressBar pbJadwal;
    private RecyclerView rvJadwal;
    private LinearLayout lyNoSchedule;

    private ArrayList<DaftarKrs> daftar_krs = new ArrayList<>();
    private MpKrsAdapter adapter;

    public MingguanFragment () {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mingguan,container,false);

        pbJadwal = view.findViewById(R.id.pbJadwalm);
        rvJadwal = view.findViewById(R.id.rvJadwalmingguan);
        lyNoSchedule = view.findViewById(R.id.lyNoSchedulem);

        loadData();
        return view;
    }


    private void loadData() {
        adapter = new MpKrsAdapter(daftar_krs);
        rvJadwal.setLayoutManager(new LinearLayoutManager(getContext()));
        rvJadwal.setAdapter(adapter);

        DaftarKrs d = new DaftarKrs("Pemograman Web (Q1)", "M405", "13:30 - 16:00", "I Gusti Ngurah Alit Widana Putra, S.T., M.Eng.");
        daftar_krs.add(d);
        d = new DaftarKrs("Pemograman Berbasis Mobile (P1)", "M405", "13:30 - 16:00", "Naovianto Lemantoro, S.Kom.");
        daftar_krs.add(d);

        return;
    }


}
