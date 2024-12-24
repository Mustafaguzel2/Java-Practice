
package str;

public class Str {

    public static void main(String[] args) {
        /*
        String a = "Mustafa";
        String b = new String("Mustafa");
        System.out.println(b);
        System.out.println("Kelimenin harf sayısı: " + b.length());
        
        System.out.println("0. indeks: " + b.charAt(0));
        System.out.println("Son eleman: " + b.charAt(b.length()-1));
        
        
        for(int i = 0; i < b.length(); i++) {
            System.out.println(b.charAt(i));
        }
        
        System.out.println(b.startsWith("M"));//Başlıyor mu
        System.out.println(b.endsWith("cs"));
        System.out.println(b.indexOf("f"));// ilk gördüğü yerdeki indeksi verir.
        System.out.println(b.indexOf("b"));//yoksa -1 verir
        System.out.println(b.lastIndexOf("a"));//sondan başlar aramaya
        System.out.println(b.toLowerCase());
        System.out.println(b.toUpperCase());
        
        String c = "1923";
        System.out.println(c);//String -> int oldu
        int d = Integer.parseInt(c);
        System.out.println(d - 42);
        
        int f = 1923;
        String g = String.valueOf(f);//int -> string oldu
        */
        String a1 = "Mustafa";
        String a2 = "Mustafa";
        if ( a1 == a2 ) {
            System.out.println("Eşitler");
        }
        String b1 = new String("Mustafa"); //obje gibi yazarsak 
        String b2 = new String("Mustafa");//karşılatırma aşağıdaki gibi olur.
        if (b1.equals(b2)) {
            System.out.println("Eşitler");
        }
    }
    
}
