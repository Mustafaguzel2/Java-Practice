package method.aşırıyükleme;
public class MethodAşırıYükleme {
    public static void skorhesapla(String isim, int puan) {
        System.out.println(isim + " adlı oyuncunun " + puan + " puanı var.");  
    }
    public static void skorhesapla(int puan) {
        System.out.println("İsimsiz oyuncunun " + puan + " puanı var.");  
    }
    public static void skorhesapla(String isim) {
        System.out.println(isim + " adlı oyuncunun hiç puanı yok.");  
    }
    
    public static void toplama(String a, String b) {
        System.out.println(a + " " + b);
    }
    public static int toplama(int a, int b) {
        return (a + b);
    }
    
    public static int toplama(int a, int b, int c) {
        return (a + b + c);
    }
    
    public static void main(String[] args) {
        
        System.out.println("Çıktı geliyor: " + toplama(toplama(3, 8, 4),2));
        //Aşırı yükleme ile bir fonksiyonu farklı parametre sayısı ile kullanabiliyioruz.(Biri 2 biri 3 değişken aldı.
        
        toplama("Mustafa", "Yiğit");
        
        skorhesapla("Ahmet");
        skorhesapla(250);
        skorhesapla("Mustafa", 1000);
    }
    
}
