package serialization1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class ObjeyiOku {
    public static void main(String[] args){
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenci.bin"))) {
            Ogrenci ogrenci1 = (Ogrenci)in.readObject();
            Ogrenci ogrenci2 = (Ogrenci)in.readObject();
            
            System.err.println("--------------------------");
            System.err.println(ogrenci1);
            System.err.println("--------------------------");
            System.err.println(ogrenci2);
        } catch (FileNotFoundException ex) {
            System.err.println("Dosya bulunamadı!");
        } catch (IOException ex) {
            System.err.println("Dosya açılırken bir hata oluştu!");
        } catch (ClassNotFoundException ex) {
            System.err.println("Sınıf bulunamadı!");
        }
    }
}
