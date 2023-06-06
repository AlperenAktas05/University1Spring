package Ders;

import java.io.File;
import java.io.IOException;

public class DosyaOluşturma {
    public static void main(String[] args) throws IOException {
        
        boolean kontrol=false;
        
        File dosyaOlusturma= new File("dosyaOlusturma.txt");
        
        if(dosyaOlusturma.exists()){
            kontrol=true;
        }
        System.out.println(kontrol);
        
        if(!dosyaOlusturma.exists()){
            dosyaOlusturma.createNewFile();
        }
        
        if(dosyaOlusturma.exists()){
            kontrol=true;
        }
        System.out.println(kontrol);
        
    }
}
