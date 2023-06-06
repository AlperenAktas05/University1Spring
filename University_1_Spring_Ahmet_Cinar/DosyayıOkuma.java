package Ders;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class DosyayıOkuma {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner k=new Scanner(System.in);
        
        File dosyaOkuma=new File("dosyayiOkuma.txt");
        Scanner sc=new Scanner(dosyaOkuma);
        
        String mesaj ="";
        
        while(sc.hasNext()){ //dosya sonuna kadar okur
            mesaj=mesaj+sc.next();
        }
        System.out.println(mesaj);
        
        sc.close();
    }
}
