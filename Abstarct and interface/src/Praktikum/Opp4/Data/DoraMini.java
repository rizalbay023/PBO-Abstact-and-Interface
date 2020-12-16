package Praktikum.Opp4.Data;

public class DoraMini implements Doraemon,Robot{

    private String nama;
    private String pemilik;
    private int tahun;

    @Override
    public void sayDora() {
        System.out.println("Halo, saya Dora Mini");
    }

    @Override
    public void displayKantongAjaib() {
        System.out.println("Saya juga seperti Doraemon yang memiliki kantung ajaib");

    }

    @Override
    public void setNama(String nama) {

    }

    @Override
    public void setTahun(int tahun) {

    }

    @Override
    public void displayData() {

    }

    public String getPemilik(){
        return "Dora";
    }
        public void setPemilik(String pemilik){

        }
}
