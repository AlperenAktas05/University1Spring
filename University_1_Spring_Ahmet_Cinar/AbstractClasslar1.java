package Ders;

public class AbstractClasslar1 {
    public static void main(String[] args) {
        AbstractClasslar1_2 abstractClasslar1_2=new AbstractClasslar1_2();
        abstractClasslar1_2.Metod2(); //Kalıtım
        abstractClasslar1_2.Metod1(); //Abstract
        
        AbstractClasslar1_1 abstractClasslar1_1=new AbstractClasslar1_2(); //Polimorfizm
        abstractClasslar1_1.Metod1();
        abstractClasslar1_1.Metod2();
    }
}

abstract class AbstractClasslar1_1{ //Soyut Class
    public abstract void Metod1(); //Soyut Metod. Gövdesi yok.
    public void Metod2(){
            System.out.println("Metod 2");
    }
}

class AbstractClasslar1_2 extends AbstractClasslar1_1{ //Kalıtım
    public void Metod1(){ //Soyut metodla aynı isim. Artık somutlaştı.
        System.out.println("Metod 1");
    }
}
