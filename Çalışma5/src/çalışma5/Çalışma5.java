package çalışma5;

import java.util.Scanner;

public class Çalışma5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("**************************");
        String islemler = "1. Toplama İşlemi\n"
                        + "2. Çıkarma İşlemi\n"
                        + "3. Çarpma İşlemi\n"
                        + "4. Bölme İşlemi\n";
        System.out.print(islemler);
        System.out.println("**************************");
        
        System.out.println("İşlemi seçiniz: ");
        String islem = scanner.nextLine();
        
        double a;
        double b;
        switch(islem) {
            case "1":
                System.out.println("Birinci sayı: ");
                a = scanner.nextDouble();
                
                System.out.println("İkinci sayı: ");
                b = scanner.nextDouble();
                
                System.out.println("Girilen değerlerin toplamları: " + (a + b));
                
                break;
            case "2":
                System.out.println("Birinci sayı: ");
                a = scanner.nextDouble();
                
                System.out.println("İkinci sayı: ");
                b = scanner.nextDouble();
                
                System.out.println("Girilen değerlerin farkları: " + (a - b));
                
                break;
            case "3":
                System.out.println("Birinci sayı: ");
                a = scanner.nextDouble();
                
                System.out.println("İkinci sayı: ");
                b = scanner.nextDouble();
                
                System.out.println("Girilen değerlerin çarpımları: " + (a * b));
                
                break;
            case "4":
                System.out.println("Birinci sayı: ");
                a = scanner.nextDouble();
                
                System.out.println("İkinci sayı: ");
                b = scanner.nextDouble();
                
                System.out.print("Girilen değerlerin bölümü: ");
                System.out.printf("%.2f" , (a / b));
                
                break;
            default:
                System.out.println("Geçersiz işlem numarası girdiniz.");
                
                break;
        }
        
    }
    
}
