package threadınterrupt;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        //Interrupt threadi durdurmadı sadece anlık catche girdi ve çıktı
        List<Integer> list = new LinkedList<Integer>();
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.err.println("Thread çalışıyor...");
                for(int i = 0; i < 10000000; i++){
                    if(Thread.currentThread().isInterrupted()){
                        System.err.println("Kesintiye uğradık....");
                        return;
                    }
                    list.add(i);
                    
                }
                
                System.err.println("Sistem kesintiye uğramadı.");
                
                /*for(int i = 1; i < 10; i++){
                    System.err.println("Thread yazıyor: " + i);
                    
                    try {
                        Thread.sleep(1000);
                        System.err.println("Uykumun " + i + ". saniyesindeyim...");
                    } catch (InterruptedException ex) {
                        System.err.println("Uykum bölündü!");
                    }
                }*/
                
            }
        });
        t.start();
        
        try {
            Thread.sleep(1000);//for döngüsünün süresinden daha azsa keser değilse thread biter etkilemez
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        t.interrupt();
    }
    
}
