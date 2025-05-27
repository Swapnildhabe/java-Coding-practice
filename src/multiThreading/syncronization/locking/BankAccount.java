package multiThreading.syncronization.locking;

public class BankAccount {
   private int balance = 100;

   public void withdraw(int amount){
       System.out.println(Thread.currentThread().getName()+ " Attempting to withdraw "+ amount);
       if(balance >= amount){
           try {
               System.out.println(Thread.currentThread().getName()+ " Proceeding with withdrawal");
               Thread.sleep(3000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
            balance -=amount;
       }
       else {
           System.out.println(Thread.currentThread().getName()+ " Insufficient Balance ");
       }
   }
}

