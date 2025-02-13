package Day12;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        // static in nature
        int arr[] = {1,2,3,4,5};
        int arr2[] = new int[]{1,2,3,4,55};
        int arr3[] = new int[5];
        // for(int i = 0 ;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        ArrayList<Integer> arl = new ArrayList<Integer>();
        arl.add(10);
        arl.add(5);
        arl.set(0, 50);
        for(int i = 0;i<arl.size();i++){
            System.out.println(arl.get(i));
        }
    }   
}
