package composition1;
public class Test {
    public static void main(String[] args) {
        
        //has a ilişkisi var yani sahiplik ilişkisi
        
        Resolution resolution = new Resolution(1080, 1920);
        Monitor monitor = new Monitor("VS197DE", "ASUS", "18.5", resolution);
        Kasa kasa = new Kasa("Shadow Blade","Shadow", "Temperli Cam");
        Anakart anakart = new Anakart("B250-PRO", "ASUS", 10, "WİNDOWS 10");
        
        Bilgisayar pc = new Bilgisayar(monitor, kasa, anakart);
        
        pc.getKasa().bilgisayaraı_aç();
        pc.getMonitor().monitoru_kapat();
        pc.getAnakart().isletim_sistemi_yukle("Ubuntu 16.04");
    }
    
}
