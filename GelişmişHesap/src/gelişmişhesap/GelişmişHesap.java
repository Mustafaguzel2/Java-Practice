
package gelişmişhesap;

import java.util.Scanner;

public class GelişmişHesap {
    public static int cikarma(int a, int b) {
        return (a - b);
    }
    public static int bolme(int a, int b) {
        return (a / b);
    }
    public static int toplama(int a, int b, int c) {
        return (a + b + c);
    }
    public static int toplama(int a, int b) {
        return (a + b);
    }
    public static int carpma(int a, int b) {
        return (a * b);
    }
    public static int carpma(int a, int b, int c) {
        return (a * b * c);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        String islemler = "1. Toplama işlemi\n" +
                          "1. Çıkarma işlemi\n" +
                          "1. Bölme işlemi\n" +
                          "4. Çarpma işlemi\n" +
                          "Çıkış için q`ya basınız. ";
        
        System.out.println("***********************");
        System.out.println(islemler);
        System.out.println("***********************");
        
        while(true) {
            System.out.print("İşlemi seçiniz: ");
            String islem = scanner.nextLine();
            if(islem.equals("1")) {
                System.out.println("Kaç sayılı toplama işlemi yapmak istiyorsunuz(2-3): ");
                String secim = scanner.nextLine();
                if(secim.equals("2")) {
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen sayıların toplamı: " + toplama(a, b));
                }
                else if(secim.equals("3")){
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    System.out.print("c: ");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen sayıların toplamı: " + toplama(a, b, c));
                }
                else {
                    System.out.println("Uygun işlem seçeneği yoktur.!!");
                }
            }
            else if(islem.equals("2")) {
                System.out.println("Çıkarma işlemi için sayıları giriniz.");
                System.out.print("a: ");
                int a = scanner.nextInt();
                System.out.print("b: ");
                int b = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Girilen sayıların farkı: " + cikarma(a, b));
            }
            else if(islem.equals("3")) {
                System.out.println("Bölme işlemi için sayıları giriniz.");
                System.out.print("a: ");
                int a = scanner.nextInt();
                System.out.print("b: ");
                int b = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Girilen sayıların bölümü: " + bolme(a, b));
            }
            else if(islem.equals("4")) {
                System.out.println("");
                System.out.println("Kaç sayılı çarpma işlemi yapmak istiyorsunuz(2-3): ");
                String secim = scanner.nextLine();
                if(secim.equals("2")) {
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen sayıların çarpımı: " + carpma(a, b));
                }
                else if(secim.equals("3")){
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    System.out.print("c: ");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen sayıların çarpımı: " + carpma(a, b, c));
                }
                else {
                    System.out.print("Uygun işlem seçeneği yoktur.!!");
                }
            }
            else if(islem.equals("q")) {
                System.out.println("Hesap makinesinden çıkılıyor...");
                
                break;
                
            }
        }
    }
    
}
