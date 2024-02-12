package FileDemo;
        // Loosely Coupling
        // Tightly Coupling
public class Main {
    public static void main(String[] args) {
        AuthenticationService authService = new AuthenticationService(
                new GoogleAuthenticationService());
               authService.login();
               authService.signUp();

        AuthenticationService authServices = new AuthenticationService(
                 new FacebookAuthenticationService());
                authServices.signUp();
                authServices.login();

    }

}
