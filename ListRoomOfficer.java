import java.util.Scanner;


     class ListRoomOfficer {
    private Scanner ear;
    public void call(String userName) {
        System.out.println("hotel : asdsa");
        System.out.println("Room");
        System.out.println("1 cheep 500");
        System.out.println("2 normal 1000");
        System.out.println("3 deluxe 5000");
        System.out.println("Choose room id:");
        String roomInput = ear.nextLine();
        System.out.println("Available Date");
        System.out.println("1: 2023-06-29T00:00Z[UTC]");
        System.out.println("2: 2023-06-28T00:00Z[UTC]");
        System.out.println("3: 2023-06-30T00:00Z[UTC]");
        System.out.println("from");
        String datefromInput = ear.nextLine();
        System.out.println("to");
        String datetoInput = ear.nextLine();
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
        String confirmation = ear.nextLine();
        if (confirmation.equals("yes")) {
            System.out.println("booking success");
        }
    }
}
