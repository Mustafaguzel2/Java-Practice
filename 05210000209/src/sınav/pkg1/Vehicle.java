package sınav.pkg1;

import java.util.Objects;

public abstract class Vehicle {
    private String araç_marka;
    private String araç_plaka;
    private Person sahibi;

    public Vehicle() {
        this.araç_marka = null;
        this.araç_plaka = null;
        this.sahibi = null;
    }
    
    public Vehicle(Vehicle vehicle) {
        this.araç_marka = vehicle.araç_marka;
        this.araç_plaka = vehicle.araç_plaka;
        this.sahibi = new Person(vehicle.sahibi); 
    }
    public Vehicle(String araç_marka, String araç_plaka, Person sahibi) {
        this.araç_marka = araç_marka;
        this.araç_plaka = araç_plaka;
        this.sahibi = sahibi;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.araç_marka);
        hash = 41 * hash + Objects.hashCode(this.araç_plaka);
        hash = 41 * hash + Objects.hashCode(this.sahibi);
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
        final sınav.pkg1.Vehicle other = (sınav.pkg1.Vehicle) obj;
        if (!Objects.equals(this.araç_marka, other.araç_marka)) {
            return false;
        }
        if (!Objects.equals(this.araç_plaka, other.araç_plaka)) {
            return false;
        }
        return Objects.equals(this.sahibi, other.sahibi);
    }
    

    public String getAraç_marka() {
        return araç_marka;
    }

    public void setAraç_marka(String araç_marka) {
        this.araç_marka = araç_marka;
    }

    public String getAraç_plaka() {
        return araç_plaka;
    }

    public void setAraç_plaka(String araç_plaka) {
        this.araç_plaka = araç_plaka;
    }

    public Person getSahibi() {
        return sahibi;
    }

    public void setSahibi(Person sahibi) {
        this.sahibi = sahibi;
    }

    @Override
    public String toString() {
        return "Araç markası = " + araç_marka + ", aracın plakası = " + araç_plaka + " sahibi = " + sahibi;
    }
    abstract int taşıt_vergi();
}
