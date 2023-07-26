import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RegisterOfficer implements Officer {
    private Scanner ear;
    private UserDB userDB;

    RegisterOfficer(UserDB realUserDB) {
        ear = new Scanner(System.in);
        userDB = realUserDB;
    }

    public void call() {
        System.out.println("register");
        System.out.println("-username");
        String userName = ear.nextLine();
        System.out.println("-fullname");
        String fullName = ear.nextLine();
        System.out.println("password");
        String password = ear.nextLine();
        System.out.println("confirm password");
        String confirmPassword = ear.nextLine();
        if (password.equals(confirmPassword)) {
            System.out.println("register success");
            userPOJO newUser = new userPOJO(null, fullName, new ArrayList<>());
            Map userInfo = new HashMap<String, String>();
            userInfo.put(userName, password);
            userDB.getUserList().add(newUser);
        } else {
            System.out.println("your confirm password is incorect");
        }
    }
}
