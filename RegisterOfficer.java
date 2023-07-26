import java.util.Scanner;

public class RegisterOfficer implements Officer {
    private Scanner ear;

    RegisterOfficer() {
        ear = new Scanner(System.in);
    }

    public void call() {
        System.out.println("register");
        System.out.println("-username");
        String userName = ear.nextLine();
        System.out.println("-fullname");
        String fullName = ear.nextLine();
        System.out.println("password");
        String password = ear.nextLine();
        System.out.println("confirm password");
        String confirmPassword = ear.nextLine();
        if (password.equals(confirmPassword)) {
            System.out.println("register success");
        } else {
            System.out.println("your confirm password is incorect");
        }
    }
}
