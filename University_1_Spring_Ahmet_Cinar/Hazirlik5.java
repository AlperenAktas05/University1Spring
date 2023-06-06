package Ders;

public class Hazirlik5 {
    //Yılın ayları kullanılacaktır. 1. ayda kar küreme, 6. ayda okul karnesi, 9. ayda okul baslayacaktır.
    public static void main(String[] args) {
        Yıllar yillar=new Yıllar();
        
        yillar.kar_kureme();
        yillar.okul_karne();
        yillar.okul_baslar();
        
        System.out.println(Aylar.birinci_ay);
        System.out.println(Aylar.altinci_ay);
        System.out.println(Aylar.dokuzuncu_ay);
    }
}

interface Aylar{
    String birinci_ay="ocak", altinci_ay="haziran", dokuzuncu_ay="eylül";
    public void kar_kureme();
    public void okul_karne();
    public void okul_baslar();
}

class Yıllar{
    public void kar_kureme(){
        System.out.println("Kar Kurendi");
    }
    
    public void okul_karne(){
        System.out.println("Karne Alindi");
    }
    
    public void okul_baslar(){
        System.out.println("Okul Basladi");
    }
}
