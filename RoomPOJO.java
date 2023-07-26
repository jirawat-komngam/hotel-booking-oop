import java.time.ZonedDateTime;

public class RoomPOJO {
    public RoomPOJO(String roomType, Double roomPrice, ZonedDateTime roomAvailiabledates) {
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.roomAvailiabledates = roomAvailiabledates;
    }

    private String roomType;
    private Double roomPrice;
    private ZonedDateTime roomAvailiabledates;

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

    public ZonedDateTime getRoomAvailiabledates() {
        return roomAvailiabledates;
    }

    public void setRoomAvailiabledates(ZonedDateTime roomAvailiabledates) {
        this.roomAvailiabledates = roomAvailiabledates;
    }
}
