package Ders;

public class KalıtımYapısı2 {
    KalıtımYapısı2_2 kalıtımYapısı2_2=new KalıtımYapısı2_2(); //Kompozisyon
    public static void main(String[] args) {        
        KalıtımYapısı2 kalıtımYapısı2= new KalıtımYapısı2();
        
        kalıtımYapısı2.kalıtımYapısı2_2.Metod2();
        kalıtımYapısı2.kalıtımYapısı2_2.Metod1(); //kalıtım sayesinde metod 1'e ulaştık.
    }
}

class KalıtımYapısı2_1{
    public void Metod1(){
        System.out.println("Merhaba Dünya!");
    }
}

class KalıtımYapısı2_2 extends KalıtımYapısı2_1{ //kalıtım
    public KalıtımYapısı2_2(){ //constructor
        System.out.println("Bu bir constructor mesajıdır.");
    }
    
    public void Metod2(){
        System.out.println("Metod 2");
    }
}
