package Day7;
import java.util.ArrayList;

import org.xml.sax.SAXException;

import Day5.User;

public class middleAuth {
    // dynamic
    // private static User arr[] = new User[3];
    private static ArrayList<User> arr = new ArrayList<>();
    // static block // initilizer block
    static{
        System.out.println("inside the static block!");
        arr.add(new User("Abhi", "9999999", 100000000.0,"1234","1"));
        arr.add(new User("Anu", "9999988", 99999.0,"1235","2"));
        arr.add(new User("Raj", "9999888", 1000000009.0,"1236","3"));
    }
    public middleAuth(){
        System.out.println("default const!");
    }
    // static final User user  = new User("Abhi", "9999999", 100000000.0,"1234","1");

    // auth method cardless transaction.
    public String authForCardless(String accNo,String Pin){
        // all the users to check the accNo
        for(User user : arr){
        if(user.getAcctNo().equalsIgnoreCase(accNo) && user.getPin().equalsIgnoreCase(Pin))return user.getUserName();}
        return null;
    }

    // auth method for card
    public String authForCard(String name,String Pin){
        for(User user : arr){
        if(user.getUserName().equalsIgnoreCase(name) && user.getPin().equalsIgnoreCase(Pin))return user.getAcctNo();}
        return null;
    }

    // for debit amount
    public boolean debitAmount(String accNo,double amount){
        // we will make it more dynamic for more users
        for(User user : arr){
        if(user.getAcctNo().equalsIgnoreCase(accNo)){
            double b = user.getBalance();
            if(b < amount)return false;
            user.updateBalance(b-amount);
            return true;}
        }
        return false;
    }
    // for credit amount
    public boolean creditAmount(String accNo,double amount){
        for(var user : arr){
            if(user.getAcctNo().equalsIgnoreCase(accNo)){
                double b = user.getBalance();
                user.updateBalance(b+amount);
            }
        }
        return true;
    }
    // method to get balance
    public double getBalance(String accNo){
        for(var user : arr){
            if(user.getAcctNo().equalsIgnoreCase(accNo)){
                double b = user.getBalance();
                return b;
            }
        }
        return 0;
    }

    // to change the PIN
    public boolean changePin(String accNo,String oldPin,String Pin){
        // we will make this dynamic on the bases of the user base
        for(var user : arr){
            if(user.getAcctNo().equalsIgnoreCase(accNo) && user.getPin().equalsIgnoreCase(oldPin)){
                user.updatePin(Pin);
                return true;
            }
        }
        return false;
    }

    //To create an Account use this API
    public String createAccount(String name,String pin,double b){
        Integer i = arr.size()+1;
        arr.add(new User(name, "999999", b, pin, i.toString()));
        return i.toString();
    }
}
