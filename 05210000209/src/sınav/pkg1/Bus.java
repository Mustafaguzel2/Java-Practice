package sınav.pkg1;
public class Bus extends Vehicle{
    private int yolcu_kapasite;
    private int otobüs_yaş;
    
    public Bus(Bus bus) {
        this.otobüs_yaş = bus.otobüs_yaş;
        this.yolcu_kapasite = bus.yolcu_kapasite;
        
    }
    public Bus() {
        super();
        this.yolcu_kapasite = 0;
        this.otobüs_yaş = 0;
    }

    public Bus(int yolcu_kapasite, int otobüs_yaş, String araç_marka, String araç_plaka, Person sahibi) {
        super(araç_marka, araç_plaka, sahibi);
        this.yolcu_kapasite = yolcu_kapasite;
        this.otobüs_yaş = otobüs_yaş;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.yolcu_kapasite;
        hash = 29 * hash + this.otobüs_yaş;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final sınav.pkg1.Bus other = (sınav.pkg1.Bus) obj;
        if (this.yolcu_kapasite != other.yolcu_kapasite) {
            return false;
        }
        return this.otobüs_yaş == other.otobüs_yaş;
    }
    

    public int getYolcu_kapasite() {
        return yolcu_kapasite;
    }

    public void setYolcu_kapasite(int yolcu_kapasite) {
        this.yolcu_kapasite = yolcu_kapasite;
    }

    public int getOtobüs_yaş() {
        return otobüs_yaş;
    }

    public void setOtobüs_yaş(int otobüs_yaş) {
        this.otobüs_yaş = otobüs_yaş;
    }

    @Override
    public String toString() {
        return "Yolcu kapasite = " + yolcu_kapasite + ", otobüs yaşı = " + otobüs_yaş;
    }

    @Override
    int taşıt_vergi() {
        if(otobüs_yaş < 5) {
            return 4000;
        }
        else if(otobüs_yaş >= 5 && otobüs_yaş <= 10) {
            return 3000;
        }
        else {
            return 2000;
        }
        
    }
    
    
}
