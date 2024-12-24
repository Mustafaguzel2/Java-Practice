/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1;

import java.util.ArrayList;

/**
 *
 * @author mustafayigitguzel
 */
public class Movie {

    private int year;
    private String title;
    private String genre;
    private String director;
    private ArrayList<Actor> actors;

    public Movie(int year, String title, String genre, String director, ArrayList<Actor> actors) {
        this.year = year;
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.actors = actors;
    }

    // Getter ve Setter metotları

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }

    // Diğer metotlar

    @Override
    public String toString() {
        return "Movie{" +
                "year=" + year +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", director='" + director + '\'' +
                ", actors=" + actors +
                '}';
    }
}

