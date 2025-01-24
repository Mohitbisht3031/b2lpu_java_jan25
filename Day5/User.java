package Day5;

public class User {
    String name;
    String phnNo;
    String accNo;
    double balance;

    User(String name,String phnNo,double balance){
        this.name = name;
        this.phnNo = phnNo;
        this.balance = balance;
    }

    // getter methods
    String getUserName(){
        return name;
    }
    String getUserPhnNo(){
        return phnNo;
    }
    String getAcctNo(){
        return accNo;
    }
    double getBalance(){
        return balance;
    }

    // setter methods
    void setName(String n){
        name = n;
    }
    void updatePhnNo(String str){
        phnNo = str;
    }
    void setAccNo(String no){
        accNo = no;
    }
    void updateBalance(double b){
        balance = b;
    }

}
