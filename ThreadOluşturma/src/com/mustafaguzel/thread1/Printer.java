package com.mustafaguzel.thread1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Printer extends Thread{
    private String isim;

    public Printer(String isim) {
        this.isim = isim;
    }

    @Override
    public void run() {
        System.err.println(isim + "Çalışıyor...");
        for(int i = 1; i <= 10; i++){
            try {
                System.err.println(isim + " Yazıyor: " + i);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.err.println("Thread kesintiye uğradı");
            }
        }
        System.err.println("İşini bitirdi");
    }
    
}
