package FileDemo;

public class AuthenticationService {
    private IAuthenticationService authentication;
    public AuthenticationService(IAuthenticationService authentication) {
        this.authentication = authentication;
    }

    public void login(){
        authentication.login();
    }
    public void signUp() {
        authentication.signUp();
    }
}
