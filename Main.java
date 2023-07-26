import java.util.Scanner;

class program {
    public void hardcode() {
        System.out.println("-Agoda 1980");
        System.out.println("1 login");
        System.out.println("2 register");
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        if (input1.equals("1")) {
            System.out.println("login");
            System.out.println("-username");
            Scanner userName = new Scanner(System.in);
            System.out.println("password");
            Scanner password = new Scanner(System.in);
            System.out.println("Agoda 1999");
            System.out.println("welcome: (fullname)");
            System.out.println("1: View my bookings");
            System.out.println("2: search a Room");
            System.out.println("3: Exit");

        } else if (input1.equals("2")) {
            System.out.println("register");
            System.out.println("-username");
            Scanner userName = new Scanner(System.in);
            System.out.println("-fullname");
            Scanner fullName = new Scanner(System.in);
            System.out.println("password");
            Scanner password = new Scanner(System.in);
            System.out.println("confirm password");
            Scanner confirmPassword = new Scanner(System.in);
            if (password.equals(confirmPassword)) {
                System.out.println("register success");
            } else {
                System.out.println("your confirm password is incorect");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
