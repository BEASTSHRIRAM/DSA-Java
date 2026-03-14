package Trees.questions;

import java.util.List;

import java.util.*;
public class rightView {
    // to find the right side you just need to traverse level by level and add the last element ie size-1 in the list
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        System.out.println(rightSideView(root));
    }
    public static ArrayList<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> yo=new ArrayList<>();
        if(root==null){
            return yo;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                if(i==size-1){
                    yo.add(curr.val);
                }
                if(curr.left!=null)q.offer(curr.left);
                if(curr.right!=null)q.offer(curr.right);
            }
        }
        return yo;
    }
}
