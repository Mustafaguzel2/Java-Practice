package çalışma1;

import java.util.Scanner;
import jdk.jfr.StackTrace;

public class Çalışma1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("İsminizi giriniz: ");
        String name = scanner.nextLine();
        System.out.print("Kilonuzu giriniz: ");
        double kilo = scanner.nextDouble();
        System.out.print("Boyunuzu giriniz(metre olarak): ");
        double boy = scanner.nextDouble();
        System.out.println("İsminiz: " + name + " Boyunuz: " + boy + " Kilonuz: " + kilo);
        float index = (float) (kilo / (boy * boy));
        
        if (index < 18.5) {
            System.out.println("Boy kilo endeksiniz: " + index);
            System.out.println("Endekse göre Zayıfsınız.");
        }
        else if(index >= 18.5 && index < 25) {
            System.out.println("Boy kilo endeksiniz: " + index);
            System.out.println("Endekse göre Normalsiniz.");
        }
        else if(index >= 25 && index < 30) {
            System.out.println("Boy kilo endeksiniz: " + index);
            System.out.println("Endekse göre Fazla Kilolusunuz.");
        }
        else {
            System.out.println("Boy kilo endeksiniz: " + index);
            System.out.println("Endekse göre Obezsiniz.");
        }
        
        
    }
    
}
