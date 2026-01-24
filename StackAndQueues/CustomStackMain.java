package StackAndQueues;

public class CustomStackMain {
    public static void main(String[] args) throws StackException {
//        CustomStack stack =new CustomStack(5);
//        stack.push(34);
//        stack.push(44);
//        stack.push(54);
//        stack.push(64);
//        stack.push(74);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        DynamicStack ds=new DynamicStack();
        ds.push(1);
        ds.push(2);
        ds.push(3);
        ds.push(4);
        ds.push(5);
        ds.push(6);

        System.out.println(ds.pop());
        System.out.println(ds.pop());
        System.out.println(ds.pop());
        System.out.println(ds.pop());
        System.out.println(ds.pop());


    }
}
