package serialization;

import java.io.Serializable;

public class Ogrenci implements Serializable{
    private String isim;
    private int id;
    private String bolum;
    

    public Ogrenci(String isim, int id, String bolum) {
        this.isim = isim;
        this.id = id;
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        String bilgiler = "Öğrenci ismi: " + isim +
                          "\nÖğrenci numarası: " + id +
                          "\nÖğrencinin bölümü: " + bolum;
        return bilgiler;
    }
    
}
