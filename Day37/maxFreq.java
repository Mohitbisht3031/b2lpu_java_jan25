package Day37;

import java.util.ArrayList;
import java.util.HashMap;

public class maxFreq {
    int macFreq(ArrayList<Integer>arr){
        HashMap<Integer,Integer>mp = new HashMap<>();
        int maxi = 0;
        for(int e : arr){
            if(mp.containsKey(e)){
                int v = mp.get(e);
                // mp.remove(e);
                mp.put(e, v+1);
                maxi = Math.max(maxi, mp.get(e));
            }else mp.put(e, 1);
        }

        return maxi;
    }
}
