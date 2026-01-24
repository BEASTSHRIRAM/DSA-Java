package StackAndQueues;

public class CustomQueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue =new CustomQueue(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.diplay();
        System.out.println(queue.remove());
        queue.diplay();


    }
}
