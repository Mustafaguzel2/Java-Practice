package callablevefuture;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        
        /*executorService.submit(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                System.err.println("Thread çalışıyor...");
                
                int sure = random.nextInt(1000)+2000;
                
                try {
                    Thread.sleep(sure);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.err.println("Threadden çıkılıyor...");
            }
        });
        
        executorService.shutdown();
        try {
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        Future<?> future = executorService.submit(new Callable<Integer>(){
            //callable ile return alabileceğimiz methodlar yazılır ve bunları future ile yazdırabiliriz
            //soru işareti yerine atanan tür gelecek
            @Override
            public Integer call() throws Exception {
                Random random = new Random();
                System.err.println("Thread çalışıyor...");
                
                int sure = random.nextInt(1000)+2000;
                
                /*if(sure > 2500){
                    throw new IOException("Thread çok uzun bir süre uyudu...");
                }*/
                
                try {
                    Thread.sleep(sure);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.err.println("Threadden çıkılıyor...");
                
                return sure;
            }
        
        });
        executorService.shutdown();
        
        try {
                executorService.awaitTermination(1, TimeUnit.DAYS);
            System.err.println("Dönen değer: " + future.get());
            //Task bittiğinde değer geliyor bitene kadar takılı durur
        } catch (InterruptedException ex) {
            System.err.println("Bir hata oluştu");//nadir hatalar buraya girer
        } catch (ExecutionException ex) {
            //ex.printStackTrace();//if bloğu içindeki throws buraya gelir
            System.err.println(ex);
        }
    }
    
}
