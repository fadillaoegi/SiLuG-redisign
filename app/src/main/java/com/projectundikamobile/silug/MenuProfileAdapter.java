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

public class MenuProfileAdapter extends RecyclerView.Adapter<MenuProfileAdapter.MyViewHolder> {

    private Context mContext;
    private List<DaftarProfile> daftar_profile;
    private AdapterListener mListener;

    public MenuProfileAdapter(Context mContext, List<DaftarProfile> list_profile, AdapterListener mListener) {
        this.mContext = mContext;
        this.daftar_profile = list_profile;
        this.mListener = mListener;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_menu_profile,parent,false);
        return new MyViewHolder(v) ;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        DaftarProfile l = daftar_profile.get(position);
        holder.txt_rv_profil_baru.setText(l.getNama_dp());
        holder.img_rv_profil_baru.setImageResource(l.getImg_dp());



        //Toast.makeText(l,list_liga.get(position).getNama_liga().charAt(),Toast.LENGTH_SHORT).show();
        //.toString(),Toast.LENGTH_LONG).show();
        // }
        //});


    }

    @Override
    public int getItemCount() {
        return daftar_profile.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView txt_rv_profil_baru;
        private ImageView img_rv_profil_baru;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_rv_profil_baru = itemView.findViewById(R.id.txt_rv_profil_baru);
            img_rv_profil_baru = itemView.findViewById(R.id.img_rv_profil_baru);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mListener.onSelectedItem(daftar_profile.get(getAdapterPosition()).getId_dp());
                }
            });

        }
    }

    public interface AdapterListener{
        void onSelectedItem(int id);
    }
}
