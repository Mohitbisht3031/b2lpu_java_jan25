package Day19;
import java.util.*;
public class secondLargest {
    // O(nlogn)
    int secondLargest(ArrayList<Integer>arr){
        if(arr.size() <= 1)return -1;
        // Arrays.sort(arr); //permitive array
        Collections.sort(arr);
        return arr.get(arr.size()-2);
    }
    // O(n)
    int secondLargest2(ArrayList<Integer>arr){
        if(arr.size() < 1)return -1;
        int l = arr.get(0);
        int sl = arr.get(0);
        for(int i = 1;i<arr.size();i++){
            if(arr.get(i) > l){
                sl = l;
                l = arr.get(i);
            }else if(arr.get(i) > sl){
                sl = arr.get(i);
            }
        }
        return sl;
    }

}
