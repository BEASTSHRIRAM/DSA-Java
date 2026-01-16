package LinkedList;

public class Linked {
    public static void main(String[] args) {
        //TESTING SLL
//        LL list=new LL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(2);
//        list.insertFirst(17);
//        list.insertFirst(17);
//        list.insertFirst(2);
////        list.insertLast(99);
////        list.insert(100,3);
////        System.out.println(list.deletefirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));
//        list.display();
//        System.out.println(list.find(3));
//TESTING DOUBLY LINKED LIST
//        DLL list=new DLL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.insertLast(99);
//        list.insert(3,18);
//        list.display();
        //testing CLL
//        CLL list=new CLL();
//        list.insert(23);
//        list.insert(9);
//        list.insert(19);
//        list.insert(75);
//        list.display();
//        list.insertRec(88,1);
//        list.duplicate();
//        list.display();
        LL l1=new LL();
        LL l2=new LL();
        l1.insertLast(1);
        l1.insertLast(2);
        l1.insertLast(4);
        l2.insertLast(1);
        l2.insertLast(3);
        l2.insertLast(4);
        LL ans= LL.merge(l1,l2);
        ans.display();
    }
}