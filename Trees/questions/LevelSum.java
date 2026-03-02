package Trees.questions;

import Trees.BST;

//find the sum of every level in the BST
public class LevelSum {
    public static void main(String[] args) {
        BST tree =new BST();
        tree.insert(2);
        tree.insert(3);
        tree.insert(5);
        tree.insert(2);
        tree.insert(1);
//        tree.LevelSum();
        tree.level();
    }
}
