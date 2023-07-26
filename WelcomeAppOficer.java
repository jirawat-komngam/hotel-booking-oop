import java.util.Scanner;

public class WelcomeAppOficer implements Officer {
    private Scanner ear;
    private LoginOfficer loginOfficer;
    private RegisterOfficer registerOfficer;

    WelcomeAppOficer(RegisterOfficer realRegisterOfficer, LoginOfficer realLoginOfficer) {
        ear = new Scanner(System.in);
        registerOfficer = realRegisterOfficer;
        loginOfficer = realLoginOfficer;
    }

    public void call() {
        while (true) {
            System.out.println("-Agoda 1980");
            System.out.println("1 login");
            System.out.println("2 register");
            String userInput = ear.nextLine();
            dicision(userInput);
        }

    }

    public void dicision(String userword) {
        if (userword.equals("1")) {
            loginOfficer.call();

        } else if (userword.equals("2")) {
            registerOfficer.call();
        }
    }
}
