package Trees.questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//to find left side At each level, pick the first node. key consition if(i == 0) then add in list
public class leftView {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        System.out.println(leftSideView(root));
    }
    public static ArrayList<Integer> leftSideView(TreeNode root) {
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
                if(i==0){
                    yo.add(curr.val);
                }
                if(curr.left!=null)q.offer(curr.left);
                if(curr.right!=null)q.offer(curr.right);
            }
        }
        return yo;
    }
}
