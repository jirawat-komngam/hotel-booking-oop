import java.util.Scanner;

class program {

    public void app() {

    }

    public void hardcode() {
        while (true) {
            System.out.println("-Agoda 1980");
            System.out.println("1 login");
            System.out.println("2 register");
            Scanner scanner = new Scanner(System.in);
            String input1 = scanner.nextLine();
            if (input1.equals("1")) {
                System.out.println("login");
                System.out.println("-username");
                String userName = scanner.nextLine();
                System.out.println("password");
                String password = scanner.nextLine();
                System.out.println("Agoda 1999");
                System.out.println("welcome: (fullname)");
                System.out.println("1: View my bookings");
                System.out.println("2: search a Room");
                System.out.println("3: Exit");
                String mainInput = scanner.nextLine();
                if (mainInput.equals("1")) {
                    System.out.println("View my bookings");
                    System.out.println("name (fullname)");
                    System.out.println("1) Kapoo Ngam");
                    System.out.println("Check-in Date: 20 January 2023");
                    System.out.println("Check-out Date: 21 January 2023");
                    System.out.println("Night: 1");
                    System.out.println("Total Price: 1070 Baht");
                } else if (mainInput.equals("2")) {
                    System.out.println("search a Room");
                    System.out.println("- search destination");
                    System.out.println("- write city name");
                    String cityNameInput = scanner.nextLine();
                    System.out.println("bangkok");
                    System.out.println("hotellist");
                    System.out.println("1 asdsa hotel 5stars 500 baht");
                    System.out.println("2 asrr hotel 3stars 100 baht");
                    System.out.println("3 wew  hotel 4 stars 250 baht");
                    String hotelInput = scanner.nextLine();
                    System.out.println("hotel : asdsa");
                    System.out.println("Room");
                    System.out.println("1 cheep 500");
                    System.out.println("2 normal 1000");
                    System.out.println("3 deluxe 5000");
                    System.out.println("Choose room id:");
                    String roomInput = scanner.nextLine();
                    System.out.println("Available Date");
                    System.out.println("1: 2023-06-29T00:00Z[UTC]");
                    System.out.println("2: 2023-06-28T00:00Z[UTC]");
                    System.out.println("3: 2023-06-30T00:00Z[UTC]");
                    System.out.println("from");
                    String datefromInput = scanner.nextLine();
                    System.out.println("to");
                    String datetoInput = scanner.nextLine();
                    System.out.println("Summary");
                    System.out.println("name (fullname)");
                    System.out.println("city bangkok");
                    System.out.println("Hotel:Kapoo Ngam");
                    System.out.println("Check-in Date: 2023-06-29T00:00Z[UTC]");
                    System.out.println("Check-out Date: 2023-06-29T00:00Z[UTC]");
                    System.out.println("Room Type:Sweet f**k (500.0 bath/day");
                    System.out.println("Night:0");
                    System.out.println("Price:0.0baht");
                    System.out.println("VAT (7%):0.0baht");
                    System.out.println("Total Price:0.0Baht");
                    System.out.println("confirm");
                    String confirmation = scanner.nextLine();
                    if (confirmation.equals("yes")) {
                        System.out.println("booking success");
                    }
                }
            } else if (input1.equals("2")) {
                System.out.println("register");
                System.out.println("-username");
                String userName = scanner.nextLine();
                System.out.println("-fullname");
                String fullName = scanner.nextLine();
                System.out.println("password");
                String password = scanner.nextLine();
                System.out.println("confirm password");
                String confirmPassword = scanner.nextLine();
                if (password.equals(confirmPassword)) {
                    System.out.println("register success");
                } else {
                    System.out.println("your confirm password is incorect");
                }
            }
        }

    }
}

public class Main {
    public static void main(String[] args) {
        program newprog = new program();
        newprog.hardcode();
    }
}
