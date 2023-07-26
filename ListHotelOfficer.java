import java.util.Scanner;

public class ListHotelOfficer {
    private Scanner ear;

    ListHotelOfficer() {
        ear = new Scanner(System.in);
    }

    public void call() {
        System.out.println("search a Room");
        System.out.println("- search destination");
        System.out.println("- write city name");
        String cityNameInput = ear.nextLine();
        System.out.println("bangkok");
        System.out.println("hotellist");
        System.out.println("1 asdsa hotel 5stars 500 baht");
        System.out.println("2 asrr hotel 3stars 100 baht");
        System.out.println("3 wew  hotel 4 stars 250 baht");
        String hotelInput = ear.nextLine();
    }
}
