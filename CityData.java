import java.util.List;
import java.util.Map;

public class CityData {

    public CityData(Map<String, Boolean> cityName, String country, List<HotelPOJO> hotelList) {
        this.cityName = cityName;
        this.country = country;
        this.hotelList = hotelList;
    }

    private Map<String, Boolean> cityName;
    private String country;
    private List<HotelPOJO> hotelList;

    public Map<String, Boolean> getCityName() {
        return cityName;
    }

    public void setCityName(Map<String, Boolean> cityName) {
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
