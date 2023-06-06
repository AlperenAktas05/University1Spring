package Ders;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DosyaÖrnek6 {
    public static void main(String[] args) throws FileNotFoundException {
        //örnek6.txt içindeji sayıları ve stringleri okuyan program
        
        File ornek6=new File("ornek6.txt");
        Scanner sc=new Scanner(ornek6);
        
        String mesaj="";
        
        while(sc.hasNext()){
            mesaj=mesaj+sc.next()+"\n";
        }     
        System.out.println(mesaj);
        
        sc.close();
        
    }
}
