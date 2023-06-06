package Ders;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DosyaÖrnek3 {
    public static void main(String[] args) throws FileNotFoundException {
        //Klavyeden girilen ifadelerde sayi olanları sayi.dat, karakter olanları karakter.dat dosyasına yazan program
        Scanner k=new Scanner(System.in);
        
        String mesaj;
        
        File ornek3Sayi=new File("ornek3Sayi.txt");
        File ornek3Karakter=new File("ornek3Karakter.txt");
        
        PrintWriter pw=new PrintWriter(ornek3Sayi);
        PrintWriter pw2=new PrintWriter(ornek3Karakter);
        
        System.out.println("İfade Giriniz. Programdan çıkmak için * tuşuna basınız");
        for (;;) {
            mesaj=k.next();
            String sayi="";
            String karakter="";
            
            if(mesaj.equals("*")){
                break;
            }
            
            for (int i = 0; i < mesaj.length(); i++) {
                if(mesaj.charAt(i)<='9' && mesaj.charAt(i)>='0'){
                    sayi=sayi+mesaj.charAt(i);
                }
                
                if(mesaj.charAt(i)<='z' && mesaj.charAt(i)>='a'){
                    karakter=karakter+mesaj.charAt(i);
                }
            }
            
            pw.println(sayi);
            pw2.println(karakter);
            
        }
        
        pw.close();
        pw2.close();
    }
}
