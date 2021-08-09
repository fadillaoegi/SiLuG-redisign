package com.projectundikamobile.silug.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.projectundikamobile.silug.ExamSchedule;
import com.projectundikamobile.silug.R;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class HarianAdapter extends RecyclerView.Adapter<HarianAdapter.HarianHolder>{
    private ArrayList<ExamSchedule> listJadwal ;
    long diffHour;
    int diffMinute;
    Date dateSelesai, dateMulai;
    private Context context;

    public HarianAdapter(ArrayList<ExamSchedule> list){
        this.listJadwal = list;
    }

    @NonNull
    @Override
    public HarianHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_jadwal, parent, false);
        context = view.getContext();
        return new HarianHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HarianHolder holder, int position) {
        ExamSchedule schedule = listJadwal.get(position);

        SimpleDateFormat format = new SimpleDateFormat("hh:mm");

        try {
            dateSelesai = format.parse(schedule.getWaktuSelesai());
            dateMulai = format.parse(schedule.getWaktuMulai());

            diffHour = dateSelesai.getTime() - dateMulai.getTime();
            diffMinute = (int)diffHour/(1000*60);
        } catch (ParseException e) {
            e.printStackTrace();
        }


        holder.tvDate.setText(schedule.getTanggal());
        holder.tvMatkul.setText(schedule.getNamaMatkul()+" ("+schedule.getKelas()+")");
        holder.tvRoom.setText(schedule.getRuang());
        holder.tvTime.setText(schedule.getWaktuMulai()+" - "+schedule.getWaktuSelesai()+" ("+diffMinute+" menit)");
        holder.tvDosen.setText(schedule.getDosenNama());

    }

    @Override
    public int getItemCount() {
        return listJadwal.size();
    }

    public class HarianHolder extends RecyclerView.ViewHolder {
        TextView tvMatkul, tvRoom, tvTime, tvDosen, tvHadir, tvDate;
        LinearLayout lyHadir;

        public HarianHolder(@NonNull View itemView) {
            super(itemView);

            tvDate = itemView.findViewById(R.id.tvDate);
            tvMatkul = itemView.findViewById(R.id.tvMatkul);
            tvRoom = itemView.findViewById(R.id.tvRoom);
            tvTime = itemView.findViewById(R.id.tvTime);
            tvDosen = itemView.findViewById(R.id.tvDosen);
            tvHadir = itemView.findViewById(R.id.tvHadir);
            lyHadir = itemView.findViewById(R.id.lyHadir);
        }
    }
}
