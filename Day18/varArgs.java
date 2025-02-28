package Day18;

public class varArgs {
    static int sum(String s,int... v){
        int sum = 0;
        for(int e : v)sum+=e;
        return sum;
    }
    
    public static void main(String[] args) {
        System.out.println("sum of 2 numbers are "+sum("M",1,2));
        System.out.println("sum of 2 numbers are "+sum("M",1,2,3));
        System.out.println("sum of 2 numbers are "+sum("M",1,2,3,4));
        System.out.println("sum of 2 numbers are "+sum("M"));

    }
}
