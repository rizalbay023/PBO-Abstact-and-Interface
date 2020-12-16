package Praktikum.Oop2.Data;

public class PermainanStrategy extends Permainan{
    // Method Override
    /**
     Saat kita melakukan proses overriding tersebut,
     secara otomatis ketika kita membuat object dari class child,
     method yang di class parent tidak bisa diakses lagi
     **/
    public int hit;
    public PermainanStrategy(int hit) {
        this.hit = hit;
        System.out.println("“Permainan Arcade” " + "Jumlah Hit x " + hit );
    }


    @Override
    public double hitungSkor(int hit, int miss) {
        return 0;
    }
}
