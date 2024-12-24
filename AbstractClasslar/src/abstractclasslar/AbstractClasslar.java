package abstractclasslar;
public class AbstractClasslar {
    public static void main(String[] args) {
        Kare kare1 = new Kare("Kare1", 4);
        Daire daire1 = new Daire("Daire1", 2);
        Şekil sekil;
        sekil = new Kare("kare2", 7);
        sekil.alan_hesapla();
        //sekil.cevre_hesapla; Abstract içinde yok sadece kare classı içinde var.
        
        kare1.alan_hesapla();
        kare1.cevre_hesapla();
        daire1.alan_hesapla();
    }
}