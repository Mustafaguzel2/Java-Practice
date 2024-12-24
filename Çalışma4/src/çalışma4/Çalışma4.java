package çalışma4;

import java.util.Scanner;

public class Çalışma4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Birinci sayıyı giriniz: ");
        int sayı1 = scanner.nextInt();
        
        System.out.println("İkinci sayıyı giriniz: ");
        int sayı2 = scanner.nextInt();
        
        System.out.println("Üçüncü sayıyı giriniz: ");
        int sayı3 = scanner.nextInt();
        
        /*if(sayı1 >= sayı2 && sayı1 >= sayı3) {
            System.out.println("En büyük sayı = " + sayı1);// Bu şekilde bulunabilir.
        }
        else if (sayı1 >= sayı2 && sayı3 >= sayı1) {
            System.out.println("En büyük sayı = " + sayı3);
        }
        else {
            System.out.println("En büyük sayı = " + sayı2);
        }*/
        int maks = -1;
        if(sayı1 >= sayı2 && sayı1 >= sayı3) {
            maks = sayı1;
        }
        else if(sayı2 >= sayı1 && sayı2 >= sayı3) {
            maks = sayı2;
        }
        else {
            maks = sayı3;
        }
        System.out.println("Maksimum sayı = " + maks);
    }   
    
    
}
