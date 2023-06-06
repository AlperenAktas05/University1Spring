package Ders;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DosyaÖrnek2 {
    public static void main(String[] args) throws IOException {
        //Klavyeden girilen 3 kişiye ait ad soyad numara bilgisini örnek2.txt dosyasına yazan program
        Scanner k=new Scanner(System.in);
        
        File ornek2=new File("ornek2.txt");
        if(!ornek2.exists()){
            ornek2.createNewFile();
        }
        
        String mesaj="";
        
        PrintWriter pw=new PrintWriter(ornek2);
        
        for (int i = 0; i < 3; i++) {
            System.out.println((i+1)+". Kisinin Ad Soyad Numara Bilgisini Giriniz");
            mesaj=k.nextLine();
            pw.println(mesaj);
        }
        
        pw.close();
    }
}
//FileWriter nesnesi dosyanın içeriğini korur, fakat her şeyi yan yana yazar.
//PrintWriter nesnesi içeriği korumaz, fakat alt alta yazabilir.