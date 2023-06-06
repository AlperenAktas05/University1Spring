package Ders;

public class KompozisyonYapısı2 {
    KompozisyonYapısı2_1 kompozisyonYapısı2_1=new KompozisyonYapısı2_1(); //Kompozisyon
    public static void main(String[] args) {
        
        KompozisyonYapısı2 kompozisyonYapisi2=new KompozisyonYapısı2();
        kompozisyonYapisi2.kompozisyonYapısı2_1.Metod1();
    }
}

class KompozisyonYapısı2_1{
    public void Metod1(){
        System.out.println("Merhaba Dünya!");
    }
}

