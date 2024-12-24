package asalbulma;
public class AsalBulma {
    public static boolean asalMı(int sayı) {
        for(int i = 2; i < sayı; i++) {
            if(sayı % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        for(int i = 2; i < 1000; i++) {
            if(asalMı(i)) {
                System.out.println(i);
            }
        }
    }
    
}
