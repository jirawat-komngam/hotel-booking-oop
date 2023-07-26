import java.util.Map;
import java.util.Scanner;

public class ListHotelOfficer {
    private Scanner ear;
    private HotelDB hotelDB;
    private HotelContainer hotelContainer;
    private ListRoomOfficer listRoomOfficer;

    ListHotelOfficer(HotelDB realHotelDB, HotelContainer realHotelContainer, ListRoomOfficer reallistRoomOfficer) {
        ear = new Scanner(System.in);
        hotelDB = realHotelDB;
        hotelContainer = realHotelContainer;
        listRoomOfficer = reallistRoomOfficer;
    }

    public void call(String userName, String fullName) {
        hotelContainer.load();
        String userNameData = userName;
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
                System.out.println("city : " + entry.getKey());

            }
            System.out.println("hotellist");
            System.out.println(
                    countHotel + " " + eachHotel.getHotelName() + " " + eachHotel.getHotelMinPrice() + "baht");
        }
        String selectedHotelInput = ear.nextLine();
        int hotelID = Integer.parseInt(selectedHotelInput);
        HotelPOJO selectedHotel = selectedCity.getHotelList().get(hotelID - 1);
        listRoomOfficer.call(userNameData, fullName, selectedHotel);
    }

}
