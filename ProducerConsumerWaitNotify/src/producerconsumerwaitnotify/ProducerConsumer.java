package producerconsumerwaitnotify;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProducerConsumer {
    private Object lock = new Object();
    Random random = new Random();
    Queue<Integer> queue = new LinkedList<Integer>();
    private int limit = 10;
    
    public void produce(){
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
            synchronized (lock) {
                if(queue.size() == limit){
                    try {
                        lock.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                Integer value = random.nextInt(100);
                queue.offer(value);
                System.err.println("Producerın eklediği sayı: " + value);
                lock.notify();
            }
        }
        
    }
    public void consume(){
        while(true){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
            synchronized (lock) {
                if (queue.size() == 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                Integer value = queue.poll();
                System.err.println("Consumerın queue'den çektiği sayı: " + value);
                System.err.println("Queue' daki eleman sayısı: " + queue.size());
                lock.notify();
            
            }
        }
    }
}
