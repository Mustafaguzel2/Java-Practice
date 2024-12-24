package encapsulation;
public class Test {
    public static void main(String[] args) {
    /*
    Abone abone = new Abone();
    
    abone.isim = "Mustafa Yiğit Güzel";
    abone.bakiye = 200;
    abone.sehir = "Ankara";
    
    abone.dogalgaz_kullan(200);
    */
    
    gelişmişAbone abone = new gelişmişAbone("Mustafa", "İstanbul", 200);
    abone.bakiye_ogren();
    }
}
