
package ınterface1;
public class Interface1 {
    public static void main(String[] args) {
        //IMuhendis müh1 = new BilgisayarMüh(true, true);
        //yukarıdaki gibi de nesne oluşturulabilir. Ancak direkt interface ile nesne oluşturulamaz.
        BilgisayarMüh müh1 = new BilgisayarMüh(false, false);
        
        müh1.askerlik_durumu_sorgula();
        müh1.adli_sicil_sorgula();
        System.out.println(müh1.mezuniyet_ortalaması(3.07));
        String[] tecrübe = {"Vestel", "Türksat", "Havelsan"};
        müh1.is_tecrübesi(tecrübe);
        System.out.println("_____________________________________");
        
        //IMuhendis muh2 = new MakineMüh(true, true);
        //Burada Imüh içinde olmayan yeni metodlar kullandığımız için nesne üretirken hata veriyor.
        MakineMüh müh2 = new MakineMüh(true, false);
        
        String[] tecrube2 = {};
        String[] referans = {"Mustafa Murat Coşkun", "Serhat Say"};
        müh2.adli_sicil_sorgula();
        müh2.askerlik_durumu_sorgula();
        System.out.println(müh2.mezuniyet_ortalaması(2.31));
        müh2.is_tecrübesi(tecrube2);
        müh2.referans_getir(referans);
        müh2.çalış();
    }
    }