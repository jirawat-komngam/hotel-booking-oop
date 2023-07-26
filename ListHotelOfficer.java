import java.util.Scanner;

public class ListHotelOfficer {
    private Scanner ear;
    private HotelDB hotelDB;
    private HotelContainer hotelContainer;

    ListHotelOfficer(HotelDB realHotelDB, HotelContainer realHotelContainer) {
        ear = new Scanner(System.in);
        hotelDB = realHotelDB;
        hotelContainer = realHotelContainer;
    }

    public void call() {
        System.out.println("search a Room");
        System.out.println("- search destination");
        System.out.println("- write city name");
        String cityNameInput = ear.nextLine();
        hotelContainer.load();
        for (CityData eachCity : hotelDB.getCityData()) {
            if (eachCity.getCityName().containsKey(cityNameInput)) {
                int countHotel = 1;
                for (HotelPOJO eachHotel : eachCity.getHotelList()) {
                    System.out.println(cityNameInput);
                    System.out.println("hotellist");
                    System.out.println(
                            countHotel + " " + eachHotel.getHotelName() + " " + eachHotel.getHotelMinPrice() + "baht");
                }
            }
        }

    }
}
