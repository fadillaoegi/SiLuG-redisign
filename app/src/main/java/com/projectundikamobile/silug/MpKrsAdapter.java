package com.projectundikamobile.silug;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MpKrsAdapter extends RecyclerView.Adapter<MpKrsAdapter.MyViewHolder> {

    private Context mContext;
    private List<DaftarKrs> daftar_krs;

    public MpKrsAdapter(List<DaftarKrs> list_krs) {
        this.daftar_krs = list_krs;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_mp_krs,parent,false);
        return new MyViewHolder(v) ;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        DaftarKrs l = daftar_krs.get(position);
        holder.txt_rv_matkul.setText(l.getNama_matkul());
        holder.txt_rv_kelas.setText(l.getKelas());
        holder.txt_rv_waktu.setText(l.getWaktu());
        holder.txt_rv_dosen.setText(l.getNama_dosen());

    }

    @Override
    public int getItemCount() {
        return daftar_krs.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView txt_rv_kelas,txt_rv_matkul,txt_rv_waktu, txt_rv_dosen    ;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_rv_matkul = itemView.findViewById(R.id.txt_rv_matkul);
            txt_rv_kelas = itemView.findViewById(R.id.txt_rv_kelas);
            txt_rv_waktu = itemView.findViewById(R.id.txt_rv_waktu);
            txt_rv_dosen = itemView.findViewById(R.id.txt_rv_dosen);

        }
    }

}
