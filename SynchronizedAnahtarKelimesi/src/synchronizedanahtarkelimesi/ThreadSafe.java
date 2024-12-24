package synchronizedanahtarkelimesi;

import java.util.logging.Level;
import java.util.logging.Logger;


public class ThreadSafe {
    public synchronized void artir(){//bu sayede bir thread bir işlem yaparken 
                                    //diğer threadler sırada bekler işleme karışmaz
        count++;
    }
    private int count = 0;
    
    public void threadleriCalistir(){
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 5000; i++){
                    artir();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 5000; i++){
                    artir();
                }
            }
        });
        
        thread1.start();
        thread2.start();
        
        try {
            thread1.join();//join sayesinde main thread bu threadlerin bitmesini bekler.
            thread2.join();
        } catch (InterruptedException ex) {
            System.err.println("Hata oluştu");
        }
        
        
        System.err.println("Count değişkeninin değeri: " + count);
    }
    
    public static void main(String[] args) {
        ThreadSafe threadSafe = new ThreadSafe();
        
        threadSafe.threadleriCalistir();
    }
}
