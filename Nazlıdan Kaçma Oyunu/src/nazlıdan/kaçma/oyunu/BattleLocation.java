package nazlıdan.kaçma.oyunu;

import java.util.Scanner;

public abstract class BattleLocation extends Location{
    protected Obstacle obs;
    protected String award;
    
     public BattleLocation(Player player, String name, Obstacle obstacle,String award) {
        super(player);
        this.name = name;
        this.obs = obstacle;
        this.award = award;
        
    }
    
    Scanner scan = new Scanner(System.in);
    
     public boolean getLocation() {
        int obsCount = obs.ObsCount();
        System.out.println("Şu an buradasınız: " + this.getName());
        System.out.println("Dikkatli ol, burada " + obsCount + " tane " + this.obs.getName() + "  yaşıyor.");
        System.out.println("<S>avaş ya da <K>aç ");
        String selCase = scan.nextLine();
        selCase = selCase.toUpperCase();
        
        if(selCase.equals("S")) {
            if(combat(obsCount)) {
                System.out.println(this.getName() + " Bölgesindeki tüm düşmanları yendiniz.");
                if(this.award.equals("Food") && player.getInv().isFood() == false) {
                    System.out.println("Tebrikler yiyecek kazandınız.");
                    player.getInv().setFood(true);
                }
                else if(this.award.equals("Water") && player.getInv().isWater()== false) {
                    System.out.println("Tebrikler su kazandınız.");
                    player.getInv().setWater(true);
                }
                else if(this.award.equals("Firewood") && player.getInv().isFirewood()== false) {
                    System.out.println("Tebrikler yakacak kazandınız.");
                    player.getInv().setFirewood(true);
                }
                return true;
            }
            else{
                System.out.println("GEBERDİN!");
                return false;
            }
        }
        else {
            System.out.println("Hey " + player.getName() + " korkak bir bebek gibi kaçmayı seçtin. EZİK!");
            return true;
        }

    }
     
     public boolean combat(int obsCount) {
         for(int i = 0; i < obsCount; i++) {
             int defaultObsHealth = obs.getHealth();
             playerStats();
             enemyStats();
             while(player.getHealt() > 0 && obs.getHealth() > 0) {
                 System.out.println("<V>ur veya <K>aç ");
                 String selCase = scan.nextLine();
                 selCase = selCase.toUpperCase();
                 if(selCase.equals("V")) {
                     System.out.println("Sağlam vurdun dostum...");
                     obs.setHealth(obs.getHealth() - player.totalDamage());
                     System.out.println(obs.getName() + " sağlığı: " + obs.getHealth());
                     if(obs.getHealth() > 0) {
                         System.out.println();
                     System.out.println(obs.getName() + " sana sağlam bir vurdu ");
                     player.setHealt(player.getHealt() - (obs.getDamage() - player.getInv().getArmor()));
                     System.out.println("Kalan sağlığın: " + player.getHealt());
                     }
                 }
                 else {
                     break;
                 }    
             }
             if(obs.getHealth() <= 0 && player.getHealt() > 0) {
                 System.out.println("Düşmanı hakladın!");
                 player.setMoney(obs.getAward() + player.getMoney());
                 System.out.println("Topladığın ganimetle birlikte paran: " + player.getMoney());
                 obs.setHealth(defaultObsHealth);
             }
             else {
                 return false;
             }
             System.out.println("_______________________________");
             System.out.println("Tüm düşmanları geberttin. Bravo cesur çocuk!");
         }
         return true;
         }
     public void playerStats() {
         System.out.println( player.getName() + " değerlerin\n __________________");
         System.out.println("Canınız: " + player.getHealt());
         System.out.println("Gücü: " + player.totalDamage());
         System.out.println("Para" + player.getMoney());
         if(player.getInv().getDamage() > 0) {
             System.out.println("Silahınız: " + player.getInv().getwName());
         }
         if(player.getInv().getArmor()> 0) {
             System.out.println("Zırhınız: " + player.getInv().getaName());
         }
         
     }
     public void enemyStats() {
         System.out.println("\nDüşmanının değerleri\n __________________");
         System.out.println("Canı: " + obs.getHealth());
         System.out.println("Gücü: " + obs.getDamage());
         System.out.println("Parası" + obs.getAward());
     }
}
