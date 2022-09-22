import java.time.LocalDateTime;

public class CountDown implements Runnable {
    LocalDateTime localDateTime = LocalDateTime.now();


    @Override
    public void run() {
            for(int i = 0; i < 10; i++){
                System.out.println("At the beep, the time will be: " + LocalDateTime.now());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}
