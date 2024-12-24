package scankullanma;
import java.util.Scanner;
public class Scankullanma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();
        System.out.println("Yaşınız: " + yas);
        System.out.println("Ondalıklı bir sayı giriniz: ");
        double sayı = scanner.nextDouble();
        System.out.println("Girdiğiniz sayı: " + sayı);
        System.out.println("Lütfen bir cümle giriniz: ");
        String yazi = scanner.nextLine();
        System.out.println("Girdiniğiniz cümle: " + yazi);
        System.out.println("Bir sayı giriniz: ");
        if (scanner.hasNextInt()){
            int sayi = scanner.nextInt();
            System.out.println("Sayı: " + sayi);
        }
        else {
            System.out.println("Lütfen bir sayı giriniz.");
        
        }*/
        System.out.println("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();
        scanner.nextLine(); /*Dummy bunu girmezsek sıradaki nextline ı alamıyoruz. 
        arka arkaya sayı alırken sorun olmuyor.*/
        System.out.println("İsminizi giriniz: ");
        String isim = scanner.nextLine();
        System.out.println("Yaşınız: " + yas);
        System.out.println("İsminiz: " + isim);
    }
    
}
