package Day24;

class Animal{
    String name = "Animal";
    // innner class
    class Inner{
        void display(){
            System.out.println("The value of the name is "+name);
        }
    }
}

public class innerClassEx {
    public static void main(String[] args) {
        Animal obj = new Animal();
        Animal.Inner objI = obj.new Inner();
        objI.display();
    }
}
