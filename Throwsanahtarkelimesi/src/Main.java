
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    
    public static void mekan_kontrol(int yas) throws IOException {
        //Checked exceptionlarda throws kullanmak gerekir.
        //Çünkü uygulama onu çözmeden ilerlenmesine izin vermez.
        if (yas < 18) {
            throw new IOException();
            
        }
        else {
            System.out.println("Mekana hoşgeldiniz...");
        }
        
        
    }
    public static void main(String[] args) {
        
        
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz: ");
        int yas = scanner.nextInt();
        
        
        try {
            mekan_kontrol(yas);
        } catch (IOException ex) {
            System.out.println("IO Exception hatası vardır...");
        }
       
        
        
        
    }
}
