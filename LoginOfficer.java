import java.util.Scanner;

public class LoginOfficer implements Officer {
    private Scanner ear;
    private UserDB userDB;

    LoginOfficer(UserDB realUserDB) {
        ear = new Scanner(System.in);
        userDB = realUserDB;
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
                if (password.equals(realPasswordInput)) {
                    System.out.println("login success");
                }
            }
        }

    }
}
