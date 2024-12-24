package constructor1;
public class Account {
    
    private String hesapNo;
    private double bakiye;
    private String isim;
    private String email;
    private String telefonNo;
    
    public Account(String isim, String email, String telefonNo) {
        /*
        this.isim = isim;
        this.email = email;
        this.telefonNo = telefonNo;
        
        this.bakiye = 0.0;
        this.hesapNo = "Bilgi yok";
        Aynı şey    */ 
        this("Bilgi yok", 0, isim, email, telefonNo);
    }
    
    public Account() {
        /*
        this.hesapNo = "Bilgi yok";
        this.bakiye = 0.0;
        this.isim = "Bilgi yok";
        this.email = "Bilgi yok";
        this.telefonNo = "Bilgi yok";
        */
        //İkisi aynı şey
        this("Bilgi yok", 0, "Bilgi yok", "Bilgi yok", "Bilgi yok");
    }
    
    public Account(String hesapNo, double bakiye, String isim, 
                   String email, String telefonNo) {
        
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.isim = isim;
        this.email = email;
        this.telefonNo = telefonNo;
        
    }
    
    public void bilgileriGöster() {
        System.out.println("Hesap no: " + hesapNo);
        System.out.println("Bakiye = " + bakiye);
        System.out.println("İsim: " + isim);
        System.out.println("Email: " + email);
        System.out.println("Telefon numarası: " + telefonNo);
    }

    public void paraYatır(double miktar) {
        bakiye += miktar;
        System.out.println("Yeni bakiye = " + bakiye);
    }
    public void paraCekme(double miktar) {
        if (miktar > 1500) {
            System.out.println("Bir günde 1500Tl den fazla para çekemezsiniz.");
        }
        else if (bakiye - miktar < 0) {
            System.out.println("Bakiyeniz yeterli değil. Şu anki bakiye = " + bakiye);
        }
        else {
            bakiye-= miktar;
            System.out.println("Yeni bakiye = " + bakiye);
        }
    }
    
    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
    
    
}
