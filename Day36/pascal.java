package Day36;

import java.util.ArrayList;

public class pascal {
    ArrayList<Integer> pascalTri(int n){
        ArrayList<Integer>arr = new ArrayList<>();
        if(n == 1){
            arr.add(1);
            return arr;
        }
        arr.add(1);
        arr.add(1);
        if(n == 2){
            return arr;
        }

        for(int i = 2;i<n;i++){
            ArrayList<Integer>c = new ArrayList<>();
            c.add(1);
            for(int j = 0;j<i;j++){
                c.add(arr.get(i)+arr.get(i-1));
            }
            arr =c;
        }
        return arr;
    }
}
