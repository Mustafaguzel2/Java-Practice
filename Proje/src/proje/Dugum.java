package proje;
class Dugum {
    public Film film;
    public Dugum onceki;
    public Dugum sonraki;

    public Dugum(Film film) {
        this.film = film;
        this.onceki = null;
        this.sonraki = null;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Dugum getOnceki() {
        return onceki;
    }

    public void setOnceki(Dugum onceki) {
        this.onceki = onceki;
    }

    public Dugum getSonraki() {
        return sonraki;
    }

    public void setSonraki(Dugum sonraki) {
        this.sonraki = sonraki;
    }
    
}    
    