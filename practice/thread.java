package practice;
//Basic Thread Creation is implemented here
public class thread {
    static class PrintThread implements Runnable{
        private String threadname;
        public PrintThread(String name){
            this.threadname=name;
        }
        public void run(){
            for (int i = 1; i <=5; i++) {
                System.out.println("thread name is "+threadname+":"+i);
                try{
                    Thread.sleep(1000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }

            }
        }
    }
    public static void main(String[] args) {
        //What is a Thread?
        //A thread is like a worker that executes code. You create it, tell it what code to run (in the run() method), and then start it.
        //Runnable Interface
        //Think of Runnable as a blueprint that says "this code can be run in a thread". It has one method: run().
        //start() vs run()
        //
        //thread.start() creates a new thread and calls run() inside it
        //thread.run() just calls the method directly (no new thread, wrong!)
        //
        //Thread.sleep(1000)
        //This pauses the thread for 1000 milliseconds (1 second).
        Thread thread1=new Thread(new PrintThread("Thread-1"));
        Thread thread2=new Thread(new PrintThread("Thread-2"));
        Thread thread3=new Thread(new PrintThread("Thread-3"));
        Thread thread4=new Thread(new PrintThread("Thread-4"));
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        System.out.println("All threads started!");

    }
}

