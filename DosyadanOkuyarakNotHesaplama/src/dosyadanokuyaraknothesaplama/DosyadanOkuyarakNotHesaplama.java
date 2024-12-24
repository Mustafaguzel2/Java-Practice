package dosyadanokuyaraknothesaplama;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DosyadanOkuyarakNotHesaplama {
    public static String harfNotuHesapla(String isim,int vize1,int vize2, int finalnot){
    String cikti = "";
    double toplamnot = (vize1 * 3 / 10.0) + (vize2 * 3 / 10.0) + (finalnot * 4 / 10.0);
    if(toplamnot >= 90){
        cikti = isim + " bu dersten AA aldı";
    }
    else if(toplamnot >= 85){
        cikti = isim + " bu dersten BA aldı";
    }
    else if(toplamnot >= 80){
        cikti = isim + " bu dersten BB aldı";
    }
    else if(toplamnot >= 75){
        cikti = isim + " bu dersten CB aldı";
    }
    else if(toplamnot >= 70){
        cikti = isim + " bu dersten CC aldı";
    }
    else if(toplamnot >= 65){
        cikti = isim + " bu dersten DC aldı";
    }
    else if(toplamnot >= 60){
        cikti = isim + " bu dersten DD aldı";
    }
    else if(toplamnot >= 55){
        cikti = isim + " bu dersten FD aldı";
    }
    else{
        cikti = isim + " bu dersten FF aldı";
    }
    return cikti;
}
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(new FileReader("dosya.txt"));
            FileWriter writer = new FileWriter("harfnotlari.txt")){
            while(scanner.hasNextLine()){
                String ogrenciBilgileri = scanner.nextLine();
                String[] ogrenciArray = ogrenciBilgileri.split(",");
                int vize1 = Integer.valueOf(ogrenciArray[1]);
                int vize2 = Integer.valueOf(ogrenciArray[2]);
                int finalnotu = Integer.valueOf(ogrenciArray[3]);
                String cikti = harfNotuHesapla(ogrenciArray[0], vize1, vize2, finalnotu);
                writer.write(cikti + "\n");
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DosyadanOkuyarakNotHesaplama.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DosyadanOkuyarakNotHesaplama.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
