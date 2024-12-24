package sınav.pkg1;

import java.util.Objects;

public class Person {
    private String isimSoyİsim;
    private ContactInfo iletişimBilgileri;

    public Person() {
        this.isimSoyİsim = null;
        this.iletişimBilgileri = null;
    }
    
    public Person(Person person) {
        this.isimSoyİsim = person.isimSoyİsim;
        this.iletişimBilgileri = new ContactInfo(person.iletişimBilgileri);
    }
    public Person(String isimSoyİsim, ContactInfo iletişimBilgileri) {
        this.isimSoyİsim = isimSoyİsim;
        this.iletişimBilgileri = iletişimBilgileri;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.isimSoyİsim);
        hash = 13 * hash + Objects.hashCode(this.iletişimBilgileri);
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
        final sınav.pkg1.Person other = (sınav.pkg1.Person) obj;
        if (!Objects.equals(this.isimSoyİsim, other.isimSoyİsim)) {
            return false;
        }
        return Objects.equals(this.iletişimBilgileri, other.iletişimBilgileri);
    }
    

    public String getIsimSoyİsim() {
        return isimSoyİsim;
    }

    public void setIsimSoyİsim(String isimSoyİsim) {
        this.isimSoyİsim = isimSoyİsim;
    }

    public ContactInfo getIletişimBilgileri() {
        return iletişimBilgileri;
    }

    public void setIletişimBilgileri(ContactInfo iletişimBilgileri) {
        this.iletişimBilgileri = iletişimBilgileri;
    }

    @Override
    public String toString() {
        return "İsmi ve Soyismi = " + isimSoyİsim + ", İletişim Bilgileri = " + iletişimBilgileri;
    }
    
    
}
