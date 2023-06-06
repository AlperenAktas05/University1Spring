package Ders;

public class InterfaceYapısı1 {
    public static void main(String[] args) {
        InterfaceYapısı1_3 interfaceYapısı1_3=new InterfaceYapısı1_3();
        interfaceYapısı1_3.Metod1();
        interfaceYapısı1_3.Metod2();
        interfaceYapısı1_3.Metod3();
    }
}

interface InterfaceYapısı1_1{
    public void Metod1();
}

abstract class InterfaceYapısı1_2{
    public abstract void Metod2();
    public void Metod3(){
        System.out.println("Metod 3");
    }
}

class InterfaceYapısı1_3 extends InterfaceYapısı1_2 implements InterfaceYapısı1_1{
    public void Metod1(){
        System.out.println("Metod 1");
    }    
    
    public void Metod2(){
        System.out.println("Metod 2");
    }
    
}
