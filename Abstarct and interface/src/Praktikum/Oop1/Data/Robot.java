package Praktikum.Oop1.Data;

public abstract class Robot {
    protected String nama;
    protected String pemilik;
    protected int tahun;

    public Robot (String nama,String pemilik, int tahun){
        this.nama = nama;
        this.pemilik = pemilik;
        this.tahun = tahun;
    }

    public void setTahunPembuatan (int tahun){
        return ;
    }
    public abstract double setNama (String nama);
    public abstract double displayData ();
}
