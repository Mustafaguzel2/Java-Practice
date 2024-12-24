package constructor1;

public class Test {
    public static void main(String[] args) {
        /*
        Account account1 = new Account();
        
        account1.setHesapNo("123456");
        account1.setBakiye(1000);
        account1.setIsim("Mustafa Güzel");
        account1.setEmail("mustafaguzel879@gmail.com");
        account1.setTelefonNo("5075488324");
        
        System.out.println("Bakiye = " + account1.getBakiye());
        
        Account account2 = new Account("123123", 1000.0,
                                       "Mustafa Yiğit Güzel", 
                                       "mustafaguzel879@gmail.com",
                                       "5075488324");
        
        account2.paraYatır(2500);
        account2.paraCekme(3000);
        
        Account account3 = new Account();
        System.out.println(account3.getEmail());
        
        Account account4 = new Account("Ahmet Can",
                                       "example@gmail.com",
                                       "5473242341");
        
        System.out.println(account4.getBakiye());
        System.out.println(account4.getIsim());
        
        
        account1.bilgileriGöster();
        account2.bilgileriGöster();
        account3.bilgileriGöster();
        account4.bilgileriGöster();
        */
        
        Account account1 = new Account("Mustafa", "exam@gmail.com", "5075488324");
        
        Account account2 = account1;  // eşitlendiler ve aynı referansı gösteriyorlar
        
        if(account1 == account2) { //normalde stringleri .equals ile bakılırken böyle bakmamızı sağladı.
            System.out.println("Aynı objeyi gösteriyorlar.");
        }
        
        new Account("Hakan", "asd@gmail.com", "234").bilgileriGöster();
        //Referans atamadan tek seferlik kullanmak için böyle bir şey yapılabilir.
    }
}
