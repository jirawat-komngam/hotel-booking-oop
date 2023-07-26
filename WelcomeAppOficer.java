import java.util.Scanner;

public class WelcomeAppOficer implements Officer {
    private Scanner ear;

    WelcomeAppOficer() {
        ear = new Scanner(System.in);
    }

    public void call() {
        System.out.println("-Agoda 1980");
        System.out.println("1 login");
        System.out.println("2 register");
    }

    public void dicision(String userword) {
        if (userword.equals("1")) {
            System.out.println("login");
        } else if (userword.equals("2")) {
            System.out.println("login");
        }
    }
}
