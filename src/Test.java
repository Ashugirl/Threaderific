class Thrd implements Runnable{


    @Override
    public void run() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();        }
        System.out.println("State of thread1 while it called join() method on thread2: " + Test.thread1.getState());
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


public class Test implements Runnable{
    public static Thread thread1;
    public static Test obj;

    public static void main(String[] args) {
        obj = new Test();
        thread1 = new Thread(obj);
        System.out.println("State of thread1 after creating it: " + thread1.getState());
        thread1.start();
        System.out.println("State of thread1 after calling .start() method on it: " + thread1.getState());
    }
    public void run(){
        Thrd thrd = new Thrd();
        Thread thread2 = new Thread(thrd);
        System.out.println("State of thread2 after creating it: " + thread2.getState());
        thread2.start();
        System.out.println("State of thread2 after calling .start() method on it: " + thread2.getState());
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();        }
        System.out.println("State of thread2 after calling sleep on it: " + thread2.getState());
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();        }
        System.out.println("State of thread2 when it has finished execution: " + thread2.getState());
    }

}

