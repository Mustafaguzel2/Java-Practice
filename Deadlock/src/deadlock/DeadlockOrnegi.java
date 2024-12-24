package deadlock;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockOrnegi {
    private Hesap hesap1 = new Hesap();
    private Hesap hesap2 = new Hesap();
    private Random random = new Random();
    
    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();
    
    public void locklarıKontrolEt(Lock a, Lock b){
        boolean a_elde_edildi = false;
        boolean b_elde_edildi = false;
        
        while(true){
            a_elde_edildi = a.tryLock();
            b_elde_edildi = b.tryLock();
            
            if(a_elde_edildi == true && b_elde_edildi == true){
                return;//break te denebilir
            }
            else if (a_elde_edildi == true && b_elde_edildi == false) {
                a.unlock();
            }
            else if(b_elde_edildi == true && a_elde_edildi == false){
                b.unlock();
            }
        }
    }
    
    public void thread1Fonksiyonu(){
        /*lock1.lock();//Düzgün sırayla yazılmazsa deadlock oluşabilir
        lock2.lock();*/
        locklarıKontrolEt(lock1, lock2);
        for(int i = 0; i < 5000; i++){
            Hesap.paraTransferi(hesap1, hesap2, random.nextInt(100));
        }
        lock1.unlock();
        lock2.unlock();
    }
    public void thread2Fonksiyonu(){
        /*lock1.lock();
        lock2.lock();*/
        locklarıKontrolEt(lock1, lock2);
        for(int i = 0; i < 5000; i++){
            Hesap.paraTransferi(hesap2, hesap1, random.nextInt(100));
        }
        lock1.unlock();
        lock2.unlock();
    }
    public void threadOver(){
        System.err.println("Hesap1'in bakiyesi: " + hesap1.getBakiye());
        System.err.println("Hesap2'nin bakiyesi: " + hesap2.getBakiye());
        System.err.println("Toplam bakiye: " + (hesap1.getBakiye() + hesap2.getBakiye()));
    }
}
