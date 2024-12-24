package serilizationilehafızaoyunu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OyunKayıt {
    public static void oyunKaydet(Kart[][] kartlar) {
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("kayıt.bin"))){
            System.err.println("Oyun kaydediliyor....");
            out.writeObject(kartlar);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OyunKayıt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(OyunKayıt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static Kart[][] kayıttanAl(){
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("kayıt.bin"))){
            System.err.println("Oyun yükleniyor....");
            
            Kart[][] cikti = (Kart[][])in.readObject();
            
            return cikti;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OyunKayıt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(OyunKayıt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OyunKayıt.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
