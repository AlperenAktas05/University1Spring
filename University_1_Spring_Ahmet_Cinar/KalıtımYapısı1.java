package Ders;

public class KalıtımYapısı1 {
    public static void main(String[] args) {
        
        KalıtımYapısı1_2 kalıtımYapısı1_2=new KalıtımYapısı1_2();
        
        kalıtımYapısı1_2.Metod1(); //Kalıtım yaptığı için metod1'e ulaşabildi.
        kalıtımYapısı1_2.Metod2(); 
    }
}

class KalıtımYapısı1_1{
    public void Metod1(){
        System.out.println("Metod 1");
    }
}

class KalıtımYapısı1_2 extends KalıtımYapısı1_1{ //1_1'den kalıtım aldı.
    public void Metod2(){
        System.out.println("Metod 2");
    }
}
