package Heaps;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Heap<Integer> list=new Heap<>();
        list.insert(34);
        list.insert(14);
        list.insert(24);
        list.insert(74);
        list.insert(24);
        System.out.println(list.heapSort());

    }
}
