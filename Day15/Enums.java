package Day15;

public class Enums {

enum Types{
    Savings("saving"),Current("current");
    private  String type;
    Types(String type){
        this.type = type;
    }
    public String getVal(){
        return type;
    }
}

    public static void main(String[] args) {
        System.out.println("value is "+Types.Savings);
    }
}
