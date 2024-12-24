package pkgdo.pkgwhile;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        /*int i = 0;
        
        do {
            System.out.println("i = " + i);
            i++;
        }while(i < 5);
        */
        
        Scanner scanner = new Scanner(System.in);
        
        /*System.out.println("Bir sayı giriniz: ");
        
        int sayı = scanner.nextInt();
        int toplam = 0;
        do {            
            toplam += sayı;
            sayı--;
            
        } while (sayı > 0);
            System.out.println("Sayının toplamı = " + toplam);*/
        
        System.out.println("Bir sayı giriniz: ");
        
        int sayı = scanner.nextInt();
        int toplam = 0;
        
        do {            
            toplam += sayı % 10;
            sayı /= 10;
            System.out.println("Sayı = " + sayı);
            
        } while (sayı > 0);
        
        System.out.println("Rakamları toplamı = " + toplam);
    }
    
}
