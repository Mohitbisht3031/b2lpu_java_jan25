package Day5;
import Day5.User;

public class UserStore {
    static final User user  = new User("Abhi", "9999999", 100000000);
    // dynamic account number update count
    // int c = 1
    // a static block which make the logic inside this execute the moment class is loaded
    static{
        updateAccountNo();
    }
    static void updateAccountNo(){
        user.setAccNo("1");
    }

    static boolean ValidateUser(String accNo){
        return (user.getAcctNo().equals(accNo)); // object class
    }

}
