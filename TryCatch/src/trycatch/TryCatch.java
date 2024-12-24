package trycatch;
public class TryCatch {
    public static void main(String[] args) {
        /*
        int a = 30 / 0;//Unchecked exception.0'a bölünme hatası ArithmeticException 
        
        int[] b = {1,2,3,4,5};//Geçersiz index hatası ArrayIndexOutOfBounds
        System.out.println(a);
        System.out.println(b[6]);
        */
        
        try {
            int a = 30/0;
            int[] b = {1,2,3,4,5,};
            System.out.println(b[6]);
        }
        catch(ArithmeticException e) {
            System.out.println("Bir sayı sıfıra bölünemez!!");
        }
        catch(ArrayIndexOutOfBoundsException e) { //Sadece Exception yazsakta çalışır
            System.out.println("Bu index listede yer almıyor.");
            e.printStackTrace(); //Hangi hata olduğunu söylüyor.
        }
        catch(Exception e) {
            System.out.println("Bir hata oluştu.");
            e.printStackTrace(); 
        }
    }
    
}
