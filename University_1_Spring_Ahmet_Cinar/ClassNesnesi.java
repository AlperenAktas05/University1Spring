package Ders;
public class ClassNesnesi { //Ana Class
    public static void main(String[] args) {
        
        Merhaba merhaba=new Merhaba();
        
        System.out.println(merhaba.mesaj);
        System.out.println(merhaba.sayi);
        merhaba.ad();
        
    }
}

class Merhaba{
    int sayi=10;
    String mesaj="Merhaba Dünya";
    
    public void ad(){
        System.out.println("Benim Adım Alperen Aktaş");
    }
}