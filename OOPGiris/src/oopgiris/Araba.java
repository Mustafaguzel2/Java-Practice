package oopgiris;
public class Araba {
    
    private String renk; //Arabanın rengi
    private int kapılar; //Arabanın kaç kapısı var
    private int tekerlekler; //Arabanın kaç tekerleği var
    private String motor; //Arabanın motorunun modeli
    private String model; //Arabanın modeli
    

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getKapılar() {
        return kapılar;
    }

    public void setKapılar(int kapılar) {
        if(kapılar < 0) {
            System.out.println("Kapıların sayısı 0 `dan küçük olamaz!");
        }
        else {
            this.kapılar = kapılar;
        }

    }

    public int getTekerlekler() {
        return tekerlekler;
    }

    public void setTekerlekler(int tekerlekler) {
        this.tekerlekler = tekerlekler;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
        //isimler aynı ve biz bu objeye erişmek istediğimiz için this kullanıyoruz
    }
    
      
}
