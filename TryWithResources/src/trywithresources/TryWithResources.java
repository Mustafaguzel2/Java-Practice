package trywithresources;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TryWithResources {

    public static void main(String[] args) {
        try(FileWriter writer1 = new FileWriter("dosya.txt",true);
            FileWriter writer2 = new FileWriter("diller.txt",true)){
            //Bu yapı ile close otomatik olur ve istediğimiz kadar writer ekleyebiliriz
            writer1.write("Deneme deneme \n");
            writer1.write("3\n2\n1");
            Scanner scanner = new Scanner(System.in);
            String dil;
            while (true){
                System.err.println("Bir dil giriniz: ");
                dil = scanner.nextLine();
                
                if(dil.equals("-1")){
                    System.err.println("Programdan çıkılıyor...");
                    System.err.println("Dosyayı kontrol ediniz!");
                    break;
                }
                writer2.write( dil + "\n");
            }
        } catch (IOException ex) {
            System.err.println("Dosya oluşturulurken hata oluştu!");
        }
    }
    
}
