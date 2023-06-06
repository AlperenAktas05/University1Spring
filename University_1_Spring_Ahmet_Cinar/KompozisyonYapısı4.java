package Ders;

public class KompozisyonYapısı4 {
    public KompozisyonYapısı4_1 kompozisyonYapısı4_1=new KompozisyonYapısı4_1(); //Kompozisyon
    public static void main(String[] args) {
        
        KompozisyonYapısı4 kompozisyonYapisi4=new KompozisyonYapısı4();
    }
}

class KompozisyonYapısı4_1{
    public KompozisyonYapısı4_1(){
        System.out.println("Bu bir constructor mesajıdır");
        Metod1();
    }
    
    private void Metod1(){
        System.out.println("Bu bir private metod mesajıdır");
    }
}
