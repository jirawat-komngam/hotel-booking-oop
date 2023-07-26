import java.util.Map;
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

    public void call(String userName, String fullName) {
        hotelContainer.load();
        System.out.println("welcome " + fullName);
        System.out.println("search a Room");
        System.out.println("- search destination");
        System.out.println("select city");
        int countCity = 1;
        for (CityData eachCity : hotelDB.getCityData()) {
            for (Map.Entry<String, Boolean> entry : eachCity.getCityName().entrySet()) {
                System.out.println(countCity + " " + entry.getKey());
                countCity++;
            }
        }
        String cityNameInput = ear.nextLine();
        int cityID = Integer.parseInt(cityNameInput);
        CityData selectedCity = hotelDB.getCityData().get(cityID - 1);
        int countHotel = 1;
        for (HotelPOJO eachHotel : selectedCity.getHotelList()) {
            for (Map.Entry<String, Boolean> entry : selectedCity.getCityName().entrySet()) {
                System.out.println("city :" + entry.getKey());

            }
            System.out.println("hotellist");
            System.out.println(
                    countHotel + " " + eachHotel.getHotelName() + " " + eachHotel.getHotelMinPrice() + "baht");
        }
        String selectedHotel = ear.nextLine();
        int hotelID = Integer.parseInt(selectedHotel);

    }

}
