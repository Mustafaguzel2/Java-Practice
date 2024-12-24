package method.pkgreturn;
public class MethodReturn {
    public static int ikiilecarp(int a) {
        return a * 2;
    }
    public static int ikiiletopla(int a) {
        return a + 2;
    }
    public static int dortilecarp(int a) {
        return a * 4;
    }
    public static int Toplama(int a, int b, int c) {
        return (a + b + c);
    }
    public static void main(String[] args) {
        
        System.out.println("Çıktı değeri: " + Toplama(3, 4, 5));
        //Return çıktı almamızı sağlayan bu değerleri tekrar tekrar kullanmamıza yarayan bir komuttur.
        
        //Returnden sonra hiçbir kod çalışmaz bundan dolayı ondan sonra bir şey yazmak mantıksız.
        
        //fonksiyon çıktılarını iç içe yazarak değerlerini kullanacağız.
        System.out.println("Sonucumuz = " + (dortilecarp(ikiiletopla(ikiilecarp(8)))));
        
        
    }
    
}
