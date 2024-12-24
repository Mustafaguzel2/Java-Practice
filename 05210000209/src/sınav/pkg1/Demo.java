
package sınav.pkg1;

public class Demo {

    public static void main(String[] args) {
        ContactInfo iletişimBilgi = new ContactInfo("İstanbul", "05214563456", "mustafaguzel@gmail.com");
        Person kişi = new Person("Mustafa Yiğit Güzel", iletişimBilgi);
        Bus otobüs = new Bus(50, 15, "Mercede", "34 KPJ 12", kişi);
        Bus otobüs2 = new Bus(otobüs);
       
        System.out.println(iletişimBilgi);
        System.out.println(kişi);
        System.out.println(otobüs);
        System.out.println("Ödemeniz gereken vergi miktarı: " + otobüs.taşıt_vergi());
        
        if(otobüs.equals(otobüs2)) {
            System.out.println("Aynılar");
        }
        else {
            System.out.println("Aynı değiller.");
        }
    }
    
}
