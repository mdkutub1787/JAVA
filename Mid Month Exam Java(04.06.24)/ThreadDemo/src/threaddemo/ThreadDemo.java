package threaddemo;

public class ThreadDemo {

    public static void main(String[] args) {

        Runnable printA = new PrintChar('a', 100);
        Runnable printB = new PrintChar('b', 100);
        Runnable print100 = new PrintNum(100);
      

        Thread t1 = new Thread(printA);
        Thread t2 = new Thread(printB);
        Thread t3 = new Thread(print100);

        t1.start();
        t2.start();
        t3.start();
    }

}
