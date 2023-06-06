package Ders;

public class Hazirlik3 {
    //Sınıf classı içinde constructor kullanmak suretiyle, ogrenci sayisi, dersin adı, hocanın adı yazılacaktır.
    //Bu classın içinde ders_anlat diye bir metod oluşturup metodda sınıfta hoca olup olmadığını belirtecek.
    public static void main(String[] args) {
        Sinif sinif=new Sinif(30,"Algoritma",null);
        
        sinif.Ders_Anlat();
    }
}

class Sinif{
    int ogrenci_sayisi;
    String ders_adi, hoca_adi;
    public Sinif(int a, String b, String c){
        ogrenci_sayisi=a;
        ders_adi=b;
        hoca_adi=c;
    }
    
    public void Ders_Anlat(){
        if(hoca_adi==null){
            System.out.println("Hoca Sinifta Yok");
        }
        
        else{
            System.out.println("Hoca Sinifta");
        }
    }
}
 