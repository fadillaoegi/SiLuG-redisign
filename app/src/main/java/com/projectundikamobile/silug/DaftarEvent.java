package com.projectundikamobile.silug;

public class DaftarEvent {
    private int id_event, gambar_event;
    private String judul_event, child_judul;

    public DaftarEvent(int id_event, int gambar_event, String judul_event, String child_judul) {
        this.id_event = id_event;
        this.gambar_event = gambar_event;
        this.judul_event = judul_event;
        this.child_judul = child_judul;
    }

    public int getId_event() {
        return id_event;
    }

    public void setId_event(int id_event) {
        this.id_event = id_event;
    }

    public int getGambar_event() {
        return gambar_event;
    }

    public void setGambar_event(int gambar_event) {
        this.gambar_event = gambar_event;
    }

    public String getJudul_event() {
        return judul_event;
    }

    public void setJudul_event(String judul_event) {
        this.judul_event = judul_event;
    }

    public String getChild_judul() {
        return child_judul;
    }

    public void setChild_judul(String child_judul) {
        this.child_judul = child_judul;
    }
}
