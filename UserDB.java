import java.util.List;

public class UserDB {
    public UserDB(List<userPOJO> userList) {
        this.userList = userList;
    }

    private List<userPOJO> userList;

    public List<userPOJO> getUserList() {
        return userList;
    }

    public void setUserList(List<userPOJO> userList) {
        this.userList = userList;
    }
}
