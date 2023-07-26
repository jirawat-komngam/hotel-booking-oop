import java.util.List;
import java.util.Map;

public class userPOJO {
    public userPOJO(Map<String, String> userInfo, String fullName, List<Booking> booking) {
        this.userInfo = userInfo;
        this.fullName = fullName;
        this.booking = booking;
    }
    private Map<String, String> userInfo;
    private String fullName;
    private List<Booking> booking;
    public Map<String, String> getUserInfo() {
        return userInfo;
    }
    public void setUserInfo(Map<String, String> userInfo) {
        this.userInfo = userInfo;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public List<Booking> getBooking() {
        return booking;
    }
    public void setBooking(List<Booking> booking) {
        this.booking = booking;
    }

    
}
