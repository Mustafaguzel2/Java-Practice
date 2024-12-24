package ınterface1;
public class MakineMüh implements IMuhendis, IÇalışma{
    private boolean askerlik;
    private boolean adli_sicil;

    public MakineMüh(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }

    
    @Override
    public void askerlik_durumu_sorgula() {
        if(askerlik) {
            System.out.println("Askerliğimi yaptım.");
        }
        else {
            System.out.println("Askerliğimi henüz yapmadım.");
        }
    }

    @Override
    public String mezuniyet_ortalaması(double derece) {
        return "Ortalamam: " + derece;
    }

    @Override
    public void adli_sicil_sorgula() {
        if(adli_sicil) {
            System.out.println("Adli sicil kaydım bulunuyor.");
        }
        else {
            System.out.println("Herhangi bir adli sicil kaydım bulunmuyor.");
        }
    }

    @Override
    public void is_tecrübesi(String[] array) {
        if(array.length == 0) {
            System.out.println("İş tecrübem yok.");
        }
        else {
            System.out.println("Makina Mühendisi olarak şu şirketlerde çalıştım: ");
            for(int i = 0; i < array.length; i++) {
                System.out.println(i);
            }
        }
    }
    public void referans_getir(String[] array) {
        if(array.length == 0) {
            System.out.println("Herhangi bir referansım bulunmuyor.");
        }
        else {
            System.out.println("Referanslarım şunlardır: ");
            for(String s: array) {
                System.out.println(s);
            }
        }
    }

    @Override
    public void çalış() {
        System.out.println("Makine Mühendisi çalışıyor...");
    }
    
}
