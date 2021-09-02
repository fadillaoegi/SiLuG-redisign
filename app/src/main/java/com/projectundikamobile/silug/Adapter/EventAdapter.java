package com.projectundikamobile.silug.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.projectundikamobile.silug.DaftarEvent;
import com.projectundikamobile.silug.R;

import java.util.List;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.MyViewHolder> {

    private Context mContext;
    private List<DaftarEvent> daftar_event;
    private AdapterListener mListener;

    public EventAdapter(Context mContext, List<DaftarEvent> list_event, AdapterListener mListener) {
        this.mContext = mContext;
        this.daftar_event = list_event;
        this.mListener = mListener;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_event,parent,false);
        return new MyViewHolder(v) ;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        DaftarEvent l = daftar_event.get(position);
//        int id = l.getId_event()%2;
//        if (id==1){
//            holder.bgElement.setBackgroundColor(Color.WHITE);
//            holder.bgElement.setBackground(Color.WHITE);
//        }else{
//            holder.bgElement.setBackgroundColor(Color.GRAY);
//        }

        holder.txt_judul.setText(l.getJudul_event());
        holder.txt_child_judul.setText(l.getChild_judul());
        holder.img_event.setImageResource(l.getGambar_event());
        //Toast.makeText(l,list_liga.get(position).getNama_liga().charAt(),Toast.LENGTH_SHORT).show();
        //.toString(),Toast.LENGTH_LONG).show();
        // }
        //});


    }

    @Override
    public int getItemCount() {
        return daftar_event.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView txt_judul, txt_child_judul;
        private ImageView img_event;
        private Button btn_event;
        private LinearLayout bgElement;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_judul = itemView.findViewById(R.id.txt_judul);
            txt_child_judul = itemView.findViewById(R.id.txt_child_judul);
            img_event = itemView.findViewById(R.id.img_event);
            btn_event = itemView.findViewById(R.id.btn_event);
            bgElement = itemView.findViewById(R.id.container);
            btn_event.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mListener.onSelectedItem(daftar_event.get(getAdapterPosition()).getId_event());
                }
            });

        }
    }

    public interface AdapterListener{
        void onSelectedItem(int id);
    }
}
