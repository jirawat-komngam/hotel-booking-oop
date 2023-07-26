import java.time.ZonedDateTime;

public class Booking {
    public Booking(String city, String hotelName, String fullName, String hotelType, ZonedDateTime checkInTime,
            ZonedDateTime checkOutTime) {
        this.city = city;
        this.hotelName = hotelName;
        this.fullName = fullName;
        this.hotelType = hotelType;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
    }

    private String city;
    private String hotelName;
    private String fullName;
    private String hotelType;
    private ZonedDateTime checkInTime;
    private ZonedDateTime checkOutTime;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getHotelType() {
        return hotelType;
    }

    public void setHotelType(String hotelType) {
        this.hotelType = hotelType;
    }

    public ZonedDateTime getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(ZonedDateTime checkInTime) {
        this.checkInTime = checkInTime;
    }

    public ZonedDateTime getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(ZonedDateTime checkOutTime) {
        this.checkOutTime = checkOutTime;
    }
}
