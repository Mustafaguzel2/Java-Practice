/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1;

/**
 *
 * @author mustafayigitguzel
 */
public class Actor {
    private String name;
    private String gender;
    private String nationality;

    public Actor(String name, String gender, String nationality) {
        this.name = name;
        this.gender = gender;
        this.nationality = nationality;
    }

    // Getter ve Setter metotları

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    // Diğer metotlar

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}

