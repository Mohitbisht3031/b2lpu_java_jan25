package Day27;

// custom ex class
class myEx extends Exception{
    myEx(String msg){
        super(msg);
    }
}

public class customEx {

    void div() throws myEx{
        try{
            int = 1/0;
        }catch(Exception ex){
            throw new myEx(ex.getMessage());
        }
    }
    public static void main(String[] args) {
        try{
            div();
        }catch(myEx ex){
            System.out.println("in th block of myEx");
        }catch(Exception ex){
            System.out.println("general exception");
        }
    }

}
