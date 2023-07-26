import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelContainer {
    private CityData cityData;

    HotelContainer(CityData realCityData) {
        cityData = realCityData;
    }

    public void load() {

        CityData bangkok = new CityData("bangkok", "thailand", new ArrayList<>());
        List<HotelPOJO> hotelList = new ArrayList<HotelPOJO>();
        HotelPOJO baiyoke = new HotelPOJO("Baiyoke Sky Hotel Restaurant Buffet ", 300.0, new ArrayList<>());
        List<RoomPOJO> baiyokeRoomList = new ArrayList<RoomPOJO>();
        RoomPOJO cheepRoom = new RoomPOJO("cheep", 300.0, null);
        RoomPOJO normalRoom = new RoomPOJO("normal", 800.0, null);
        RoomPOJO deluxeRoom = new RoomPOJO("deluxe", 2000.0, null);
        Map<ZonedDateTime, Boolean> roomAvailiableDates = new HashMap<>();
        roomAvailiableDates.put(ZonedDateTime.of(2023, 6, 28, 0, 0, 0, 0, ZoneId.of("UTC")), true);
        roomAvailiableDates.put(ZonedDateTime.of(2023, 6, 29, 0, 0, 0, 0, ZoneId.of("UTC")), true);
        roomAvailiableDates.put(ZonedDateTime.of(2023, 6, 30, 0, 0, 0, 0, ZoneId.of("UTC")), true);
        cheepRoom.setRoomAvailiabledates(roomAvailiableDates);
        normalRoom.setRoomAvailiabledates(roomAvailiableDates);
        deluxeRoom.setRoomAvailiabledates(roomAvailiableDates);
        baiyokeRoomList.add(cheepRoom);
        baiyokeRoomList.add(normalRoom);
        baiyokeRoomList.add(deluxeRoom);
        baiyoke.setRoom(baiyokeRoomList);
        hotelList.add(baiyoke);
        bangkok.setHotelList(hotelList);

    }
}
