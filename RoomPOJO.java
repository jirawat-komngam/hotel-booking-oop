import java.time.ZonedDateTime;
import java.util.Map;

public class RoomPOJO {

    public RoomPOJO(String roomType, Double roomPrice, Map<ZonedDateTime, Boolean> roomAvailiabledates) {
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.roomAvailiabledates = roomAvailiabledates;
    }

    private String roomType;
    private Double roomPrice;
    private Map<ZonedDateTime, Boolean> roomAvailiabledates;

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(Double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public Map<ZonedDateTime, Boolean> getRoomAvailiabledates() {
        return roomAvailiabledates;
    }

    public void setRoomAvailiabledates(Map<ZonedDateTime, Boolean> roomAvailiabledates) {
        this.roomAvailiabledates = roomAvailiabledates;
    }

}
