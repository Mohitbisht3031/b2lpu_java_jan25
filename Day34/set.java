package Day34;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set {
    public static void main(String[] args) {
        Set<Integer>st = new LinkedHashSet<>();
        Set<Integer>tst = new TreeSet<>();
        st.add(1);
        st.add(1);
        st.add(1);
        st.add(1);
        st.add(1);
        st.add(2);

        System.out.println(st.size());

        Iterator<Integer> it = st.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
