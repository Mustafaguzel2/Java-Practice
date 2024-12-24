package fileos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileOS {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        //File file = new File("dosya.txt");
        try {
            fos = new FileOutputStream("dosya.txt",true);//true dosyanın sonuna ekleme sağlar sadece uzantı dosyayı sıfırlar.
            //fos.write(65); A yazar
            //byte[] array= {101,92,103,90};
            //fos.write(array);
            String s = "Mustafa Güzel";
            byte [] s_array = s.getBytes();
            fos.write(s_array);
            
        } catch (FileNotFoundException ex) {
            System.err.println("File Not Found exception oluştu...");
        } catch (IOException ex) {
            System.err.println("Dosyaya yazılırken bir hata oluştu...");
        }
        finally{
            try {
                fos.close();
            } catch (IOException ex) {
                System.err.println("Dosya kapatılırken bir sorun oluştu!");
            }
        }
    }
    
}
