package Day22;

abstract class Animal{
    void whatIsIt(){
        System.out.println("it'a living animal");
    }
    abstract void Speaks();
}

class Dog extends Animal{
    @Override //
    void Speaks(){
        System.out.println("Dog barks!");
    }
}

public class absClassEx {
    
}
