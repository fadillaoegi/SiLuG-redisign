package com.projectundikamobile.silug.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.projectundikamobile.silug.Adapter.MenuProfileAdapter;
import com.projectundikamobile.silug.DaftarProfile;
import com.projectundikamobile.silug.DataDaftarProfile;
import com.projectundikamobile.silug.R;
import com.projectundikamobile.silug.login;
import com.projectundikamobile.silug.mp_akun;
import com.projectundikamobile.silug.mp_histori;
import com.projectundikamobile.silug.mp_krs;
import com.projectundikamobile.silug.mp_perpus;

import java.util.ArrayList;
import java.util.List;

public class ProfilFragment extends Fragment implements MenuProfileAdapter.AdapterListener {
    private RecyclerView rv_menu;
    private ArrayList<DaftarProfile> daftar_profile = new ArrayList<>();
    private MenuProfileAdapter adapter;
    private long backPressedTime;
    private Button btn_mpakun;
    public ProfilFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);


        rv_menu = view.findViewById(R.id.rv_profile);
        btn_mpakun = view.findViewById(R.id.btn_mpakun);

        DataDaftarProfile d = new DataDaftarProfile();
        d.setData();
        daftar_profile= d.daftar_profile();
        setRecyclerView(daftar_profile);


        btn_mpakun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity().getApplicationContext(), mp_akun.class);
                startActivity(i);
            }
        });

        return view;
    }

    private void setRecyclerView(List<DaftarProfile> list) {
        adapter = new MenuProfileAdapter(getActivity().getApplicationContext(),list,this);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getActivity().getApplicationContext(),1);
        rv_menu.setLayoutManager(layoutManager);
        rv_menu.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onSelectedItem(int id) {

        if (id == 1){
            Intent i = new Intent(getActivity().getApplicationContext(), mp_akun.class);
            startActivity(i);
        }else if(id == 2){
            Intent i = new Intent(getActivity().getApplicationContext(), mp_krs.class);
            startActivity(i);
        }else if(id == 3){
            Intent i = new Intent(getActivity().getApplicationContext(), mp_histori.class);
            startActivity(i);
        }else if(id == 4){
            Intent i = new Intent(getActivity().getApplicationContext(), mp_perpus.class);
            startActivity(i);
        }else if(id == 5){
            if (backPressedTime + 2000 > System.currentTimeMillis()){
                Intent i = new Intent(getActivity().getApplicationContext(), login.class);
                startActivity(i);
            }else {
                Toast.makeText(getActivity().getApplicationContext(), "Tekan 2 kali untuk keluar", Toast.LENGTH_SHORT).show();
            }
            backPressedTime = System.currentTimeMillis();
        }
    }



}
