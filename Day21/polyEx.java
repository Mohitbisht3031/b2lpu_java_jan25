package Day21;

public class polyEx {
    // method overloading 
    int max(int a,int b){
        return (a >= b ? a : b);
    }
    int max(int a,int b,int c){
        return max(max(a,b),c);
    }
    int max(int a,int b,int c,int d){
        return max(max(a,b,c),d);
    }

}
