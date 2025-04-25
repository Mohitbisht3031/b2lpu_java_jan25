package Day37;

import java.util.ArrayList;

public class missing {
    int missing(ArrayList<Integer>arr){
        int n = arr.size();
        int ts = (n*(n+1))/2;
        int cs = 0;
        for(int e : arr)cs+=e;
        return ts-cs;
    }
}
