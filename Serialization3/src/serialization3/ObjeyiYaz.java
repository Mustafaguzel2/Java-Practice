package serialization3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;


public class ObjeyiYaz {
    public static void main(String[] args){
        Ogrenci ogrenci1 = new Ogrenci("Mustafa Güzel", 12, "Bilgisayar Mühendisliği");
        Ogrenci ogrenci2 = new Ogrenci("Oğuz Karal", 16, "Matematik Mühendisliği");
        Ogrenci ogrenci3 = new Ogrenci("Mehmet Fındık", 18, "Matematik");
        Ogrenci[] ogrenci_array = {ogrenci1,ogrenci2,ogrenci3};
        ArrayList<Ogrenci> ogrenci_list = new ArrayList<Ogrenci>(Arrays.asList(ogrenci_array));
        
        Ogrenci.setOgrenci_sayisi(100);
        
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenciler.bin"))){
               out.writeObject(ogrenci_array);
               out.writeObject(ogrenci_list);
                
                
        } catch (FileNotFoundException ex) {
            System.err.println("Dosya bulunamadı!");
        } catch (IOException ex) {
            System.err.println("Dosya açılırken bir hata oluştu!");
        }
      
      } 
}
