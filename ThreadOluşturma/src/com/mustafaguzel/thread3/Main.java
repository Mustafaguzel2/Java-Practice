package com.mustafaguzel.thread3;

import com.mustafaguzel.thread1.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Thread printer1 = new Thread(new Runnable(){
            @Override
            public void run() {
                System.err.println("Thread çalışıyor");
                for(int i = 1; i <= 10; i++){
                    try {
                        System.err.println("Yazıyor: " + i);
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        System.err.println("Hata oluştu");
                    }
                }
            }
        });
        printer1.start();
        System.err.println("Main thread çalışıyor...");
    }
    
}

