package Day25;

import java.io.IOException;
import java.sql.SQLException;

public class tryCatch {
    static void divide() throws Exception{
        try{
            int r = 10/0;
            System.out.println("Result is "+r);
        }catch(Exception ex){
            System.out.println("the error is "+ex.getStackTrace());
            throw ex;
        }
    }
    public static void main(String[] args) {
        try{
            divide();
        }catch(IOException ex){

        }catch(SQLException ex){

        } catch(Exception ex){
            System.out.println("in main"+ex);
        }finally{
            System.out.println("in the finally block");
        }
    }
}
