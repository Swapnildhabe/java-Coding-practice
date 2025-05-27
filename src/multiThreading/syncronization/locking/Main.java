package multiThreading.syncronization.locking;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                bankAccount.withdraw(50);
            }
        };
        Thread t1 = new Thread(task,"Thread t1");
        Thread t2 = new Thread(task, "Thread t2");
        t1.start();
        t2.start();
    }
}
