package ınterface1;
public class BilgisayarMüh implements IMuhendis{
    private boolean askerlik;
    private boolean adli_sicil;

    public BilgisayarMüh(boolean askerlik, boolean adli_sicil) {
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
        System.out.println("Bilgisayar Mühendisi olarak şu şirketlerde çalıştım: ");
        for(String s: array){
            System.out.println(s);
        }
            
    }
    
}
