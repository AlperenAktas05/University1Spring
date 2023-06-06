package Ders;

public class Hazirlik4 {
    //Toplum aileden oluşur. Aile, anne, baba ve çocuktan oluşur.Bir toplumu modelleyen class ve constructor yapınız.
    Toplum toplum=new Toplum(); //Kompozisyon
    public static void main(String[] args) {
        Hazirlik4 hazirlik4=new Hazirlik4();
    }
}

class Aile{
    String baba, anne, cocuk;
    public Aile(){ //constructor
        baba="aile kurucusu";
        anne="ev yöneticisi";
        cocuk="miras";
    }
}

class Toplum{
    Aile aile=new Aile(); //Kompozisyon
    String isim;
    public Toplum(){ //constructor
        isim="Türk";
        System.out.println(aile.baba);
        System.out.println(aile.anne);
        System.out.println(aile.cocuk);
    }
}
