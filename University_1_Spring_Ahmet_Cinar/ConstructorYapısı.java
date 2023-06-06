package Ders;
public class ConstructorYapısı {
    public static void main(String[] args) {
        Alperen constructor=new Alperen(); //Bu parametresiz constructora bağlıdır.
        Alperen alperen=new Alperen(31,"LoL"); //Bu parametreli constructora bağlıdır.
        
        
        System.out.println(constructor.isim);
        System.out.println(constructor.yas);
        System.out.println(alperen.oyun);
        System.out.println(alperen.numara);
    }
}

class Alperen{
    int yas;
    String isim;
    String oyun;
    int numara;
    
    public Alperen(){ //Bu bir constructordır. Class ismi ile aynı olmalıdır. Tipi yoktur. Metod gibi çalışır.
        System.out.println("Bu bir constructor mesajıdır.");
        yas=19;
        isim="Alperen";
    }
    
    public Alperen(int a, String b){
        numara=a;
        oyun=b;
    }
}
