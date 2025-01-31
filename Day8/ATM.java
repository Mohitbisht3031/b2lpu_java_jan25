package Day8;
import Day7.middleAuth;
import java.util.Scanner;
import Day5.User;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You want to do cardless transaction ? (Yes/No):");
        String want = sc.nextLine();

        // 1. validate the i/p 
        // 2. based on the choice show or ask them for the input again!
        if(want.equalsIgnoreCase("yes")){
            middleAuth maObj = new middleAuth();
            System.out.println("Can you please given the accNo:");
            String accNo = sc.nextLine();
            System.out.println("Please provide the Pin:");
            String pin = sc.nextLine();

            String name = maObj.authForCardless(accNo, pin);
            if(name != null)System.out.println("Heloo "+name+"!");
            // give atm option and implement the class
            

        }else{
            System.out.println("else block for card based transactions!");
        }
     
        sc.close();
    }
}
