package Ders;

import java.util.Scanner;

public class SıfıraBölmeExceptions {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int sayi1, sayi2;
        
        System.out.println("Birinci Sayiyi Giriniz");
        sayi1=k.nextInt();
        
        System.out.println("İkinci Sayiyi Giriniz");
        sayi2=k.nextInt();
        
        try{
            System.out.println("Sonuc="+(sayi1/sayi2));
        }
        catch(ArithmeticException exc){
            System.out.println("Matematiksel Hata!");
        }
    }
}
