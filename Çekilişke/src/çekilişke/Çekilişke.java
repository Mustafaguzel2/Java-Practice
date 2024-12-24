
package çekilişke;
import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class Çekilişke {

    public static void main(String[] args) {
        Random rastgele = new Random();
        Scanner scanner = new Scanner(System.in);
        
        
        String [] isimler = {"Nurbanu", "Berkay", "Mustafa", "nazLi", "Öznur", "Batu","Ümit", "Buse"};
        
        
        String  isimler1 = isimler [rastgele.nextInt(8)];
           
          
        System.out.println("Çıkan isim: " + isimler1);
        
        
        
    }
    
}
