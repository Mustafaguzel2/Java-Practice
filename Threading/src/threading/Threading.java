package threading;
public class Threading {
public static void main(String[] args) {
        Islemler i1 = new Islemler("İlk");
        Thread t1 = new Thread(i1);
        
        Islemler i2 = new Islemler("Son");
        Thread t2 = new Thread(i2);
        
        t1.start();
        t2.start();
    }
    
}
