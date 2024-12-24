package sınav.pkg1;
public class ContactInfo {
    private String ev_adresi;
    private String telefon_numarası;
    private String e_posta_adresi;

    public ContactInfo() {
        this.e_posta_adresi = null;
        this.ev_adresi = null;
        this.telefon_numarası = null;
    }
    public ContactInfo(ContactInfo iletişimBilgileri) {
        this.e_posta_adresi = iletişimBilgileri.e_posta_adresi;
        this.telefon_numarası = iletişimBilgileri.telefon_numarası;
        this.ev_adresi = iletişimBilgileri.e_posta_adresi;
    }

    public ContactInfo(String ev_adresi, String telefon_numarası, String e_posta_adresi) {
        this.ev_adresi = ev_adresi;
        this.telefon_numarası = telefon_numarası;
        this.e_posta_adresi = e_posta_adresi;
    }
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        else if (o == null || getClass() != o.getClass()) {
            return false;
        }
        else {
            ContactInfo iletişimBilgileri = (ContactInfo) o;
            return (this.getE_posta_adresi().equals(iletişimBilgileri.getE_posta_adresi())
                    && this.getEv_adresi().equals(iletişimBilgileri.getEv_adresi())
                    && this.getTelefon_numarası().equals(iletişimBilgileri.getTelefon_numarası()));
        }
    }

    public String getEv_adresi() {
        return ev_adresi;
    }

    public void setEv_adresi(String ev_adresi) {
        this.ev_adresi = ev_adresi;
    }

    public String getTelefon_numarası() {
        return telefon_numarası;
    }

    public void setTelefon_numarası(String telefon_numarası) {
        this.telefon_numarası = telefon_numarası;
    }

    public String getE_posta_adresi() {
        return e_posta_adresi;
    }

    public void setE_posta_adresi(String e_posta_adresi) {
        this.e_posta_adresi = e_posta_adresi;
    }

    @Override
    public String toString() {
        return "ContactInfo{" + "Ev adresi = " + ev_adresi + ", Telefon numarası = " + telefon_numarası + ", E_posta adresi = " + e_posta_adresi + '}';
    }
    
    
}
