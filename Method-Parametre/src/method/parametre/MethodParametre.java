package method.parametre;
public class MethodParametre {
    public static void Toplama (int sayı1, int sayı2, int sayı3) {
        System.out.println("Toplamları = " + (sayı1 + sayı2 + sayı3));
    }
    public static void Selamlama(String isim) {
        System.out.println("Selamlarrr " + isim);
    }
    public static void main(String[] args) {
        
        Selamlama("Mustafa");
        Toplama(4, 5, 8);
        Toplama(12, 31, 62);
    }
    
}
