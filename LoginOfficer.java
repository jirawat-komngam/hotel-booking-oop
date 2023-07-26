import java.util.Scanner;

public class LoginOfficer implements Officer {
    private Scanner ear;

    LoginOfficer() {
    }

    public void call() {
        System.out.println("login");
        System.out.println("-username");
        String userName = ear.nextLine();
        System.out.println("password");
        String password = ear.nextLine();
    }
}
