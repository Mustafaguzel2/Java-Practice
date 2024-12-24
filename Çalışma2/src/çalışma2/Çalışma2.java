
package çalışma2;

import java.util.Scanner;

public class Çalışma2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi1;
        int sayi2;
        System.out.println("Birinci sayı: ");
        sayi1 = scanner.nextInt();
        System.out.println("İkinci sayı: ");
        sayi2 = scanner.nextInt();
        System.out.println("Sayılar değiştirilmeden önce...");
        System.out.println("Birinci sayi= " + sayi1 + "ikinci sayi= " + sayi2);
        int gecici = sayi1;
        sayi1 = sayi2;
        sayi2 = gecici;
        System.out.println("Değiştirildikten sonra...");
        System.out.println("Birinci sayi= " + sayi1 + "ikinci sayi= " + sayi2);
    }
    
}
