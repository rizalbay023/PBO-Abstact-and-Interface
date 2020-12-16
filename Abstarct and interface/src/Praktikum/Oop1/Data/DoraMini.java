package Praktikum.Oop1.Data;

public class DoraMini extends Robot {
    public DoraMini(String nama, String pemilik, int tahun) {
        super(nama, pemilik, tahun);
        System.out.println("ini adalah Method displayData -> "+nama + " " + pemilik + " "+ tahun);
    }

    @Override
    public double setNama(String nama) {

        return 0;
    }

    @Override
    public double displayData() {
        System.out.println();
        return 0;
    }
    public void sayDora (String firstname, String lastname){
        System.out.println("ini adalah Method sayDora -> " +"Halo, Saya " + firstname + " "+lastname);
    }
}
