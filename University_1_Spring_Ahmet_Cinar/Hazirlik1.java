package Ders;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Hazirlik1 {
    public static void main(String[] args) throws FileNotFoundException {
        //Kendisine parametre olarak gelen dosyadanın içinde kaç tane 100'den büyük sayı var yazınız.
        File hazirlik1=new File("hazirlik1.txt");
        System.out.println(Hazirlik1(hazirlik1));
    }
    
    public static int Hazirlik1(File hazirlik1) throws FileNotFoundException{
        Scanner sc=new Scanner(hazirlik1);
        int sayi;
        int sayac=0;
        
        while(sc.hasNext()){
            sayi=sc.nextInt();
            
            if(sayi>100){
                sayac++;
            }
        }       
        return sayac;
    }
}
