package Day27;

public class assertion{
    public static void main(String[] args){
        int age = -1;
        assert age >=0 : "Age can't be -ve";
        System.out.println("age "+age);
    }
}