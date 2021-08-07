package com.projectundikamobile.silug;


public class ExamSchedule {
    private String nim, klklId,kelas,hari,tanggal,dosenNik,dosenNama,waktuMulai,waktuSelesai,countDown
    ,namaMatkul,ruang,sks, kehadiran;

    public ExamSchedule(String kelas, String tanggal, String dosenNama, String waktuMulai, String waktuSelesai, String namaMatkul, String ruang) {
        this.kelas = kelas;
        this.tanggal = tanggal;
        this.dosenNama = dosenNama;
        this.waktuMulai = waktuMulai;
        this.waktuSelesai = waktuSelesai;
        this.namaMatkul = namaMatkul;
        this.ruang = ruang;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKlklId() {
        return klklId;
    }

    public void setKlklId(String klklId) {
        this.klklId = klklId;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getDosenNik() {
        return dosenNik;
    }

    public void setDosenNik(String dosenNik) {
        this.dosenNik = dosenNik;
    }

    public String getDosenNama() {
        return dosenNama;
    }

    public void setDosenNama(String dosenNama) {
        this.dosenNama = dosenNama;
    }

    public String getWaktuMulai() {
        return waktuMulai;
    }

    public void setWaktuMulai(String waktuMulai) {
        this.waktuMulai = waktuMulai;
    }

    public String getWaktuSelesai() {
        return waktuSelesai;
    }

    public void setWaktuSelesai(String waktuSelesai) {
        this.waktuSelesai = waktuSelesai;
    }

    public String getCountDown() {
        return countDown;
    }

    public void setCountDown(String countDown) {
        this.countDown = countDown;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public String getRuang() {
        return ruang;
    }

    public void setRuang(String ruang) {
        this.ruang = ruang;
    }

    public String getSks() {
        return sks;
    }

    public void setSks(String sks) {
        this.sks = sks;
    }

    public String getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(String kehadiran) {
        this.kehadiran = kehadiran;
    }
}
