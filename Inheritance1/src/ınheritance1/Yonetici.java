package ınheritance1;
public class Yonetici extends Calisan { // Subclass
    
    private int sorumlu_kisi; // Ekstra özellik
    
    public Yonetici(String isim, int maas, String departman,int sorumlu_kisi) {
      /*this.isim = isim;
        this.maas = maas;
        this.departman = departman;*/
      super(isim, maas, departman); // Super classtan direkt alıp kullanmamızı sağlıyor. (super önemli!)
      
      this.sorumlu_kisi = sorumlu_kisi;
    }
    
    public void zam_yap(int zam_miktarı) {
        System.out.println("Çalışanlara " + zam_miktarı + " Tl zam yapıldı.");
    }
    
    public void bilgileriGoster() {
        /*System.out.println("İsim: " + getIsim());
        System.out.println("Maaş: " + getMaas());
        System.out.println("Departman: " + getDepartman());*/
        super.bilgileriGoster();
        
        System.out.println("Sorumlu olduğu kişi sayısı: " + sorumlu_kisi);
    }
    
}
