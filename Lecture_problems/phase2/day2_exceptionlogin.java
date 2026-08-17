package phase2;
class login {
    String username = "xxx";
    String password = "3456";
    login(String usernames, String passwords) {
        if (username.equals(usernames) && password.equals(passwords)) {
            System.out.println("login");
        } else {
            throw new RuntimeException("Username and password is wrong");
        }
    }
}
public class day2_exceptionlogin {
    public static void main(String[] args) {
        login l = new login("zzz", "1234");
    }
}