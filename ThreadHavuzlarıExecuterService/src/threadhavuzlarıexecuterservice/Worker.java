package threadhavuzlarıexecuterservice;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Worker  implements Runnable{
    private int taskId;
    private String isim;

    public Worker(int taskId, String isim) {
        this.taskId = taskId;
        this.isim = isim;
    }
    
    
    
    @Override
    public void run() {
        try {
            System.err.println("Worker " + isim + " " + taskId + ". işe başladı...");
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.err.println("Worker " + isim + " " + taskId + ". işi bitirdi!");
    }
    
}
