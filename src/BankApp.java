public class BankApp {
    public static void main(String[] args) {

    BankAccount bankAccount = new BankAccount();
    Thread getMoney1 = new Thread(() -> addMoney(bankAccount, 10000));
    Thread getMoney2 = new Thread(() -> addMoney(bankAccount, 10000));
    getMoney1.start();
    getMoney2.start();

        try {
            getMoney1.join();
            getMoney2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(bankAccount.getAmountEuros());

    }


    public static void addMoney(BankAccount bankAccount, int money){
        for(int i = 0; i < money; i++){
            bankAccount.addMoney();
        }
    }
}

