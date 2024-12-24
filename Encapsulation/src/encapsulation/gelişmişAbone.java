package encapsulation;
public class gelişmişAbone {
    
    private String isim;
    private int bakiye = 120; //bütün objelerin ilk bakiye değeri 120
    private String sehir;

    public gelişmişAbone(String isim, String sehir, int bakiye) {
        this.isim = isim;
        this.sehir = sehir;
        if(bakiye >= 0 && bakiye <= 120) {
            this.bakiye = bakiye;
        }
    }
    
    public void bakiye_ogren() {
        System.out.println("Bakiye = " + bakiye);
    }
    
}
