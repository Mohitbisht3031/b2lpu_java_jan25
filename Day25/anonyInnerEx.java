package Day25;

interface ANimal{
    void speak();
}

public class anonyInnerEx {
    public static void main(String[] args) {
        // Anonymous inner class
        ANimal obj = new ANimal() {
            void speak(){
                System.out.println("Animal Speaks!");
            }
        };
        obj.speak();
    }
}
