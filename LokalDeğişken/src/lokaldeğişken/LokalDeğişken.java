package lokaldeğişken;
public class LokalDeğişken {
    public static void toplama(int a, int b, int c) {
        System.out.println("Toplama sonucu: " + (a + b + c));
    }
    public static void main(String[] args) {
        
        /*int a = 4;//Mainde yazdın mainde kullan. Başka fonksiyonlarda kullanılmaz.
        String yazdır = "Merhaba";// Burada tanımlanan değişkenler burada kullanılır.
        
        if(a < 10) {
            int b = 5;//Bu da buranın içinde tanımlandığı için if dışında kullanılamaz.
            
            System.out.println(yazdır);
            System.out.println(b);
        }
        
        int i = 1;
        
        while(i < 10){
            if(i % 2 == 0) {
                String yazdır = "Çift"; //Bunu da while da dahi kullanamayız.
                
                System.out.println(yazdır);
            }
            i++;
            
        }*/
        
        toplama(4, 6, 7);//aynı şekilde diğer bir fonksiyon içinde yer alan parametre ve değişkenler 
                               //diğer fonkisyon içinde kullanılmaz.
    }
    
}
