package switchcase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("İşlem numarası giriniz: ");
        int islem = scanner.nextInt();
        
        switch (islem) { //Case işlemleri sonunda break kullanmazsan diğer case`lerde kontrol ediliyor.
            case 1:
                System.out.println("Birinci işlem");
                
                break;
            case 2:
                System.out.println("İkinci işlem");
                
                break;
            default:
                System.out.println("Geçersiz işlem...");
                
                break;
        }
    }
    
}
