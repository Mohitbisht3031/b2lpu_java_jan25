package Day30;

import java.util.ArrayList;

// Generic class
// class Cal<T>{
//     T v1;
//     T v2;

//     void print_numbers(){
//         System.out.println("numbers are "+v1+" , "+v2);
//     }
// }

// bounded type generics
// class Cal<T extends Number>{
//     T v1;
//     T v2;

//     void print_numbers(){
//         System.out.println("numbers are "+v1+" , "+v2);
//     }
// }

public class generics {
    // Generic method looks like!
    // public <T> void print_val(T arr[]){
    //     for(var e : arr)System.out.println(e);
    // }

    // wild card
    public <?> void print_val(? arr[]){
        for(var e : arr)System.out.println(e);
    }



    public static void main(String[] args) {
        Cal<Integer> obj = new Cal();
        ArrayList<Integer> arr = new ArrayList<>();
    }    
}
