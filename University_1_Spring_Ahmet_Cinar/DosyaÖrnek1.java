package Ders;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class DosyaÖrnek1 {
    public static void main(String[] args) throws IOException {
        //örnek1.txt dosyasına adınızı soyadınızı yazınız.
        
        File ornek1=new File("ornek1.txt");
        String ad="Alperen Aktas";
        
        if(!ornek1.exists()){
            ornek1.createNewFile();
        }
        
        PrintWriter pw=new PrintWriter(ornek1);
        pw.print(ad);
        
        pw.close();
    }
}
