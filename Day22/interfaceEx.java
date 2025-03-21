package Day22;

interface Animal{
    void Speaks();
    void whatIsIt();
}

interface subAnimal{
    void Speaks();
    default void defaultMethod(){
        System.out.println("This is the default method");
    }
}

interface subAnimal2 extends Animal,subAnimal{}


class Dog implements subAnimal2{
    @Override
    public void Speaks() {
        System.out.println("dog barks!");
    }
    @Override
    public void whatIsIt() {
        System.out.println("It's a dog!");
    }
}

public class interfaceEx {
    
}
