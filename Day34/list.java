package Day34;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(1);
        l.add(1);
        l.add(1);
        l.add(1);
        l.add(1);

        for(int i  =0 ;i<l.size();i++){
            System.out.println(l.get(i));
        }

        List<Integer>ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        Iterator<Integer> it = ll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
