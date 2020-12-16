package Praktikum.Oop2.Data;

public abstract class Permainan {
    public String namaPemain;
    public int levelPemain;

//  Object dari abstract class tidak dapat dibentuk dikarenakan ada satu aturan yang diterapkan,
//  Sebuah kelas abstrak dapat saja memiliki method yang tidak abstrak.
    void setNamaPemain(String namaPemain) {

    }
    void setLevelPemain(int levelPemain){
      setLevelPemain(1-20);//normal
      setLevelPemain(21-80);//medium
      setLevelPemain(81-100);//hard
    }
    String getNamaPemain(String namaPemain){
        return "";
    }
    int getLevelPemain(int levelPemain){
        return 0;
    }

    void jalankan(){
    setNamaPemain("Taufik");
    getNamaPemain("Salamander");
    getLevelPemain(80);
    setLevelPemain(10);
    hitungSkor(1,1);
    }

    public abstract double hitungSkor(int hit, int miss);
}

