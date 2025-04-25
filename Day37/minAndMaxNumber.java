package Day37;

import java.util.PriorityQueue;

public class minAndMaxNumber {
    public static void main(String[] args) {
        PriorityQueue<Integer>pq = new PriorityQueue<>(); // min heap
        PriorityQueue<Integer>maxPq = new PriorityQueue<>((a,b) -> b - a);
        for(int e : arr){
            pq.add(e);
            maxPq.add(e);
        }

        int min = pq.poll();
        int max = maxPq.poll();

        return min;
    }
}
