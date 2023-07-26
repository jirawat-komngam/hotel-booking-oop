import java.time.ZonedDateTime;
import java.util.Map;
import java.util.Scanner;

class ListRoomOfficer {
    private Scanner ear;

    ListRoomOfficer() {
        ear = new Scanner(System.in);
    }

    public void call(String userName, String fullName, HotelPOJO selectedHotel) {
        int countRoom = 1;
        System.out.println("hotel : " + selectedHotel.getHotelName());
        System.out.println("Room");
        for (RoomPOJO eachRoom : selectedHotel.getRoom()) {
            System.out.println(countRoom + " " + eachRoom.getRoomType() + " " + eachRoom.getRoomPrice() + "  baht");
            countRoom++;
        }
        System.out.println("Choose room id:");
        String roomInput = ear.nextLine();
        int roomID = Integer.parseInt(roomInput);
        RoomPOJO selectedRoom = selectedHotel.getRoom().get(roomID - 1);
        System.out.println("Available Date");
        int countDate = 1;
        for (Map.Entry<ZonedDateTime, Boolean> entry : selectedRoom.getRoomAvailiabledates().entrySet()) {
            System.out.println(countDate + " " + entry.getKey());
            countDate++;
        }
        System.out.println("from");
        String datefromInput = ear.nextLine();
        System.out.println("to");
        String datetoInput = ear.nextLine();
        int fromDateID = Integer.parseInt(datefromInput);
        int toDateID = Integer.parseInt(datetoInput);
        ZonedDateTime selectFromDate = null;
        int countFromDate = 1;
        for (Map.Entry<ZonedDateTime, Boolean> entry : selectedRoom.getRoomAvailiabledates().entrySet()) {
            if (fromDateID == countFromDate) {
                selectFromDate = entry.getKey();
                break;

            }
            countFromDate++;
        }
        ZonedDateTime selectToDate = null;
        int countToDate = 1;
        for (Map.Entry<ZonedDateTime, Boolean> entry : selectedRoom.getRoomAvailiabledates().entrySet()) {
            if (toDateID == countToDate) {
                selectFromDate = entry.getKey();
                break;

            }
            countToDate++;
        }
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
