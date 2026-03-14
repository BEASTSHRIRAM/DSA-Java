package Trees.questions;

import java.util.*;

public class TopViewOfBT {
    // Top View Logic:
// Maintain horizontal distance (hd) for each node.
// left child  -> hd - 1
// right child -> hd + 1
// Using BFS ensures the first node at each hd is the top view node.
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        System.out.println(topView(root));
    }

    public static ArrayList<Integer> topView(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<>();

        if(root == null) return list;

        Queue<TreeNode> q = new LinkedList<>();
        Queue<Integer> hdq = new LinkedList<>();

        TreeMap<Integer,Integer> map = new TreeMap<>();

        q.add(root);
        hdq.add(0);

        while(!q.isEmpty()){

            TreeNode curr = q.poll();
            int hd = hdq.poll();

            if(!map.containsKey(hd)){
                map.put(hd, curr.val);
            }

            if(curr.left != null){
                q.add(curr.left);
                hdq.add(hd - 1);
            }

            if(curr.right != null){
                q.add(curr.right);
                hdq.add(hd + 1);
            }
        }

        for(int val : map.values()){
            list.add(val);
        }

        return list;
    }
}