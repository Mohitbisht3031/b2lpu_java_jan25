package Day34;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class map {
    public static void main(String[] args) {
        Map<String,Integer> mp = new LinkedHashMap<>();
        Map<String,Integer> mp = new TreeMap<>();
        mp.put("Mohit",1);
        mp.put("Raj", 2);
        mp.get("Mohit");
        mp.remove("Mohit");
        // for each look
        Set<String> stOfKeys = mp.keySet();
        for(String s : stOfKeys){
            System.out.println(mp.get(s));
        }

        for(Set<String> st : mp.values()){
            System.out.println(st);
        }
    }
}
