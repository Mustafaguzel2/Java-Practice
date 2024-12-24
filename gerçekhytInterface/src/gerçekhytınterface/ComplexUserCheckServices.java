package gerçekhytınterface;
public class ComplexUserCheckServices implements IUserCheckService {
    
    public boolean checkUser(User user) {
        if (user.getAge() >= 18 && user.getName().startsWith("Mu")) {
            return true;
        }
        return false;
    }
}
