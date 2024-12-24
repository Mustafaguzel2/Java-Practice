
package pkg1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Ana metot
    public static void main(String[] args) {
        DoublyLinkedList inventory = new DoublyLinkedList();

        // Dosyadan veri okuma ve listeye ekleme
        try {
            File file = new File("bilgiler.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");

                int year = Integer.parseInt(parts[0]);
                String title = parts[1];
                String genre = parts[2];
                String director = parts[3];
                String actorsString = parts[4];

                // Actors parsing
                ArrayList<Actor> actors = new ArrayList<>();
                String[] actorParts = actorsString.substring(1, actorsString.length() - 1).split("\\)");

                for (String actorPart : actorParts) {
                    String[] actorInfo = actorPart.trim().split(",");

                    String name = actorInfo[0].substring(1);
                    String gender = actorInfo[1].trim();
                    String nationality = actorInfo[2].substring(1);

                    actors.add(new Actor(name, gender, nationality));
                }

                Movie movie = new Movie(year, title, genre, director, actors);
                inventory.addMovie(movie);
            }

            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Kullanıcıya seçenekleri sunma
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        while (choice != 6) {
            System.out.println("\n--- İşlem Seçin ---");
            System.out.println("1. Film Ekle");
            System.out.println("2. Film Sil");
            System.out.println("3. Tüm Filmleri Baştan Yazdır");
            System.out.println("4. Tüm Filmleri Sondan Yazdır");
            System.out.println("5. 2000 Yılından Önceki Filmleri Yazdır");
            System.out.println("6. Çıkış");
            System.out.print("Seçiminiz: ");
            choice = scanner.nextInt();

            scanner.nextLine(); // Boş satırı oku

            switch (choice) {
                case 1:
                    System.out.print("Film Yapım Yılı: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Film Adı: ");
                    String title = scanner.nextLine();

                    System.out.print("Film Türü: ");
                    String genre = scanner.nextLine();

                    System.out.print("Yönetmen Adı: ");
                    String director = scanner.nextLine();

                    System.out.print("Oyuncular (Virgülle Ayırarak): ");
                    String actorsString = scanner.nextLine();

                    ArrayList<Actor> actors = new ArrayList<>();
                    String[] actorParts = actorsString.split(",");

                    for (String actorPart : actorParts) {
                        String[] actorInfo = actorPart.trim().split(";");

                        String name = actorInfo[0].trim();
                        String gender = actorInfo[1].trim();
                        String nationality = actorInfo[2].trim();

                        actors.add(new Actor(name, gender, nationality));
                    }

                    Movie movie = new Movie(year, title, genre, director, actors);
                    inventory.addMovie(movie);
                    break;

                case 2:
                    System.out.print("Silmek istediğiniz film adını girin: ");
                    String movieName = scanner.nextLine();
                    inventory.deleteMovie(movieName);
                    break;

                case 3:
                    inventory.printFromHead();
                    break;

                case 4:
                    inventory.printFromTail();
                    break;

                case 5:
                    System.out.print("Yıl girin: ");
                    int printYear = scanner.nextInt();
                    scanner.nextLine();
                    inventory.printMoviesBeforeYear(printYear);
                    break;

                case 6:
                    inventory.saveToFile("inventory.txt");
                    break;

                default:
                    System.out.println("Geçersiz seçim. Tekrar deneyin.");
                    break;
            }
        }

        scanner.close();
    }
}
