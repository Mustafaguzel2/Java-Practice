package kullanıcıgiriş;

import java.util.Scanner;

public class KullanıcıGiriş {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int girisHakkı = 3;
        String sys_kullanıcı_adı = "Mustafa Yiğit Güzel";
        String sys_parola = "12345";
        
        System.out.println("***********************");
        System.out.println("Kullanıcı Girişine Hoşgeldiniz...");
        System.out.println("***********************");
        
        while(true) {
            System.out.println("Kullanıcı Adı: ");
            String kullanıcı = scanner.nextLine();
            System.out.println("Parola: ");
            String parola = scanner.nextLine();
            
            if(kullanıcı.equals(sys_kullanıcı_adı) && parola.equals(sys_parola)) {
                System.out.println("Hoşgeldiniz, " + kullanıcı);
                
                break;
            }
            else if (kullanıcı.equals(sys_kullanıcı_adı) &&  !parola.equals(sys_parola)) {
                System.out.println("Parolanız yanlış!");
                girisHakkı -= 1;
                System.out.println("Kalan deneme hakkınız: " + girisHakkı);
            }
            else if(!kullanıcı.equals(sys_kullanıcı_adı) && parola.equals(sys_parola)) {
                System.out.println("Kullanıcı adınız yanlış!");
                girisHakkı -= 1;
                System.out.println("Kalan deneme hakkınız: " + girisHakkı);
            }
            else {
                System.out.println("Kullanıcı adı ve parolanız yanlış!!");
                girisHakkı -= 1;
                System.out.println("Kalan deneme hakkınız: " + girisHakkı);
            }
            if(girisHakkı == 0) {
                System.out.println("Giriş hakkınız bitmiştir. Biraz mola verdikten sonra tekrar deneyiniz.");
                
                break;
            }
        }   
    }
    
}
