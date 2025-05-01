package Day39;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class topKfreq {
    public static void main(String[] args) {
        HashMap<Integer,Integer>mp = new HashMap<>();
        for(int e : arr){
            if(mp.containsKey(e)){
                mp.put(e, mp.get(e)+1);
            }else mp.put(e, 1);
        }
        // collection class utiliztion
        ArrayList<Integer>l = new ArrayList<>(mp.keySet());
        Collection.sort(l,(x,y) -> mp.get(x) - mp.get(y));
        ArrayList<Integer>ans = new ArrayList<>();
        for(int i = 0;i<k;i++){
            ans.add(l.get(i));
        }

        return ans;
    }
}
