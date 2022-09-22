public class MyPersonalRunnable implements Runnable{
    private char sign;
    private int count;

    public MyPersonalRunnable(char sign, int count){
        this.sign = sign;
        this.count = count;
    }

    @Override
    public void run() {
        for(int i = 0; i < count; i++){
            System.out.println(sign);
        }


    }
}
