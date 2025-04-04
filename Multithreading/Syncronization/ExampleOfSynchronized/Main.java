package Multithreading.Syncronization.ExampleOfSynchronized;

public class Main {
    public static void main(String[] args) {
        
        BankAccount sbi= new BankAccount();

        Runnable task =()-> sbi.withdraw(100);

        Thread t1= new Thread(task, "Thread 1");
        Thread t2= new Thread(task,"Thread 2");

        t1.start();
        t2.start();
    }
    
}
