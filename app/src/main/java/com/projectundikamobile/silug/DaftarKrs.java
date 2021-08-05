package com.projectundikamobile.silug;

public class DaftarKrs {
    private String nama_matkul, kelas, waktu, nama_dosen;

    public DaftarKrs(String nama_matkul, String kelas, String waktu, String nama_dosen) {
        this.nama_matkul = nama_matkul;
        this.kelas = kelas;
        this.waktu = waktu;
        this.nama_dosen = nama_dosen;
    }

    public String getNama_matkul() {
        return nama_matkul;
    }

    public void setNama_matkul(String nama_matkul) {
        this.nama_matkul = nama_matkul;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String getNama_dosen() {
        return nama_dosen;
    }

    public void setNama_dosen(String nama_dosen) {
        this.nama_dosen = nama_dosen;
    }
}
