package threadhavuzlarıexecuterservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        /*Thread t1 = new Thread(new Worker(1, "1"));
        Thread t2 = new Thread(new Worker(2, "2"));
        Thread t3 = new Thread(new Worker(3, "3"));
        Thread t4 = new Thread(new Worker(4, "4"));
        Thread t5 = new Thread(new Worker(5, "5"));
        System.err.println("Bütün işler teslim edildi");
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        t3.start();
        t4.start();
        try {
            t3.join();
            t4.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        t5.start();
        try {
            t5.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        
        for(int i = 1; i <= 5; i++){
            executorService.submit(new Worker(i,String.valueOf(i)));
        }
        
        executorService.shutdown();
        System.err.println("Bütün işler teslim edildi.");
        
        try {
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Eğer threadler timeout kadar timeunit ten fazla sürerse otomatik olarak kapıyor.
        System.err.println("Bütün işler bitti.");
    }
    
}
