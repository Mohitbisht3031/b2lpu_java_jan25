package Day24;

class MYThread implements Runnable{
    @Override
    public void run() {
        System.out.println("custom logic of thread from runnable interface class");
    }
}

public class runnableEx {
    public static void main(String[] args) {
        MYThread obj = new MYThread();
        Thread t = new Thread(obj);
        t.start();
    }
}
