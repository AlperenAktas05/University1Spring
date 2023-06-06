package Ders;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DosyaÖrnek7 {
    public static void main(String[] args) throws FileNotFoundException {
        //ornek7.txt dosyasında sayılar ve stringler bulunmaktadır bu dosyadaki sayıları sayı.txt, stringleri string.txt dosyasına yazan program
        
        File ornek7=new File("ornek7.txt");
        File ornek7Sayi=new File("ornek7Sayi.txt");
        File ornek7Karakter=new File("ornek7Karakter.txt");
        Scanner sc=new Scanner(ornek7);
        PrintWriter pw=new PrintWriter(ornek7Sayi);
        PrintWriter pw2=new PrintWriter(ornek7Karakter);
        
        String mesaj="";
        
        while(sc.hasNext()){
            mesaj=sc.next();

            String sayi="";
            String karakter="";            
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
        sc.close();
    }
}
