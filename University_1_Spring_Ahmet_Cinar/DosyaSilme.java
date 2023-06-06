package Ders;

import java.io.File;

public class DosyaSilme {
    public static void main(String[] args) {
        
        File sil=new File("sil.txt");
        
        if(sil.exists()){
            sil.delete();
        }
    }
}
