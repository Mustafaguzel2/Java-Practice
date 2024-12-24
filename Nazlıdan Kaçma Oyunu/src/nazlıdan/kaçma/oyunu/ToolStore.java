package nazlıdan.kaçma.oyunu;

import java.util.Scanner;

public class ToolStore extends SafeLocation{
    
    public ToolStore(Player player) {
        super(player,"Mağaza");
    }
    Scanner scan = new Scanner(System.in);
    
    public boolean getLocation() {
        System.out.println("Mağazaya geldiniz...");
        System.out.println("Paranız: " + player.getMoney());
        System.out.println("1. Silahlar  ");
        System.out.println("2. Zırhlar  ");
        System.out.println("3. Çıkış  ");
        System.out.println("Seçiminiz: ");
        int selTool = scan.nextInt();
        int sellItemId;
        switch (selTool) {
            case 1:
                sellItemId =weaponMenu();
                buyWeapon(sellItemId);
                break;
            case 2:
                sellItemId = armorMenu();
                buyArmor(sellItemId);
                break;
                
            case 3: 
                
                break;
        }
        return true;
    }
    
    public int armorMenu() {
        System.out.println("1 -- Hafif \t Koruma: 1 \t Ücret: 15");
        System.out.println("2 -- Orta \t Koruma: 3 \t Ücret: 25");
        System.out.println("3 -- Ağır \t Koruma: 5 \t Ücret: 40");
        System.out.println("4 -- Çıkış");
        System.out.println("Seçiminiz: ");
        int sellArmorId = scan.nextInt();
        
        return sellArmorId;

    }
    
    public void buyArmor(int ItemId) {
        int avoid = 0, price = 0;
        String aName = null;
        switch (ItemId) {
            case 1:
                avoid = 1;
                price = 15;
                aName = "Hafif zırh";
                break;
            case 2:
                avoid = 3;
                price = 25;
                aName = "Orta zırh";
                break;
                    
            case 3:
                avoid = 5;
                price = 40;
                aName = "Ağır zırh";
                break;
            case 4: 
                System.out.println("Çıkış yapılıyor...");
            default:
                System.out.println("Geçersiz işlem girdiniz !!");
                break;
        }
        if(player.getMoney() >= price) {
            player.setMoney(player.getMoney() - price);
            player.getInv().setArmor(avoid);
            player.getInv().setaName(aName);
            System.out.println("Aldığınız" + aName + "ile yeni özellikleriniz şu şekilde güncellendi: "
                    + player.getInv().getArmor()
                    );
            System.out.println("Kalan paranız: " + player.getMoney());
        }
        else {
            System.out.println("Yeterli paran yok, para kazanda gel.");
        }
   
}
    
    public int weaponMenu() {
        System.out.println("1 -- Tabanca \t Hasar: 2 \t Ücret: 25");
        System.out.println("2 -- Kılıç \t Hasar: 3 \t Ücret: 35");
        System.out.println("3 -- Tüfek \t Hasar: 7 \t Ücret: 45");
        System.out.println("4 -- Çıkış");
        System.out.println("Seçiminiz: ");
        int sellWeaponId = scan.nextInt();
        
        return sellWeaponId;

    }
    
    public void buyWeapon(int ItemId) {
        int damage = 0, price = 0;
        String wName = null;
        switch (ItemId) {
            case 1:
                damage = 2;
                price = 25;
                wName = "Tabanca";
                break;
            case 2:
                damage = 3;
                price = 35;
                wName = "Kılıç";
                break;
                    
            case 3:
                damage = 7;
                price = 45;
                wName = "Tüfek";
                break;
            case 4: 
                System.out.println("Çıkış yapılıyor...");
            default:
                System.out.println("Geçersiz işlem girdiniz !!");
                break;
            }
        
        if(player.getMoney() >= price) {
            player.setMoney(player.getMoney() - price);
            player.getInv().setDamage(damage);
            player.getInv().setwName(wName);
            System.out.println("Aldığınız" + wName + "ile yeni özellikleriniz şu şekilde güncellendi: "
                    + "\nHasar artışı: " + player.getInv().getDamage() 
                    + "\nYeni Hasar: " + player.totalDamage()
                    );
            System.out.println("Kalan paranız: " + player.getMoney());
        }
        else {
            System.out.println("Yeterli paran yok, para kazanda gel.");
        }
    }

    
}
