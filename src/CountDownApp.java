import java.time.LocalDateTime;

public class CountDownApp {
    public static void main(String[] args) {
        Thread thread = new Thread(new CountDown());
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
