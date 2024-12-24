package filereaderbufferreaderwriter;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileReaderBufferReaderWriter {

    public static void main(String[] args) {
        /*try(Scanner scanner = new Scanner(new FileReader("ogrenciler.txt"))){
            while(scanner.hasNextLine()){
                //System.err.println("Okunan satır: " + scanner.nextLine());
                
                String ogrenci_bilgisi = scanner.nextLine();
                String[] array = ogrenci_bilgisi.split(",");
                
                if(array[1].equals("Bilgisayar Mühendisliği")){
                    System.err.println("Öğrenci bilgisi: " + ogrenci_bilgisi);
                }
            }
            
        } catch (FileNotFoundException ex) {
            System.err.println("Dosya bulunamadı!!");
        } catch (IOException ex) {
            System.err.println("Dosya açılırken bir hata oluştu.....");
        }*/
        /*try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("ogrenciler.txt")))){
            while(scanner.hasNextLine()){
                //System.err.println("Okunan satır: " + scanner.nextLine());
                
                String ogrenci_bilgisi = scanner.nextLine();
                String[] array = ogrenci_bilgisi.split(",");
                
                if(array[1].equals("Bilgisayar Mühendisliği")){
                    System.err.println("Öğrenci bilgisi: " + ogrenci_bilgisi);
                }
            }
            
        } catch (FileNotFoundException ex) {
            System.err.println("Dosya bulunamadı!!");
        } catch (IOException ex) {
            System.err.println("Dosya açılırken bir hata oluştu.....");
        }*/
        
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("ogrenciler.txt",true))){
            writer.write("Ali Ozan,İnşaat Mühendisliği\n");
        } catch (IOException ex) {
            System.err.println("Dosya açılırken hata oluştu!");
        }
    }
    
    
}
