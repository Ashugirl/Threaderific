import java.util.Random;

public class VillainSpot {
    public static void main(String[] args) {

        Random random = new Random();
        TimeBomb timeBomb = new TimeBomb(10);
        timeBomb.activate();
        try {
            Thread.sleep(random.nextInt(30000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timeBomb.deactivate();
    }
}
