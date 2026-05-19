package practice;

public class RaceCondition {
    //buggy code
//    private int balance=1000;
//    public synchronized void withdraw(int amount){
//        if(balance>=amount){
//            try {
//                Thread.sleep(10);
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
//            balance-=amount;
//            System.out.println(Thread.currentThread().getName()+" Withdrew "+amount+"balance is "+balance);
//        }
//    }
//    public void deposit(int amount){
//        if(amount<0){
//            return;
//        }
//        balance+=amount;
//        System.out.println(Thread.currentThread().getName() +
//                " deposited " + amount +"the updated balance is thankyou for using Shriram Finance"+balance);
//    }
//
//    public static void main(String[] args) throws InterruptedException{
//        RaceCondition shriramFinance=new RaceCondition();
//        Thread t1 = new Thread(() -> {
//            for (int i = 0; i < 3; i++) {
//                shriramFinance.withdraw(100);
//            }
//        }, "User1");
//
//        Thread t2 = new Thread(() -> {
//            for (int i = 0; i < 3; i++) {
//                shriramFinance.withdraw(100);
//            }
//        }, "User2");
//
//        t1.start();
//        t2.start();
//        t1.join();
//        t2.join();
//
//        System.out.println("Final balance: " + shriramFinance.balance);
//
//    }
    //correct code
static class Account {
    private int balance = 1000;

    // Solution 1: Add synchronized keyword
    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            try { Thread.sleep(10); } catch (InterruptedException e) {}
            balance -= amount;
            System.out.println(Thread.currentThread().getName() +
                    " withdrew " + amount + ", balance: " + balance);
        }
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() +
                " deposited " + amount + ", balance: " + balance);
    }

    public synchronized int getBalance() {
        return balance;
    }
}

    public static void main(String[] args) throws InterruptedException {
        Account account = new Account();

        Thread user1 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                account.withdraw(100);
            }
        }, "User1");

        Thread user2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                account.withdraw(100);
            }
        }, "User2");

        user1.start();
        user2.start();
        user1.join();
        user2.join();

        System.out.println("\nFinal balance: " + account.getBalance());
        System.out.println("Expected: 400");
    }
}
