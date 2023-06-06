package Ders;

public class KompozisyonYapısı3 {
    KompozisyonYapısı3_1 kompozisyonYapısı3_1=new KompozisyonYapısı3_1();
    public static void main(String[] args) {
        
        KompozisyonYapısı3 kompozisyonYapisi3=new KompozisyonYapısı3();
        kompozisyonYapisi3.kompozisyonYapısı3_1.Metod1();
    }
}

class KompozisyonYapısı3_1{
    public void Metod1(){
        System.out.println("Burası Metod 1");
        Metod2(); //buraya çağırdığımız için artık Metod2 public oldu.
    }
    
    private void Metod2(){ //sadece bulunduğu class'ta çalışır.
        System.out.println("Burası Metod 2");
    }
}
