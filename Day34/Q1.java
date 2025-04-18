package Day34;

import java.util.HashMap;
import java.util.Map;

public class Q1 {
    int MajorityElement(int nums[]){
        Map<Integer,Integer>mp = new HashMap<>();
        for(var e : nums){
            if(mp.containsKey(e)){
                int v = mp[e];
                mp.remove(e);
                mp[e] = v+1;
            }else{
                mp.put(e,1);
            }
        }
        Set<Integer>ks = mp.keySet();
        for(Integer k : ks){
            if((mp.get(k))/2 >= h)return k;
        }
        return -1;
    }
    public static void main(String[] args) {
        
    }
}
