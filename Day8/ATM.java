package Day8;
import Day7.middleAuth;
import java.util.Scanner;
import Day5.User;

public class ATM {
    private static Scanner sc = null;
    private static middleAuth maObj = null ;
    private static void ATMOption(String accNo,String pin){
        // proivide options 
        // take input
        // perform the operation
        System.out.println("1. Check balance");
        System.out.println("2. Credit");
        System.out.println("3. Debit");
        System.out.println("4. Update pin");

        int opt = sc.nextInt();
        switch(opt){
            case 1 :
            System.out.println("checking balance...");
            break;
            case 2 :
            System.out.println("crediting...");
            break;
            case 3:
            System.out.println("debiting...");
            break;
            case 4:
            System.out.println("updating pin...");
            break;
            default:
            System.out.println("wrong option");
        }        
    }
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("You want to do cardless transaction ? (Yes/No):");
        String want = sc.nextLine();
        // 1. validate the i/p 
        // 2. based on the choice show or ask them for the input again!
        if(want.equalsIgnoreCase("yes")){
            maObj = new middleAuth();

            System.out.println("Can you please given the accNo:");
            String accNo = sc.nextLine();
            System.out.println("Please provide the Pin:");
            String pin = sc.nextLine();

            String name = maObj.authForCardless(accNo, pin);
            if(name != null)System.out.println("Heloo "+name+"!");
            else{
                System.out.println("you have provided the wrong information !!");
                System.exit(0);
            }
            // give atm option and implement the class
            ATMOption(accNo,pin);

        }else{
            // System.out.println("else block for card based transactions!");
            System.out.println("Can you please provide your name:");
            String name = sc.nextLine();
            System.out.println("Please enter the pin :");
            String pin = sc.nextLine();
            maObj = new middleAuth();
            String acctNo = maObj.authForCard(name, pin);
            if(acctNo == null){System.out.println( "You have provided the wrong information!");
                System.exit(0);
            }
            else System.out.println("Hello "+name+"!");
            // authenticate the user
            ATMOption(acctNo,pin);
        }
     
        sc.close();
    }
}
