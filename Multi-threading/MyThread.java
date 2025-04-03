public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("This thread ran !!!");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread th = new MyThread();
        th.start();
    }
}