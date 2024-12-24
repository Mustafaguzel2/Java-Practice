package nazlıdan.kaçma.oyunu;
import java.util.Scanner;
public abstract class SafeLocation extends Location{

    public SafeLocation(Player player,String name) {
        super(player);
        this.name = name;
    }

    
    
    public boolean getLocation() {
        return true;
    }
    
    
}
