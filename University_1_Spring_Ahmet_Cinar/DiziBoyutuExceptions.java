package Ders;

import java.util.Scanner;

public class DiziBoyutuExceptions {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        int list[]={1,2,3};
        int eleman;
        
        System.out.println("Kaçıncı Elemanı İstiyorsunuz");
        eleman=k.nextInt();
        
        try{
            System.out.println(list[eleman-1]);
        }
        catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("Dizi Boyutu Hatası!");
        }
    }
}
