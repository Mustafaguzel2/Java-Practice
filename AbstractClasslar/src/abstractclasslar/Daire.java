package abstractclasslar;
public class Daire extends Şekil{
    private int yarıçap;

    public Daire(String isim, int yarıçap) {
        super(isim);
        this.yarıçap = yarıçap;
    }

    @Override
    void alan_hesapla() {
        System.out.println(getIsim() + " alanı: " + (Math.PI * yarıçap * yarıçap));
    }
    
}
