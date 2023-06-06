package Ders;

public class PolimorfizmYapısı2 {
    public static void main(String[] args) {
        
        PolimorfizmYapısı2_1 polimorfizmYapısı2_1_1=new PolimorfizmYapısı2_2(); //Polimorfizm
        polimorfizmYapısı2_1_1.Metod1();
        
        PolimorfizmYapısı2_1 polimorfizmYapısı2_1_2= new PolimorfizmYapısı2_3(); //Polimorfizm
        polimorfizmYapısı2_1_2.Metod1();
        
        PolimorfizmYapısı2_2 polimorfizmYapısı2_2=new PolimorfizmYapısı2_3(); //Polimorfizm
        polimorfizmYapısı2_2.Metod2(); //Polimorfizm sayesinde
        polimorfizmYapısı2_2.Metod1(); //Kalıtım sayesinde
                
    }
}

class PolimorfizmYapısı2_1{
    public void Metod1(){
        System.out.println("Metod1");
    }
}

class PolimorfizmYapısı2_2 extends PolimorfizmYapısı2_1{ //Kalıtım
    public void Metod2(){
        System.out.println("Metod2");
    }
}

class PolimorfizmYapısı2_3 extends PolimorfizmYapısı2_2{ //Kalıtım
    public void Metod3(){
        System.out.println("Metod3");
    }
}
