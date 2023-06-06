package Ders;

public class AbstractClasslar2 extends AbstractClasslar2_2{
    public void Metod3(){
        System.out.println("Metod3");
    }
    
    public void Metod2(){
        System.out.println("Metod2");
    }
    
    public static void main(String[] args) {
        AbstractClasslar2 abstractClasslar2=new AbstractClasslar2();
        abstractClasslar2.Metod1();
        abstractClasslar2.Metod2();
        abstractClasslar2.Metod3();
    }
}

abstract class AbstractClasslar2_1{
    public void Metod1(){
        System.out.println("Metod1");
    }
    public abstract void Metod2();
}

abstract class AbstractClasslar2_2 extends AbstractClasslar2_1{
    public abstract void Metod3();
}
