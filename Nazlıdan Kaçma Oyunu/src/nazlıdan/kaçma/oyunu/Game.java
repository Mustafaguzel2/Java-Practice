package nazlıdan.kaçma.oyunu;

import java.util.Scanner;

public class Game {
    Player player;
    Location location;
    
    Scanner scan = new Scanner(System.in);
    
    public void login(){
    Scanner scan = new Scanner(System.in);
        System.out.println("Macera oyununa hoşgeldiniz...!");
        System.out.println("Oyuna başlamadan önce karakterinizin ismini giriniz: ");
        String playerName = scan.nextLine();
        player = new Player(playerName);
        player.selectCharacter();
        start();
    }
    public void start(){
        while(true) {
            System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("Gitmek istediğiniz lokasyonu seçiniz: ");
        System.out.println("1. Güvenli ev --> Size ait güvenilir mekanınız(can tazelenir)");
        System.out.println("2. Mağara --> Karşınıza zombi çıkanibilir");
        System.out.println("3. Orman --> Vampir tehlikesi var.");
        System.out.println("4. Nehir --> Dikkat ayu çıkabilur !!!");
        System.out.println("5. Mağaza --> Silah ve zırh alımı yapılabilir.");
        System.out.println("Gitmek istediğiniz yer: ");
        int selLoc = scan.nextInt();
        
        while(selLoc < 1 || selLoc > 5) {
            System.out.println("Lütfen geçerli bir lokasyon giriniz:");
            selLoc = scan.nextInt();
        }
        
        switch (selLoc) {
            case 1:
               location = new SafeHouse(player);
               break;
               
            case 2:
               location = new Cave(player);
               break;
               
            case 3:
               location = new Forest(player);
               break;
            
            case 4:
               location = new River(player);
               break;
               
            case 5:
               location = new ToolStore(player);
               break;
            
            default:
               location = new SafeHouse(player);

               
        }
        if(location.getClass().getName().equals("SafeHouse")) {
            if(player.getInv().isWater() && player.getInv().isFood() && player.getInv().isFirewood()) {
                System.out.println("Tebrikler hayatta kalmak için gerekli her şeyi topladın!");
                System.out.println("Oyunu kazandın");
                break;
            }
        }
        
        if(!location.getLocation()) {
            System.out.println("Oyun BİTTİ!!");
            break;
        }
        }
    }
}
