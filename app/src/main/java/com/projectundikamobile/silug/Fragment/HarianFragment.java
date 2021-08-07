package com.projectundikamobile.silug.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.projectundikamobile.silug.Adapter.HarianAdapter;
import com.projectundikamobile.silug.DaftarKrs;
import com.projectundikamobile.silug.ExamSchedule;
import com.projectundikamobile.silug.R;

import java.util.ArrayList;


public class HarianFragment extends Fragment {
    private ProgressBar pbJadwal;
    private RecyclerView rvJadwal;
    private LinearLayout lyNoSchedule;

    private ArrayList<ExamSchedule> harian_list = new ArrayList<>();
    private HarianAdapter adapter;

    public HarianFragment () {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_harian,container,false);

        pbJadwal = view.findViewById(R.id.pbJadwalh);
        rvJadwal = view.findViewById(R.id.rvJadwalharian);
        lyNoSchedule = view.findViewById(R.id.lyNoScheduleh);

        loadData();
        return view;
    }


    private void loadData() {
        adapter = new HarianAdapter(harian_list);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getActivity().getApplicationContext(),1);
        rvJadwal.setLayoutManager(layoutManager);
        rvJadwal.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        ExamSchedule d = new ExamSchedule("Q1", "21-08-2021", "I Gusti Ngurah Alit Widana Putra, S.T., M.Eng.","13:30",  "16:00" ,"Pemograman Web","M405");
        harian_list.add(d);
        d = new ExamSchedule("Q1", "21-08-2021", "I Gusti Ngurah Alit Widana Putra, S.T., M.Eng.","13:30",  "16:00" ,"Pemograman Web","M405");
        harian_list.add(d);

        return;
    }


}
