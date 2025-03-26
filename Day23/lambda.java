package Day23;

@FunctionalInterface
interface animal{
    void Speak();
}

public class lambda {
    public static void main(String[] args) {
        animal obj = () -> System.out.println("animal speaks");
        obj.Speak();
    }
}
