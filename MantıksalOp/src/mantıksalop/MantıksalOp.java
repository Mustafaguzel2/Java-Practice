package mantıksalop;
public class MantıksalOp {
    public static void main(String[] args) {
        System.out.println(3 == 3 && 2 < 3 && "Murat" == "Murat"); 
        // && (and) operatörü hepsi doğruysa true verir.
        
        System.out.println(3 == 4 || 2 < 3 || "Murat" != "Ahmet");
        // || (or) operatörü biri doğruysa true verir.
        
        System.out.println(! false );
        System.out.println(!(3 < 4));
        // ! (not) operatörü doğruluk değerini değiştirir.
        
        System.out.println(!((3 < 4 && "Murat" == "Murat") || 3.4 > 2.1));
    }
    
}
