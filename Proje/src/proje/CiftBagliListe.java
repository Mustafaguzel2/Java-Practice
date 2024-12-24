package proje;

import java.io.FileWriter;
import java.io.IOException;

class CiftBagliListe {
    private Dugum bas;
    private Dugum son;

    public CiftBagliListe() {
        this.bas = null;
        this.son = null;
    }

    public boolean bosMu() {
        return bas == null;
    }

    public void ekle(Film film) {
        Dugum yeniDugum = new Dugum(film);

        if (bosMu()) {
            bas = yeniDugum;
            son = yeniDugum;
        } else {
            Dugum mevcut = bas;
            while (mevcut != null && (mevcut.film.getYapımYılı()< film.getYapımYılı()||
                    (mevcut.film.getYapımYılı()== film.getYapımYılı()&& mevcut.film.getIsmi().compareTo(film.getIsmi()) < 0))) {
                mevcut = mevcut.sonraki;
            }

            if (mevcut == null) {
                son.sonraki = yeniDugum;
                yeniDugum.onceki = son;
                son = yeniDugum;
            } else if (mevcut == bas) {
                yeniDugum.sonraki = bas;
                bas.onceki = yeniDugum;
                bas = yeniDugum;
            } else {
                yeniDugum.onceki = mevcut.onceki;
                yeniDugum.sonraki = mevcut;
                mevcut.onceki.sonraki = yeniDugum;
                mevcut.onceki = yeniDugum;
            }
        }
    }

    public Film ara(String filmAdi) {
        Dugum mevcut = bas;
        while (mevcut != null) {
            if (mevcut.film.getIsmi().equalsIgnoreCase(filmAdi)) {
                return mevcut.film;
            }
            mevcut = mevcut.sonraki;
        }
        return null;
    }

    public void sil(String filmAdi) {
        Dugum mevcut = bas;
        while (mevcut != null) {
            if (mevcut.film.getIsmi().equalsIgnoreCase(filmAdi)) {
                if (mevcut == bas && mevcut == son) {
                    bas = null;
                    son = null;
                } else if (mevcut == bas) {
                    bas = bas.sonraki;
                    bas.onceki = null;
                } else if (mevcut == son) {
                    son = son.onceki;
                    son.sonraki = null;
                } else {
                    mevcut.onceki.sonraki = mevcut.sonraki;
                    mevcut.sonraki.onceki = mevcut.onceki;
                }
                break;
            }
            mevcut = mevcut.sonraki;
        }
    }

    public void listeYazdir() {
        System.out.println("Listenin içindeki tüm kayıtlar (head'den başlayarak):");
        Dugum mevcut = bas;
        while (mevcut != null) {
            System.out.println(mevcut.film);
            mevcut = mevcut.sonraki;
        }
    }

    public void listeTersYazdir() {
        System.out.println("Listenin içindeki tüm kayıtlar (tail'den başlayarak):");
        Dugum mevcut = son;
        while (mevcut != null) {
            System.out.println(mevcut.film);
            mevcut = mevcut.onceki;
        }
    }

    public void yilOncesiFilmleriYazdir(int yil) {
        System.out.println(yil + " yılından önce yapılmış tüm film bilgileri:");
        Dugum mevcut = bas;
        while (mevcut != null) {
            if (mevcut.film.getYapımYılı()< yil) {
                System.out.println(mevcut.film);
            }
            mevcut = mevcut.sonraki;
        }
    }
}