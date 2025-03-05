package Day19;

import java.util.ArrayList;
import java.util.Collections;

public class rotateBy1 {
    ArrayList<Integer> rotateBy1(ArrayList<Integer>arr){
        Collections.rotate(arr, 1);
        return arr;
    }
    ArrayList<Integer> rotateBy1(ArrayList<Integer>arr){
        if(arr.size() <= 1)return arr;
        int v = arr.get(arr.size()-1);
        for(int i = arr.size()-1;i>=0;i--){
            arr.get(i) = arr.get(i-1);
        }
        arr.set(0, v);
        return arr;
    }
}
