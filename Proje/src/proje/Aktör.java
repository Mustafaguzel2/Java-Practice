package proje;

import java.util.Objects;

public class Aktör {
    private String aktorAdSoyad;
    private String cinsiyet;
    private int yas;
    private String milliyet;
    
    
    public Aktör() {
        this.aktorAdSoyad = null;
        this.cinsiyet = null;
        this.yas = 0;
        this.milliyet = null;
    }

    public Aktör(String aktörAdSoyad, String cinsiyet, int yaş, String milliyet) {
        this.aktorAdSoyad = aktörAdSoyad;
        this.cinsiyet = cinsiyet;
        this.yas = yaş;
        this.milliyet = milliyet;
    }
    public Aktör(Aktör aktör) {
        this.aktorAdSoyad = aktör.aktorAdSoyad;
        this.cinsiyet = aktör.cinsiyet;
        this.yas = aktör.yas;
        this.milliyet = aktör.milliyet;
    }

    public String getAktorAdSoyad() {
        return aktorAdSoyad;
    }

    public void setAktorAdSoyad(String aktörAdSoyad) {
        this.aktorAdSoyad = aktörAdSoyad;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
    

    public String getMilliyet() {
        return milliyet;
    }

    public void setMilliyet(String milliyet) {
        this.milliyet = milliyet;
    }

    @Override
    public String toString() {
        return "Aktör: " + aktorAdSoyad + 
                "Cinsiyeti: " + cinsiyet + 
                "Yaşı: " + yas + 
                "Milliyeti: " + milliyet;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.aktorAdSoyad);
        hash = 97 * hash + Objects.hashCode(this.cinsiyet);
        hash = 97 * hash + Objects.hashCode(this.yas);
        hash = 97 * hash + Objects.hashCode(this.milliyet);
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
        final Aktör other = (Aktör) obj;
        if (this.yas != other.yas) {
            return false;
        }
        if (!Objects.equals(this.aktorAdSoyad, other.aktorAdSoyad)) {
            return false;
        }
        if (!Objects.equals(this.cinsiyet, other.cinsiyet)) {
            return false;
        }
        return Objects.equals(this.milliyet, other.milliyet);
    }
    
      
}
