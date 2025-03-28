package Day25;

class ANIMAL{
    void speak(){
        // Local inner class
        int val = 5;
        class DOG{
            void say(){
                System.out.println("Dog barks!");
                System.out.println("the value of val is "+val);
            }
        }
        DOG obj = new DOG();
        obj.say();
    }
}

public class localInnerEx {
    
}
