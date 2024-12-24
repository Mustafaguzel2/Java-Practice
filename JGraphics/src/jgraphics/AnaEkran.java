package jgraphics;

import javax.swing.JFrame;

public class AnaEkran extends JFrame{

    public AnaEkran(String grafik_Kullanımı) {
    }
    public static void main(String[] args) {
        GrafikKullanımı grafik = new GrafikKullanımı();
        AnaEkran ekran = new AnaEkran("Grafik Kullanımı");
        
        ekran.setVisible(true);
        ekran.setResizable(true);
        ekran.setSize(800,600);
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ekran.add(grafik);
    }
}
