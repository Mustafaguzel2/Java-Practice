package gerçekhytınterface;
public class GerçekhytInterface {

    public static void main(String[] args) {
        SignupManager singUpManager = new SignupManager(new ComplexUserCheckServices());
        singUpManager.singUp(new User(1,"Mu",20));
    }
}
    
