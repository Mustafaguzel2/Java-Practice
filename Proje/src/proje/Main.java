package proje;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Ana metot
    public static void main(String[] args) {
        CiftBagliListe filmEnvanteri = new CiftBagliListe();
        Scanner scanner = new Scanner(System.in);

        // Dosyadan verileri okuma ve çift bağlı listeye ekleme
        try {
            File file = new File("bilgiler.txt");
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String satir = fileScanner.nextLine();
                String[] veriler = satir.split(", ");

                int yapimYili = Integer.parseInt(veriler[0]);
                String filmAdi = veriler[1];
                String filmTuru = veriler[2];
                String yonetmen = veriler[3];

                ArrayList<Aktör> oyuncular = new ArrayList<>();
                String oyuncuBilgileri = veriler[4].substring(1, veriler[4].length() - 1);
                String[] oyuncuVerileri = oyuncuBilgileri.split("\\)\\(");

                for (String oyuncuVeri : oyuncuVerileri) {
                    oyuncuVeri = oyuncuVeri.replaceAll("\\(", "").replaceAll("\\)", "");
                    String[] oyuncuDetaylari = oyuncuVeri.split(", ");

                    String adSoyad = oyuncuDetaylari[0];
                    String cinsiyet = oyuncuDetaylari[1];
                    int yas = Integer.parseInt(veriler[2]);
                    String vatandaslik = oyuncuDetaylari[3];

                    Aktör aktor = new Aktör(adSoyad, cinsiyet, yas, vatandaslik);
                    oyuncular.add(aktor);
                }

                Film film = new Film(yapimYili, filmAdi, filmTuru, yonetmen, oyuncular);
                filmEnvanteri.ekle(film);
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int secim = -1;

        while (secim != 0) {
            System.out.println();
            System.out.println("1. Yeni film ekle");
            System.out.println("2. Film ara");
            System.out.println("3. Film sil");
            System.out.println("4. Liste yazdır");
            System.out.println("5. Liste ters yazdır");
            System.out.println("6. Belirli bir yıldan önce yapılmış filmleri listele");
            System.out.println("0. Çıkış");
            System.out.print("Bir seçenek girin: ");
            secim = scanner.nextInt();
            scanner.nextLine(); // Boş satırı oku

            switch (secim) {
                case 1:
                    System.out.print("Film yapım yılı: ");
                    int yapimYili = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Film adı: ");
                    String filmAdi = scanner.nextLine();

                    System.out.print("Film türü: ");
                    String filmTuru = scanner.nextLine();

                    System.out.print("Yönetmen: ");
                    String yonetmen = scanner.nextLine();

                    System.out.print("Oyuncu bilgileri (örn: 'Ad Soyad, Cinsiyet, Vatandaşlık'): ");
                    String oyuncuBilgileri = scanner.nextLine();
                    String[] oyuncuVerileri = oyuncuBilgileri.split(", ");

                    ArrayList<Aktör> oyuncular = new ArrayList<>();
                    for (String oyuncuVeri : oyuncuVerileri) {
                        String[] oyuncuDetaylari = oyuncuVeri.split(", ");

                        String adSoyad = oyuncuDetaylari[0];
                        String cinsiyet = oyuncuDetaylari[1];
                        int yas = Integer.parseInt(oyuncuDetaylari[2]);
                        String vatandaslik = oyuncuDetaylari[3];

                        Aktör aktor = new Aktör(adSoyad, cinsiyet, yas, vatandaslik);
                        oyuncular.add(aktor);
                    }

                    Film yeniFilm = new Film(yapimYili, filmAdi, filmTuru, yonetmen, oyuncular);
                    filmEnvanteri.ekle(yeniFilm);
                    System.out.println("Film başarıyla eklendi.");
                    break;

                case 2:
                    System.out.print("Aranacak film adını girin: ");
                    String arananFilmAdi = scanner.nextLine();

                    Film arananFilm = filmEnvanteri.ara(arananFilmAdi);
                    if (arananFilm != null) {
                        System.out.println("Film bulundu: " + arananFilm);
                    } else {
                        System.out.println("Film bulunamadı.");
                    }
                    break;

                case 3:
                    System.out.print("Silinecek film adını girin: ");
                    String silinecekFilmAdi = scanner.nextLine();

                    filmEnvanteri.sil(silinecekFilmAdi);
                    System.out.println("Film başarıyla silindi.");
                    break;

                case 4:
                    filmEnvanteri.listeYazdir();
                    break;

                case 5:
                    filmEnvanteri.listeTersYazdir();
                    break;

                case 6:
                    System.out.print("Yıl girin: ");
                    int yil = scanner.nextInt();
                    filmEnvanteri.yilOncesiFilmleriYazdir(yil);
                    break;

                case 0:
                    System.out.println("Programdan çıkılıyor...");
                    break;

                default:
                    System.out.println("Geçersiz seçenek!");
                    break;
            }
        }

        scanner.close();
    }
}
