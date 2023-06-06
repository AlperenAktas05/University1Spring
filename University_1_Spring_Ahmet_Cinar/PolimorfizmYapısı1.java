package Ders;

public class PolimorfizmYapısı1 {
    public static void main(String[] args) {
        
        KalıtımYapısı1_1 kalıtımYapısı1_1=new KalıtımYapısı1_2(); //Polimorfizm
        kalıtımYapısı1_1.Metod1(); //Metod2'ye erişim yoktur.
    }
}

class KalıtımYapısı1_1{
    public void Metod1(){
        System.out.println("Metod 1");
    }
}

class KalıtımYapısı1_2 extends KalıtımYapısı1_1{ //Kalıtım
    public void Metod2(){
        System.out.println("Metod 2");
    }
}
