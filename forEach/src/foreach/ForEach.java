package foreach;
public class ForEach {
    public static void main(String[] args) {
        
        Deneme[] array3 = {new Deneme("Ahmet"), new Deneme("Samet"), new Deneme("Ozan")};
        
        String[] array = {"Elma", "Armut", "Çilek"};
        int[] array2 = {1,2,3,4,5,6};
        
        for(String a: array) { //Arrayi bastırmayı sağlar
            //Her döngüde tek tek basar değerleri
            
            System.out.println(a);
        }
        for(int i: array2) {
            System.out.println(i);
        }
        
        for(Deneme d: array3) {
            d.yaz();
        }
    }
    
}
