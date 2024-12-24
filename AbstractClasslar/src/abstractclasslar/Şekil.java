package abstractclasslar;
public abstract class Şekil {
    
    private String isim;

    public Şekil(String isim) {
        this.isim = isim;
    }
    public void ismini_söyle() {
        System.out.println("Bu cismin ismi: " + isim);
    }
    
    abstract void alan_hesapla();

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
}
