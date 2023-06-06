package Ders;

import java.io.File;

public class DosyaDizisi {
    public static void main(String[] args) {
        
        File klasör=new File("C:\\Users\\Alperen\\Desktop\\Alperen\\Dosyalar");
        
        File[] list=klasör.listFiles();
        
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
