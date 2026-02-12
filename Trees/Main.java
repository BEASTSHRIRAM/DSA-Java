package Trees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        BinaryTree tree =new BinaryTree();
//        tree.populate(scanner);
////        tree.display();
//        BST tree =new BST();
//        int[] nums={2,4,5,6,8,9,10};
//        tree.populateSorted(nums);
//        tree.display();
        AVL tree=new AVL();
        for(int i=0;i<1000;i++){
            tree.insert(i);
        }
        System.out.println(tree.height());
    }
}
