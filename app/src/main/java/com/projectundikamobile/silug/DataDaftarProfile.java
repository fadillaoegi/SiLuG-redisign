package com.projectundikamobile.silug;

import java.util.ArrayList;

public class DataDaftarProfile {
    private ArrayList<DaftarProfile> daftar_profile = new ArrayList<>();
    public DataDaftarProfile() {
    }

    public void setData() {
        DaftarProfile l = new DaftarProfile(1, R.drawable.akun,"Akun");
        daftar_profile.add(l);
        l = new DaftarProfile(2,R.drawable.krs,"Kartu Rencana Studi");
        daftar_profile.add(l);
        l = new DaftarProfile(3,R.drawable.histori,"Histori");
        daftar_profile.add(l);
        l = new DaftarProfile(4,R.drawable.perpus,"Pinjaman Perpustakaan");
        daftar_profile.add(l);
        l = new DaftarProfile(5,R.drawable.keluar,"Keluar");
        daftar_profile.add(l);
    }


    public ArrayList<DaftarProfile> daftar_profile() {
        return daftar_profile;
    }
}
