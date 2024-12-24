package serialization3;

import java.io.Serializable;

public class Ogrenci implements Serializable{
    private String isim;
    private int id;//transient özelliği ile serileştirme iptali yapılabilir almadığı için 0 giriyor oto veya null.
    private String bolum;
    private static int ogrenci_sayisi;

    public static int getOgrenci_sayisi() {
        return ogrenci_sayisi;
    }

    public static void setOgrenci_sayisi(int ogrenci_sayisi) {
        Ogrenci.ogrenci_sayisi = ogrenci_sayisi;
    }
    
    

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
