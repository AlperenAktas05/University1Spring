package Ders;

import java.util.Scanner;

public class InputOutputExceptions {
    public static void main(String[] args) {
         Scanner k=new Scanner(System.in);
         
         int sayi1,sayi2;
         
         try{
             System.out.println("Birinci Sayiyi Giriniz");
             sayi1=k.nextInt();
             
             System.out.println("İkinci Sayiyi Giriniz");
             sayi2=k.nextInt();
             
             System.out.println("Sonuc="+(sayi1+sayi2));
         }
         catch(Exception exc){
             System.out.println("Lütfen sayi giriniz");
         }
    }
}