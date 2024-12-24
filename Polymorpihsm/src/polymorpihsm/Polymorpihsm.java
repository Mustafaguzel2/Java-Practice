package polymorpihsm;

class Hayvan {
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String konus() {
        return "Hayvan konuşuyor...";
    }
}
class Kedi extends Hayvan {
    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " miyavlıyor..."; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}    
 class Kopek extends Hayvan {

    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
    return this.getIsim() + " Havlıyor..."; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
class At extends Hayvan {

    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " Kişniyor..."; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
        


public class Polymorpihsm {
    public static void konustur(Hayvan hayvan) {
        System.out.println(hayvan.konus());
        //Tek fonksiyonda hepsini kullanabilir durumda olduk.
    }
    public static void main(String[] args) {
        /*
        Hayvan hayvan = new Hayvan("LİMON");
        System.out.println(hayvan.konus());
        
        Hayvan hayvan2 = new Kedi("Tekir");
        System.out.println(hayvan2.konus());
        
        Hayvan hayvan3 = new Kopek("Karabaş");
        System.out.println(hayvan3.konus());
        
        konustur(new Kedi("Çıtlık"));
        konustur(new Kopek("Süt"));
        konustur(new At("Şahbatur"));
        */
        Kopek kopek = new Kopek("Karabaş");
        
        // instanceof o sınıftan mı diye kontrol eder.
        if (kopek instanceof Kopek) { //Hayvan ve Kopek sınıfında sayılıyor.
            System.out.println("Bu nesne Kopek sınıfındandır...");
        }

    }
// Bu polymorpihsmdir. Referanslara göre atama yapar. Kalıtımın özelliklerini kullanıyor.
// Eğer override edilmemişse işe yaramaz.
}
