package dosyaokuma;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DosyaOkuma {

    public static void main(String[] args) throws IOException {
        File file = new File("Deneme.txt");
        if(!file.exists()) {
            file.createNewFile();
        }
        
        String str = "Selamlar bir şey deniyorum";
        FileWriter fWriter = new FileWriter(file);
        BufferedWriter bWriter = new BufferedWriter(fWriter);
        bWriter.write(str);
        bWriter.write("\nAq niye olmuyo");
        bWriter.close();
    
        FileReader fReader = new FileReader(file);
        String line;
        BufferedReader bReader = new BufferedReader(fReader);
        
        while((line = bReader.readLine()) != null) {
            System.out.println(line);
        }
        bReader.close();
    
    }
    
}
