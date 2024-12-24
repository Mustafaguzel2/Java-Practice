package semaphorekullanımı;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SemaphoreOrnegi {
    private Semaphore sem = new Semaphore(3);//permits aynı anda kaç thread demek
    
    public void threadFonksiyonu(int id){
        try {
            sem.acquire();//değişken değeri 0 olana kadar threadler içeri girer kodu işler değişken değerini permitsten alır.
            
            System.err.println("Thread başlıyor... ID: " + id);
            
        } catch (InterruptedException ex) {
            Logger.getLogger(SemaphoreOrnegi.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SemaphoreOrnegi.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.err.println("Thread çıkıyor.... ID: " + id);
        
        sem.release();//
    }
}
