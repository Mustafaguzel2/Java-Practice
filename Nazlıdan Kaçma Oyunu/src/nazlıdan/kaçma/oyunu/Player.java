package nazlıdan.kaçma.oyunu;
import java.util.Scanner;

public class Player {
    private int healt, damage, money, rhealt;
    private String name,cName;
    private Inventory inv;
    Scanner scan = new Scanner(System.in);
    
    
    public Player(String name) {
        this.name = name;
        this.inv = new Inventory();
    }
    
    public void selectCharacter(){
        switch (chaMenu()) {
            case 1:
                initPlayer("Samuray", 5, 21, 15);
                break;
            case 2:
                initPlayer("Okçu", 7, 18, 20);
                break;
            case 3:
                initPlayer("Şövalye", 8, 24, 5);
                break;
            case 31:
                initPlayer("Nazli", 99, 99, 99);
                break;
            default:
                initPlayer("Şövalye", 8, 24, 5);
                break;
        
        }
        System.out.println(this.toString());
    }
    public void initPlayer(String cName, int damage, int healt, int money) {
        setcName(cName);
        setDamage(damage);
        setHealt(healt);
        setMoney(money);
        setRhealt(healt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Player: ");
        sb.append("\nhealt = ").append(healt);
        sb.append("\ndamage = ").append(damage);
        sb.append("\nmoney = ").append(money);
        sb.append("\nname = ").append(name);
        sb.append("\ncName = ").append(cName);
        return sb.toString();
    }
    public int chaMenu(){
        System.out.println("Lütfen bir karakter seçiniz: ");
        System.out.println("1 -- Samuray \t Hasar: 5 \t Sağlık: 21 \t Para: 15");
        System.out.println("2 -- Okçu \t Hasar: 7 \t Sağlık: 18 \t Para: 20");
        System.out.println("3 -- Şövalye \t Hasar: 8 \t Sağlık: 24 \t Para: 5");
        System.out.println("Seçiminiz: ");
        int chaId = scan.nextInt();
        if(chaId < 1 || chaId > 3) {
            System.out.println("Geçersiz karakter girdiniz!!");
            System.out.println("Doğru sayı girmezseni default karakter atanır!");
            chaId = scan.nextInt();
        }
        else if(chaId == 31) {
            System.out.println("Gizli karakterin numarasını girdiniz!!?");
            chaId = scan.nextInt();
        }
        return chaId;
    }
    
    public int totalDamage(){
        return this.getDamage() + this.getInv().getDamage();
    }
    

    public int getHealt() {
        return healt;
    }

    public void setHealt(int healt) {
        this.healt = healt;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Inventory getInv() {
        return inv;
    }

    public void setInv(Inventory inv) {
        this.inv = inv;
    }

    public int getRhealt() {
        return rhealt;
    }

    public void setRhealt(int rhealt) {
        this.rhealt = rhealt;
    }
    
}
