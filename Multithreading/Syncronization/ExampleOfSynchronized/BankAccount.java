package Multithreading.Syncronization.ExampleOfSynchronized;

public class BankAccount {

    private int balance=50000;

    public  synchronized void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+" attempting to withdraw "+ amount);

        if(balance>=amount){
            System.out.println(Thread.currentThread().getName()+" proceeding with withdrawal");
            balance-=amount;

            try{
                Thread.sleep(3000);

            }
            catch(InterruptedException e){
                e.printStackTrace();

            }
            

        }
        else{
            System.out.println(Thread.currentThread().getName()+" insufficient balance");
        }
    }
    
}
