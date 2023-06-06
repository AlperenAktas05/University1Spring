package Ders;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DosyaÖrnek5 {
    public static void main(String[] args) throws FileNotFoundException {
        //Klavyeden girilen stringler içinde ilk harfi a ile başlayanları sinif.txt dosyasına yazan program
        Scanner k=new Scanner(System.in);
        
        String mesaj;
        
        File ornek5=new File("ornek5.txt");
        PrintWriter pw=new PrintWriter(ornek5);
        
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1)+". Kelimeyi Giriniz");
            mesaj=k.next();
            
            if(mesaj.charAt(0)=='a' || mesaj.charAt(0)=='A'){
                pw.println(mesaj);
            }
        }
        
        pw.close();
    }
}
