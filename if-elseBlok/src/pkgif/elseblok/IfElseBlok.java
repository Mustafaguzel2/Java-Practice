package pkgif.elseblok;

import java.util.Scanner;

public class IfElseBlok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*System.out.print("Lütfen yaşınızı giriniz: ");
        int yas = scanner.nextInt();
        
        if(yas < 18) {
            
            System.out.println("Bu mekana giremezsiniz.");
        }
        else{
            System.out.println("Mekana girişiniz onaylandı.");
        }*/
        System.out.println("Bir sayı giriniz: ");
        
        int sayı = scanner.nextInt();
        
        if(sayı % 2 == 0) {
            System.out.println("Girdiğiniz sayı çifttir.");   
        }
        
        else {
            System.out.println("Girilen sayı tektir.");
        }
    }
    
}
