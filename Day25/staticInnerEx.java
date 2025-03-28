package Day25;

class Outer{
    static class Inner{
        void display(){
            System.out.println("Inner static class");
        }
    }
}

public class staticInnerEx {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        obj.display();
    }
}
