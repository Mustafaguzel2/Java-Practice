
package gerçekhytınterface;
public class SignupManager {
    private IUserCheckService iUserCheckService;

    public SignupManager(IUserCheckService iUserCheckService) {
        
        this.iUserCheckService = iUserCheckService;
    }
    
    public void singUp(User user) {
        if(iUserCheckService.checkUser(user)) {
            System.out.println("Kullanıcı kayıt oldu: " + user.getName());
        }
        else {
            System.out.println("Kullanıcı kayıt olamadı: " + user.getName());
        }
    }

}
