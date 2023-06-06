package Ders;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DosyaÖrnek4 {
    public static void main(String[] args) throws FileNotFoundException {
        //Klavyeden girilen 5 sayıdan çift olanları çift.txt, tek olanları tek.txt dosyasına yazan program
        Scanner k=new Scanner(System.in);
        
        int sayi;
        
        File ornek4Tek=new File("ornek4Tek.txt");
        File ornek4Cift=new File("ornek4Cift.txt");
        
        PrintWriter pw=new PrintWriter(ornek4Tek);
        PrintWriter pw2=new PrintWriter(ornek4Cift);
        
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1)+". Sayiyi Giriniz");
            sayi=k.nextInt();
            
            if(sayi%2==1){
                pw.println(sayi);
            }
            
            else{
                pw2.println(sayi);
            }
        }
        
        pw.close();
        pw2.close();
    }
}
