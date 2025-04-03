package Day27;

public class output {
    public static void main(String[] args) {
        try{
            int n = 10/1;
            System.exit(1);
        }catch(Exception ex){
            System.out.println("exception caught"+ex);
        }finally{
            System.out.println("We are in the finally block");
        }
    }
    
}