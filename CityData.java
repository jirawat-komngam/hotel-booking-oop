import java.util.List;

public class CityData {
    public CityData(String cityName, String country, List<HotelPOJO> hotelList) {
        this.cityName = cityName;
        this.country = country;
        this.hotelList = hotelList;
    }

    private String cityName;
    private String country;
    private List<HotelPOJO> hotelList;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<HotelPOJO> getHotelList() {
        return hotelList;
    }

    public void setHotelList(List<HotelPOJO> hotelList) {
        this.hotelList = hotelList;
    }
}
