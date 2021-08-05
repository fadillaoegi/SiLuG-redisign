package com.projectundikamobile.silug;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ProfilFragment extends Fragment implements MenuProfileAdapter.AdapterListener {
    private RecyclerView rv_menu;
    private ArrayList<DaftarProfile> daftar_profile = new ArrayList<>();
    private MenuProfileAdapter adapter;
    public ProfilFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_profile, container, false);


        rv_menu = view.findViewById(R.id.rv_profile);

        DataDaftarProfile d = new DataDaftarProfile();
        d.setData();
        daftar_profile= d.daftar_profile();
        setRecyclerView(daftar_profile);
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
        }
//        else if(id == 3){
//            Intent i = new Intent(getActivity().getApplicationContext(), Riwayat.class);
//            startActivity(i);
//        }else if(id == 4){
//            Intent i = new Intent(getActivity().getApplicationContext(), Akun.class);
//            startActivity(i);
//        }
    }
}
