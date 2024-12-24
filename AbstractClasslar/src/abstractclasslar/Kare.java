package abstractclasslar;
public class Kare extends Şekil{
    private int kenar;

    public Kare(String isim,int kenar) {
        super(isim);
        this.kenar = kenar;
    }

    @Override
    void alan_hesapla() {
        System.out.println(getIsim() + " alanı: " + (kenar*kenar) + " dır.");
    }
    public void cevre_hesapla() {
        System.out.println(getIsim() + " çevresi " + (kenar*4));
    }
}
