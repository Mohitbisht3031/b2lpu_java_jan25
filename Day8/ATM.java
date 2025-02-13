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

        int c = 1;
        while(c >= 1){

            int opt = sc.nextInt();
            switch(opt){
                case 1 :
                    System.out.println("checking balance...");
                    double b= maObj.getBalance(accNo);
                    System.out.println("the current balance is "+b);
                break;
                case 2 :
                    System.out.println("crediting...");
                    int amount = sc.nextInt();
                    boolean f = maObj.creditAmount(accNo, amount);
                    if(f)System.out.println(amount+" creditied , updated balance is "+maObj.getBalance(accNo));
                    else System.out.println("Sorry, having issue while crediting. Try again!");
                break;
                case 3:
                    System.out.println("debiting...");
                    amount = sc.nextInt();
                    f = maObj.debitAmount(accNo, amount);
                    if(f)System.out.println(amount+" debited, updated balance is "+maObj.getBalance(accNo));
                    else System.out.println("Sorry, having issue while debiting, check balance before trying again!");
                break;
                case 4:
                    System.out.println("updating pin...");
                    String nPin = sc.nextLine();
                    if(maObj.changePin(accNo, pin, nPin))System.out.println("Pin updated");
                    else System.out.println("error while updating the pin, try again later!");
                break;
                default:
                System.out.println("wrong option");
            }       
            sc.nextLine();
            System.out.println("Do you want to continue ?(y/n) : ");
            String ip = sc.nextLine();
            if(ip.equalsIgnoreCase("n"))System.exit(0);
        }
    }
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer("1. You want to do cardless transaction ?");
        sb.append( "(Yes/No):");
        System.out.println(sb.toString());
        System.out.println("2. Do you want to card transaction ?");
        System.out.println("3. Do you want to open an account ?");
        String want = sc.nextLine();
        // 1. validate the i/p 
        // 2. based on the choice show or ask them for the input again!
        if(want.equalsIgnoreCase("1")){
            maObj = new middleAuth();
            System.out.println("Can you please given the accNo:");
            String accNo = sc.nextLine();
            System.out.println("Please provide the Pin:");
            String pin = sc.nextLine();

            String name = maObj.authForCardless(accNo, pin);
            if(name != null)System.out.println("Heloo "+name+"!");
            else if(want.equalsIgnoreCase("2")){
                System.out.println("you have provided the wrong information !!");
                System.exit(0);
            }else if(want.equalsIgnoreCase("3")){
                maObj.createAccount();
            }else{
                System.out.println("Wrong option");
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
