public class TimeBomb implements Runnable {
    int secsOnBomb;

    private Thread thread;

    public TimeBomb(int secsOnBomb) {
        this.secsOnBomb = secsOnBomb;
        thread = new Thread(this);
    }

    public int getSecsOnBomb() {
        return secsOnBomb;
    }

    public void setSecsOnBomb(int secsOnBomb) {
        this.secsOnBomb = secsOnBomb;
    }


    public void activate(){
        thread.setDaemon(true);
      thread.start();
    }

    @Override
    public void run() {
        for(int i = secsOnBomb; i > 0; i--){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Timebomb ticking: " + i + " seconds left");
        }
        System.out.println("Kabooooooom!!");
    }

    public void deactivate(){

        System.out.println("Disarmed");
    }
}
