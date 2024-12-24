package fileıs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIS {
 
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("dosya.txt");
            /*System.err.println("Birinci karakter: " + (char)(fis.read()));//Tek karakter okuyor
            System.err.println("İkinci karakter: " + (char)(fis.read()));*/
            //fis.skip(5);//İstediğimiz karaktere sıçrar ve oradan devam eder
            //System.err.println("Okunan karakter: " + (char)(fis.read()));
            int deger;
            String s ="";
            while((deger = fis.read()) != -1){//fis.read'i degere eşitler ve -1 olduğunda döngüden çıkar
                s += (char) deger;
                
            }
            System.err.println("Dosya içeriği: " + s);
        } catch (FileNotFoundException ex) {
            System.err.println("Dosya bulunamadı!");
        } catch (IOException ex) {
            System.err.println("Dosya okunurken bir hata oluştu!!");
        }
        finally{
            try {
                if(fis != null){
                    fis.close();
                }
                
            } catch (IOException ex) {
                System.err.println("Dosya kapatılırken hata oluştu!");
            }
        }
    }
    
}
