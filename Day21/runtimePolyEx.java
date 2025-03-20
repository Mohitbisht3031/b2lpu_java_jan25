package Day21;

class Animal{
    Animal(){
        System.out.println("AC");
    }
    void Speaks(){
        System.out.println("Animal Speaks");
    }
}

class Dog extends Animal{
    Dog(){
        System.out.println("DC");
    }
    // method overriding
    @Override //annotation -> nothing but a comment but a comment that is visible to the compiler
    void Speaks(){
        System.out.println("Dog barks!");
    }

    @Override
    public String toString() {
        return "Hey i'm coming from Dog class";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

public class runtimePolyEx {
    public static void main(String[] args) {
        Dog d = new Dog();
        Dog d2 = new Dog();
        d.Speaks();
        System.out.println(d.hashCode());
        System.out.println(d2.hashCode());

    }
}
