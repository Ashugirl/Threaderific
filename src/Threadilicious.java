public class Threadilicious {
    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> print('*', 1000));
        Thread thread2 = new Thread(() -> print('$', 100));
        //thread2.setDaemon(true);

        thread1.setName("T1");
        thread2.setName("T2");
        thread1.start();
        thread2.start();


        try {
            Thread.sleep(1000);
            thread1.interrupt();
            Thread.sleep(1000);
            thread2.interrupt();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        //print('@', 100);

//        //with implementing runnable
//        Thread thread2=new Thread(new MyPersonalRunnable('@', 1000));
//        Thread thread2=new Thread(new MyPersonalRunnable('+', 10000));
//
//        Thread thread3 = new Thread(() ->print('%', 1000));



        //with extending Thread
       // MyPersonalThread myPersonalThread = new MyPersonalThread('!', 1000);
        //MyPersonalThread myPersonalThread1 = new MyPersonalThread('?', 1000);



//start() is the only way to multithread. run() just calls the method and runs it consecutively.

        //thread2.start();
//        thread2.start();
//        thread2.setDaemon(true);
//        thread3.start();
//        try {
//            Thread.sleep(20000);
//            thread2.interrupt();
//            Thread.sleep(20000);
//            thread3.interrupt();
//        } catch (InterruptedException e) {
//            System.out.println(Thread.currentThread().getState());
//            System.out.println("Interrupted");
//        }

        //just calling method also won't multithread
       // print('#', 1000);
       // print('z', 1000);


    }

    public static void print(char sign, int count){
        for(int i = 0; i < count; i++){
            System.out.println(sign);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " is interrupted.");
            }
        }
    }
}
