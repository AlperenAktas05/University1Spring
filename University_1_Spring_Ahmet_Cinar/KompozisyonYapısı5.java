package Ders;

public class KompozisyonYapısı5 {
    KompozisyonYapısı5_3 kompozisyonYapısı5_3=new KompozisyonYapısı5_3();
    public static void main(String[] args) {
        KompozisyonYapısı5 kompozisyonYapısı5=new KompozisyonYapısı5();
    }
}

class KompozisyonYapısı5_1{
    public KompozisyonYapısı5_1(){
        System.out.println("İlk constructor");
    }
}

class KompozisyonYapısı5_2{
    KompozisyonYapısı5_1 kompozisyonYapısı5_1=new KompozisyonYapısı5_1();
    public KompozisyonYapısı5_2(){
        System.out.println("İkinci constructor");
    }
}

class KompozisyonYapısı5_3{
    KompozisyonYapısı5_2 kompozisyonYapısı5_2=new KompozisyonYapısı5_2();
    public KompozisyonYapısı5_3(){
        System.out.println("Üçüncü constructor");
    }
}
