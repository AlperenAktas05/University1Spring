package Ders;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DosyayaYazma {
    public static void main(String[] args) throws IOException {
        Scanner k=new Scanner(System.in);
        
        String cumle;
        System.out.println("Bir Cümle Giriniz");
        cumle=k.next();
        
        File dosyayaYazma=new File("dosyayaYazma.txt");
        if(!dosyayaYazma.exists()){
            dosyayaYazma.createNewFile();
        }
        
        PrintWriter pw=new PrintWriter(dosyayaYazma);
        pw.print(cumle);        
        pw.close();
    }
}
