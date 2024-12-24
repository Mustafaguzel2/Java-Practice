package serialization1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class ObjeyiYaz {
    public static void main(String[] args){
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))){
                Ogrenci ogrenci1 = new Ogrenci("Mustafa Güzel", 12, "Bilgisayar Mühendisliği");
                Ogrenci ogrenci2 = new Ogrenci("Oğuz Karal", 16, "Matematik Mühendisliği");
                out.writeObject(ogrenci1);
                out.writeObject(ogrenci2);
        } catch (FileNotFoundException ex) {
            System.err.println("Dosya bulunamadı!");
        } catch (IOException ex) {
            System.err.println("Dosya açılırken bir hata oluştu!");
        }
      
      } 
}
