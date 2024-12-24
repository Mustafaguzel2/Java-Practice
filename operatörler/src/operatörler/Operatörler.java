package operatörler;

public class Operatörler {
    public static void main(String[] args) {
        System.out.println(3 + 4.5);
        System.out.println(3 - 5f);
        System.out.println(10 / 4);// Biri float veya double olmadan sadece tam kısmı sonuç olarak gözükür
        System.out.println(10f / 4);
        System.out.println(3.5 * 4d);
        System.out.println(10 % 4);// Kalanı verir
        int a = 4;
        a += 2;
        int b = 6;
        b--;// Postfix(Sağa yazıldığı için, önüne yazılırsa(Prefix). 
        int c = 8;
        c *= 9;
        System.out.println(c);
        System.out.println(b);
        System.out.println(a);
        System.out.println(a--);// Burada önüne yazılırsa işlem yapılır ancak bu şekilde yazılırsa en son 1 i çıkartmadan yazılır.
        
    }
    
}
