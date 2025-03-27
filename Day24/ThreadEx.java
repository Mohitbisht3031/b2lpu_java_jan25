package Day24;

class myThread extends Thread{
    @Override
    public void run() {
        System.out.println("Inside the custom logic of custom thread class");
    }
}

public class ThreadEx {
    public static void main(String[] args) {
        myThread obj = new myThread();
        System.out.println("before starting the thread");
        obj.start();
    }
}
