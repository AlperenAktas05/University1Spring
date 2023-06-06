package Ders;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Hazirlik2 {
    //Klavyeden girilen rakamları rakam.txt, diğerlerini diğer.txt dosyasına yazan metodu yazınız.
    public static void main(String[] args) throws FileNotFoundException {               
        Hazirlik2_1();       
    }
    
    public static void Hazirlik2_1() throws FileNotFoundException{
        Scanner k=new Scanner(System.in);
        String mesaj;
        
        File hazirlik2Rakam=new File("hazirlik2Rakam.txt");
        File hazirlik2Diger=new File("hazirlik2Diger.txt");
        
        PrintWriter pw=new PrintWriter(hazirlik2Rakam);
        PrintWriter pw2=new PrintWriter(hazirlik2Diger);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Lutfen Mesaj Giriniz");
            mesaj=k.next();
            
            if(mesaj.length()==1 && mesaj.charAt(0)<='9' && mesaj.charAt(0)>='0'){
                pw.println(mesaj);
            }
            
            else{
                pw2.println(mesaj);
            }
        }
        
        pw.close();
        pw2.close();
    }
}
