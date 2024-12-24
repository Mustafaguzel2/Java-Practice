package threading;

import java.util.logging.Level;
import java.util.logging.Logger;


class Islemler implements Runnable{
    
    String name ;

    public Islemler(String name) {
        this.name = name;
        System.out.println(name + " işlem oluşturuldu!");
    }
    
    @Override
    public void run() {
            try {
                for(int i = 5; i > 0; i--) {
                    System.out.println(this.name + " : " + i);
                    Thread.sleep(1000);
                }
            }
            catch (Exception e) {
                System.out.println("HATA VAR.");
            }
            System.out.println(name + " işlem tamamlandır.");
        }
    
    
}
