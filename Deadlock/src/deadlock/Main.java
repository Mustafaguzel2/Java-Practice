package deadlock;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        DeadlockOrnegi deadlockOrnegi = new DeadlockOrnegi();
        
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                deadlockOrnegi.thread1Fonksiyonu();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                deadlockOrnegi.thread2Fonksiyonu();
            }
        });
        
        thread1.start();
        thread2.start();
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        deadlockOrnegi.threadOver();
    }
    
}
