public class BankAccount {
    private int amountEuros;
    //Ways to make an app thread safe:
    // 1)object keeps track of which thread is running (it's like the talking stick - token gets passed from one thread to the other when it's ready.)
    //private Object token = new Object();

    public synchronized void addMoney(){// 3) add "synchronized" as method modifier
        //2)synchronized (this){
        //1)synchronized (token){
        amountEuros++;
    }

    public synchronized void removeMoney(){
        amountEuros--;
    }

    public int getAmountEuros() {
        return amountEuros;
    }
}
