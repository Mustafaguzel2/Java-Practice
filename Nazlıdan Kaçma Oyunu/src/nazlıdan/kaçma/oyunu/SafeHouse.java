package nazlıdan.kaçma.oyunu;
public class SafeHouse extends SafeLocation{

    public SafeHouse(Player player) {
        super(player, "Güvenli ev");
    }

    
    
     public boolean getLocation() {
        player.setHealt(player.getRhealt());
        System.out.println("Sağlığınız tazelendi...");
        System.out.println("Şu an güvenli evdesiniz.");
        return true;
    }
}
