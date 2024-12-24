package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


public class ObjeyiOku {
    public static void main(String[] args){
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenciler.bin"))) {
            Ogrenci[] ogrenci_array = (Ogrenci[])in.readObject();
            ArrayList<Ogrenci> ogrenci_list = (ArrayList<Ogrenci>)in.readObject();
            
            System.err.println("----------------------------");
            for(Ogrenci o: ogrenci_array){
                System.err.println(o);
                System.err.println("--------------------------");
            }
            for(Ogrenci o: ogrenci_list){
                System.err.println(o);
                System.err.println("--------------------------");
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Dosya bulunamadı!");
        } catch (IOException ex) {
            System.err.println("Dosya açılırken bir hata oluştu!");
        } catch (ClassNotFoundException ex) {
            System.err.println("Sınıf bulunamadı!");
        }
    }
}
