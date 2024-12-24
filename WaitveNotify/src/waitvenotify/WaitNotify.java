package waitvenotify;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WaitNotify {
    private Object lock = new Object();
    public void thread1Fonksiyonu(){
        synchronized (lock) {
            System.err.println("Thread 1 çalışıyor.....");
            System.err.println("Thread 1 Thread 2'nin kendisini uyandırmasını bekliyor...");
            try {
                lock.wait();//Lock teslimi yapar ve buradaki işlem durur.
            } catch (InterruptedException ex) {
                Logger.getLogger(WaitNotify.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.err.println("Thread 1 uyandı. Çalışmaya devam ediyor...");
        }
    }
    
    public void thread2Fonksiyonu(){
        Scanner scanner = new Scanner(System.in);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(WaitNotify.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        synchronized (lock) {
            System.err.println("Thread 2 çalışıyor....");
            System.err.println("Devam etmek için bir tuşa basın....");
            scanner.nextLine();
            lock.notify();//Bu işlem bitti waitten devam et demek
            System.err.println("Uyan abi, geldik geldik!");
            //notify'dan sonraki işlemide yapıp wait altından devam eder
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(WaitNotify.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
