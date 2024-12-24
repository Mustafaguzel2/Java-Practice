
package çalışma6;

import java.util.Scanner;

public class Çalışma6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int bakiye = 1000;
        String islemler = "1. İşlem: Bakiye sorgulama\n"
                        + "2. İşlem: Para çekme\n"
                        + "3. İşlem: Para yatırma\n"
                        + "Çıkış için q`a basınız.";
        System.out.println("********************");
        System.out.println(islemler);
        System.out.println("********************");
        while(true) {
            System.out.print("İşlemi seçiniz: ");
            String islem = scanner.nextLine();
            
            if(islem.equals("q")) {
                System.out.println("Programdan çıkılıyor...");
                
                break;
            }
            else if(islem.equals("1")) {
                System.out.println("Bakiyeniz: " + bakiye);
                
            }
            else if(islem.equals("2")) {
                System.out.println("Bakiye yüklemesi yapılacaktır, yatırmak istediğiniz ücreti giriniz: ");
                int eklenenPara = scanner.nextInt();
                scanner.nextLine();
                
                bakiye += eklenenPara;
                System.out.println("İşlem sonrası bakiyeniz: " + (bakiye));
                
            }
            else if(islem.equals("3")) {
                System.out.println("Çekmek istediğiniz tutarı giriniz: ");
                int çekilenPara = scanner.nextInt();
                scanner.nextLine();
                
                if (çekilenPara > bakiye) {
                    System.out.println("Bu parayı alacak kadar bakiyeniz yoktur. Tekrar deneyiniz.");
                }
                else {
                    bakiye -= çekilenPara;
                    System.out.println("Kalan bakiyeniz: " + (bakiye));
                }
            }
            else {
                System.out.println("Geçersiz işlem girdiniz.");
            }
        }
    }
    
}
