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

import com.projectundikamobile.silug.Adapter.JadwalUjianAdapter;
import com.projectundikamobile.silug.ExamSchedule;
import com.projectundikamobile.silug.R;

import java.util.ArrayList;
public class UtsFragment extends Fragment {
    private ProgressBar pbJadwal;
    private RecyclerView rvJadwal;
    private LinearLayout lyNoSchedule;

    private ArrayList<ExamSchedule> utslist = new ArrayList<>();
    private JadwalUjianAdapter adapter;

    public UtsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_uts, container, false);

        pbJadwal = view.findViewById(R.id.pbJadwaluts);
        lyNoSchedule = view.findViewById(R.id.lyNoScheduleuts);
        rvJadwal = view.findViewById(R.id.rvJadwaluts);

        loadData();

        return view;
    }


    private void loadData() {
        adapter = new JadwalUjianAdapter(utslist);
        rvJadwal.setLayoutManager(new LinearLayoutManager(getContext()));
        rvJadwal.setAdapter(adapter);

        ExamSchedule d = new ExamSchedule("Q1", "21-08-2021", "I Gusti Ngurah Alit Widana Putra, S.T., M.Eng.","13:30",  "16:00" ,"Pemograman Web","M405");
        utslist.add(d);
        d = new ExamSchedule("Q1", "21-08-2021", "I Gusti Ngurah Alit Widana Putra, S.T., M.Eng.","13:30",  "16:00" ,"Pemograman Web","M405");
        utslist.add(d);
        return;
    }

}
