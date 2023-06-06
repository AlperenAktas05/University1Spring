package Ders;

import java.io.File;

public class KlasörOluşturma {
    public static void main(String[] args) {
        
        File klasör=new File("C:\\Users\\Alperen\\Documents\\NetBeansProjects\\Universite_1_Ilkbahar\\klasör");
        
        String list[]=klasör.list();
        
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
