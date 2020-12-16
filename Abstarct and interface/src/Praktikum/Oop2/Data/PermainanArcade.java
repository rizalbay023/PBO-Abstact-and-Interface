package Praktikum.Oop2.Data;

public class PermainanArcade extends Permainan{
    //  Method Override
    /**Method overriding adalah kemampuan mendeklarasikan ulang method di child class,
     * yang sudah ada di parent class
     */
    public int hit;
    public int miss;
    public PermainanArcade(int hit,int miss) {
        this.hit = hit;
        this.miss = miss;
        System.out.println("“Permainan Arcade” "+"Jumlah Hit x " + hit + " - jumlah Miss x " + miss);
    }


    @Override
    public double hitungSkor(int hit, int miss) {
        return 0;
    }
}
