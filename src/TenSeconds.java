import java.time.LocalDateTime;

public class TenSeconds {
    public static void main(String[] args) {
        Thread thread = new Thread(()->runClock());
        thread.start();
    }
    public static void runClock(){
        for(int i = 0; i<10; i++){
            System.out.println(LocalDateTime.now());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
