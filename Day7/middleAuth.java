package Day7;
import Day5.User;

public class middleAuth {
    static final User user  = new User("Abhi", "9999999", 100000000.0,"1234");

    // auth method cardless transaction.
    public String authForCardless(String accNo,String Pin){
        // all the users to check the accNo
        if(user.getAcctNo().equalsIgnoreCase(accNo) && user.getPin().equalsIgnoreCase(Pin))return user.getUserName();
        return null;
    }

    // auth method for card
    public String authForCard(String name,String Pin){
        if(user.getUserName().equalsIgnoreCase(name) && user.getPin().equalsIgnoreCase(Pin))return user.getUserName();
        return null;
    }

    // for debit amount
    public boolean debitAmount(String accNo,double amount){
        // we will make it more dynamic for more users
        double b = user.getBalance();
        if(b < amount)return false;
        user.updateBalance(b-amount);
        return true;
    }
    // for credit amount
    public boolean creditAmount(String accNo,double amount){
        user.updateBalance(amount+user.getBalance());
        return true;
    }
    // method to get balance
    public double getBalance(String accNo){
        return user.getBalance();
    }

    // to change the PIN
    public boolean changePin(String accNo,String Pin){
        // we will make thios dynamic on the bases of the user base
        user.updatePin(Pin);
        return true;
    }
}
