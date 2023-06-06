package Ders;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DosyaÖrnek8 {
    public static void main(String[] args) throws FileNotFoundException {
        //örnek8.txt dosyası içinde rakamlar ve stringler vardır.karakter.txt'de ise sadece stringler bulunmaktadır.Bunları birleştirip okuyan program
        
        File ornek8Sayilar=new File("ornek8Sayilar.txt");
        File ornek8Karakterler=new File("ornek8Karakterler.txt");
        File ornek8=new File("ornek8.txt");
        Scanner sc=new Scanner(ornek8Sayilar);
        Scanner sc2=new Scanner(ornek8Karakterler);
        PrintWriter pw=new PrintWriter(ornek8);
        
        String top="";
        
        while(sc.hasNext()){
            top=sc.next()+sc2.next();
            pw.println(top);
        }
        
        sc.close();
        sc2.close();
        pw.close();
    }
}
