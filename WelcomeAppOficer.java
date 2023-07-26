import java.util.Scanner;

public class WelcomeAppOficer {
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

    }
}
