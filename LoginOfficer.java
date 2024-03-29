import java.util.Scanner;

public class LoginOfficer implements Officer {
    private Scanner ear;
    private UserDB userDB;
    private ListHotelOfficer listHotelOfficer;

    LoginOfficer(UserDB realUserDB, ListHotelOfficer realListHotelOfficer) {
        ear = new Scanner(System.in);
        userDB = realUserDB;
        listHotelOfficer = realListHotelOfficer;
    }

    public void call() {
        String realPasswordInput = "";
        System.out.println("login");
        System.out.println("-username");
        String userName = ear.nextLine();
        for (userPOJO eachUser : userDB.getUserList()) {
            if (eachUser.getUserInfo().containsKey(userName) == true) {
                System.out.println("password");
                String password = ear.nextLine();
                realPasswordInput = eachUser.getUserInfo().get(userName);
                String fullName = eachUser.getFullName();
                if (password.equals(realPasswordInput)) {
                    listHotelOfficer.call(userName, fullName);
                } else {
                    System.out.println("wrong password");
                }
            } else {
                System.out.println("user not found");
            }
        }

    }
}
