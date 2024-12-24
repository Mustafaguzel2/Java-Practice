
package linked;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class linked {
    public static void sıralı_ekle(LinkedList<String> gidilecek_yerler, String yeni) {
        ListIterator<String> iterator = gidilecek_yerler.listIterator();
        while(iterator.hasNext()) {
            int karsilastir = iterator.next().compareTo(yeni);
            //yeni iteratorun gösteridiği değerden büyükse 0 dan büyük küçük -1 çıkıyor.
            if ( karsilastir == 0) {
                System.out.println("Bu değer listede mevcut.");
                return;
            }
            else if (karsilastir < 0) {
                //yeni değer iterator.nextten daha büyük
            }
            else if (karsilastir > 0) {
                iterator.previous();
                iterator.add(yeni);
                return;
            }
                 
        }
        iterator.add(yeni);
    }
    public static void listeyi_bastır(LinkedList<String> gidilecek_yerler) {
        ListIterator<String> iterator = gidilecek_yerler.listIterator();
        
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public static void main(String[] args) {
       /*ArrayList<String> diller = new ArrayList<String>(); 
       
       diller.add("Java");
       diller.add("Php");
       diller.add("Python");
       diller.add("Kotlin");
       diller.add("C#");
       
       for(String s: diller) {
            System.out.println(s);
       }
       diller.add(1, "C++");
       for(String s: diller) {
           System.out.println(s);
       }
         Bu şekilde listede değişiklik yapıldığında tüm listenin yeri 
         kaydığı için zamandan kayıp oluyor. Linkedlistlerde referans 
         üzerinden bir değişim olduğu için daha kısa sürede işlem halloluyor.
         Ancak bir nesne hem değer hem referans aldığı için bellekte 
         daha çok yer kaplıyor.
       */
       
       LinkedList<String> gidilecek_yerler = new LinkedList<String>();
       /*
       gidilecek_yerler.add("Postane");
       
       gidilecek_yerler.add("Market");
       
       gidilecek_yerler.add("Okul");
       
       gidilecek_yerler.add("Kütüphane");
       
       gidilecek_yerler.add("Spor Salonu");
       
       gidilecek_yerler.add("Ev");
       
       listeyi_bastır(gidilecek_yerler);
       
        System.out.println("----------------------");
        
        gidilecek_yerler.add(4,"Alışveriş merkezi");
        
        listeyi_bastır(gidilecek_yerler);
        
        System.out.println("----------------------");
        
        gidilecek_yerler.remove(3);
        
        listeyi_bastır(gidilecek_yerler);
        */
        sıralı_ekle(gidilecek_yerler, "Posthane");
        sıralı_ekle(gidilecek_yerler, "Ev");
        sıralı_ekle(gidilecek_yerler, "Tekel");
        //Compareto ile alfabetik şekilde sıraladı.
        listeyi_bastır(gidilecek_yerler);
    }
    
}
