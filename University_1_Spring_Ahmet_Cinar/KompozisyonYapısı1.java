package Ders;

public class KompozisyonYapısı1 {
    public static void main(String[] args) {
        
        KompozisyonYapisi1_3 kompozisyonYapisi1_3=new KompozisyonYapisi1_3();
        kompozisyonYapisi1_3.Metod2();
        kompozisyonYapisi1_3.kompozisyonYapisi1_2.Metod1();
    }
}

class KompozisyonYapisi1_2{
    public void Metod1(){
        System.out.println("Merhaba Dünya");
    }
}

class KompozisyonYapisi1_3{
    KompozisyonYapisi1_2 kompozisyonYapisi1_2=new KompozisyonYapisi1_2(); //Kompozisyon
    public void Metod2(){
        System.out.println("Merhaba Dünya 2");
        kompozisyonYapisi1_2.Metod1();
    }
}
