package proje;

import java.util.ArrayList;
import java.util.Objects;

public class Film {
    private int yapımYılı;
    private String ismi;
    private String türü;
    private String yönetmenAdSoyad;
    private ArrayList<Aktör> oyuncular;

    public Film(int yapımYılı, String ismi, String türü, String yönetmenAdSoyad, ArrayList<Aktör> oyuncular) {
        this.yapımYılı = yapımYılı;
        this.ismi = ismi;
        this.türü = türü;
        this.yönetmenAdSoyad = yönetmenAdSoyad;
        this.oyuncular = oyuncular;
    }

    public Film() {
        this.yapımYılı = 0;
        this.ismi = null;
        this.türü = null;
        this.yönetmenAdSoyad = null;
        this.oyuncular = null;
    }
    public Film(Film film) {
        this.ismi = film.ismi;
        this.türü = film.türü;
        this.yapımYılı = film.yapımYılı;
        this.yönetmenAdSoyad = film.yönetmenAdSoyad;
        this.oyuncular = new ArrayList<Aktör>(film.oyuncular); 
    }
    
    

    public int getYapımYılı() {
        return yapımYılı;
    }

    public void setYapımYılı(int yapımYılı) {
        this.yapımYılı = yapımYılı;
    }

    public String getIsmi() {
        return ismi;
    }

    public void setIsmi(String ismi) {
        this.ismi = ismi;
    }

    public String getTürü() {
        return türü;
    }

    public void setTürü(String türü) {
        this.türü = türü;
    }

    public String getYönetmenAdSoyad() {
        return yönetmenAdSoyad;
    }

    public void setYönetmenAdSoyad(String yönetmenAdSoyad) {
        this.yönetmenAdSoyad = yönetmenAdSoyad;
    }
    
    @Override
    public String toString() {
        return "Filmin adı: " + ismi + 
               "Yapım yılı: " + yapımYılı +
               "Türü: " + türü +
               "Yönetmeni: " + yönetmenAdSoyad +
               "Oyuncular: " + oyuncular;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.yapımYılı;
        hash = 61 * hash + Objects.hashCode(this.ismi);
        hash = 61 * hash + Objects.hashCode(this.türü);
        hash = 61 * hash + Objects.hashCode(this.yönetmenAdSoyad);
        hash = 61 * hash + Objects.hashCode(this.oyuncular);
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
        final Film other = (Film) obj;
        if (this.yapımYılı != other.yapımYılı) {
            return false;
        }
        if (!Objects.equals(this.ismi, other.ismi)) {
            return false;
        }
        if (!Objects.equals(this.türü, other.türü)) {
            return false;
        }
        if (!Objects.equals(this.yönetmenAdSoyad, other.yönetmenAdSoyad)) {
            return false;
        }
        return Objects.equals(this.oyuncular, other.oyuncular);
    }
    
}
    
