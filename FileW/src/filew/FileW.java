package filew;

import java.io.FileWriter;
import java.io.IOException;


public class FileW {

    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("dosya.txt",true);
            //writer.write("Mustafa Güzel \n");
            //writer.write("Mükemmel bir programcısın\n");
            writer.write("İşte böyle dosyanın içindekileri silmeden yazarsın be");
        } catch (IOException ex) {
            System.err.println("Dosya açılırken bir hata oluştu!");
        }
        finally{
            if(writer != null){
                try {
                    writer.close();
                } catch (IOException ex) {
                    System.err.println("Dosya kapatılırken bir hata oluştu!");
                }
            }
        }
    }
    
}
