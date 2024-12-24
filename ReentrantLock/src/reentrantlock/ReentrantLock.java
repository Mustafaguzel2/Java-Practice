package reentrantlock;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ReentrantLock {
    private int say = 0;
    private Lock lock = new java.util.concurrent.locks.ReentrantLock();
    private Condition condition = lock.newCondition();//bunun ile şartlı bekletme devam ettirme yapılabilir
    //wait notify ile aynı mantıkta çalışan await signal komutu var Reentrant ile uyumlu
    public void arttir(){
        for(int i = 0; i < 10000; i++){
          say++;  
        }
    }
    public void thread1Fonksiyonu(){
        lock.lock();//synchronized ile aynı
        System.err.println("Thread 1 çalışıyor.....");
        System.err.println("Thread 1 uyandırılmayı bekliyor...");
        try {
            condition.await();
        } catch (InterruptedException ex) {
            Logger.getLogger(ReentrantLock.class.getName()).log(Level.SEVERE, null, ex);
        }
        arttir();
        System.err.println("Thread 1 uyandırıldı ve işlemine devam ediyor...");

        lock.unlock();

    }
    public void thread2Fonksiyonu(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ReentrantLock.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scanner scanner = new Scanner(System.in);
        lock.lock();
        System.err.println("Thread 2 çalışıyor");
        arttir();
        System.err.println("Devam etmek için bir tuşa basın:");
        scanner.nextLine();
        condition.signal();
        System.err.println("Thread1'i uyandırdım. Görüşürüz");
        
        
        lock.unlock();
    }
    
    public void threadOver(){
        System.err.println("Say değişkeninin değeri: " + say);
    }
}
