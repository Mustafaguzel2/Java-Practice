package car;

/**
 * @author Özgün Yılmaz
 * Created on 07.Eki.2013, 14:26:48
 */
public class Car {
    
    private String marka,model,vites;
    private boolean klima;

    public Car(String marka, String model, String vites, boolean klima) {
        this.marka = marka;
        this.model = model;
        this.vites = vites;
        this.klima = klima;
    }

    public Car(String marka, String model) {
        this.marka = marka;
        this.model = model;
        this.vites = "manuel";
        this.klima = false;
    }

    public boolean isKlima() {
        return klima;
    }

    public void setKlima(boolean klima) {
        this.klima = klima;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVites() {
        return vites;
    }

    public void setVites(String vites) {
        this.vites = vites;
    }
    
    @Override
    public String toString() {
        return "Car{" + "marka=" + marka + ", model=" + model + ", vites=" + vites + ", klima=" + klima + '}';
    }

    
    public static void main(String args[]) {
        Car c1=new Car ("abc","xyz");
        System.out.println(c1.toString());
        Car c2=new Car ("abc","xyz","otomatik",true);
        System.out.println(c2.toString());
    }
    
}
