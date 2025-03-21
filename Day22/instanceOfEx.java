package Day22;

class Animal{}
class Dog extends Animal{}

public class instanceOfEx {
    public static void main(String[] args) {
        Dog obj = new Dog();
        if(obj instanceof Animal)System.out.println("Yes");
        else System.out.println("No");
    }
}
