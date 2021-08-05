package com.projectundikamobile.silug;

public class DaftarProfile {
    private int id_dp, img_dp;
    private String nama_dp;

    public DaftarProfile(int id_dp, int img_dp, String nama_dp) {
        this.id_dp = id_dp;
        this.img_dp = img_dp;
        this.nama_dp = nama_dp;
    }

    public int getId_dp() {
        return id_dp;
    }

    public void setId_dp(int id_dp) {
        this.id_dp = id_dp;
    }

    public int getImg_dp() {
        return img_dp;
    }

    public void setImg_dp(int img_dp) {
        this.img_dp = img_dp;
    }

    public String getNama_dp() {
        return nama_dp;
    }

    public void setNama_dp(String nama_dp) {
        this.nama_dp = nama_dp;
    }
}
