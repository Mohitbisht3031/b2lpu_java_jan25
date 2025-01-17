package Day2;

import java.util.Scanner;

public class guess {
    public static int rand(){
        int ran = (int)((System.currentTimeMillis()%100)+1);
        return ran;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt(); //this is how we take the i/p in java
        // int ran = (int)((Math.random() % 100) + 1);// one way
        int ran = rand();
        if(!(val >=0 && val <= 100)){
            System.err.println("Sorry you have given a wrong input try again!");
            return;
        }
        int attempt = 1;
        while(1){
            if(val > ran){

            }else if(val < ran){

            }else{

            }
            System.out.println("Do you want to try again ?(1/0 ) ");
            int y = sc.nextInt();
            if(y == 0)break;
            System.out.println("give input");
            val = sc.nextInt();
            attempt++;
        }
        sc.close();
    }
}
