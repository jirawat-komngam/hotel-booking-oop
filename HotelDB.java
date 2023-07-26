import java.util.List;

public class HotelDB {
    public HotelDB(List<CityData> cityData) {
        this.cityData = cityData;
    }

    private List<CityData> cityData;

    public List<CityData> getCityData() {
        return cityData;
    }

    public void setCityData(List<CityData> cityData) {
        this.cityData = cityData;
    }
}
