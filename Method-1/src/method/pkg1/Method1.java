package method.pkg1;

import java.util.Scanner;

public class Method1 {
    public static void faktöriyel() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Faktoriyelini almak istediğiniz sayıyı giriniz: ");
        int sayı = scanner.nextInt();
        
        int faktöriyel = 1;
        
        while (sayı > 1) {
            faktöriyel *= sayı;
            sayı--;
        }
        System.out.println("faktöriyel = " + faktöriyel);
        
    }
    public static void selamlama() {
        System.out.println("Merhaba Nasılsınız ?");
        System.out.println("Selamlarr");
    }
    public static void main(String[] args) {
        /*Erişim belirleyici (public) opsiyonel değişebilir, 
        Ekstra özellikler(Static), dönüş tipi(void)fonksiyondan gelen çıktı değişebilir,
        Fonksiyon adı(fonkisyonun yapacağı işle alakalı olmalı), 
        Parametreler(içi boşta kalabilir veya belli işlemler için parametre girilebilir)*/
        
        faktöriyel();
    }

}
