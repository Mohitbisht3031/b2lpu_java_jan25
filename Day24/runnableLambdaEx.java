package Day24;

public class runnableLambdaEx {
    public static void main(String[] args) {
        // Runnable obj = () -> System.out.println("From lambda expression of the interface");
        // Thread t = new Thread(obj);
        Thread t = new Thread(() -> System.out.println("from the lambda of the thread"));
        t.start();
    }
}
