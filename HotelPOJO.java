import java.util.List;

public class HotelPOJO {
    public HotelPOJO(String hotelName, Double hotelMinPrice, List<RoomPOJO> room) {
        this.hotelName = hotelName;
        this.hotelMinPrice = hotelMinPrice;
        Room = room;
    }

    private String hotelName;
    private Double hotelMinPrice;
    private List<RoomPOJO> Room;

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Double getHotelMinPrice() {
        return hotelMinPrice;
    }

    public void setHotelMinPrice(Double hotelMinPrice) {
        this.hotelMinPrice = hotelMinPrice;
    }

    public List<RoomPOJO> getRoom() {
        return Room;
    }

    public void setRoom(List<RoomPOJO> room) {
        Room = room;
    }
}
