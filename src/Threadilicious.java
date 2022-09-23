public class Threadilicious {
    public static void main(String[] args) {

        Thread camera = new Thread(() -> print("Take picture", 100));
        Thread printer = new Thread(() -> print("Print picture", 100));
        camera.setDaemon(true);

        camera.setName("T1");
        printer.setName("T2");

        try {
            camera.start();
            camera.join(2000);
            printer.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



//        try {
//            Thread.sleep(1000);
//            thread1.interrupt();
//            Thread.sleep(1000);
//            printer.interrupt();
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
        //print('@', 100);

//        //with implementing runnable
//        Thread printer=new Thread(new MyPersonalRunnable('@', 1000));
//        Thread printer=new Thread(new MyPersonalRunnable('+', 10000));
//
//        Thread thread3 = new Thread(() ->print('%', 1000));



        //with extending Thread
       // MyPersonalThread myPersonalThread = new MyPersonalThread('!', 1000);
        //MyPersonalThread myPersonalThread1 = new MyPersonalThread('?', 1000);



//start() is the only way to multithread. run() just calls the method and runs it consecutively.

        //printer.start();
//        printer.start();
//        printer.setDaemon(true);
//        thread3.start();
//        try {
//            Thread.sleep(20000);
//            printer.interrupt();
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

    public static void print(String sign, int count){
        for(int i = 0; i < count; i++){
            System.out.println(i + " " + sign);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " is interrupted.");
            }
        }
    }
}
