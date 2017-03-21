package leetcode;

/**
 * Created by ZeyingGuo on 2016/10/5.
 */


public class maxDepth {
    public int MaxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int result=0;
        int l=MaxDepth(root.left);
        int r=MaxDepth(root.right);
        if(l>=r){
            result=l;
        }
        else
            result=r;
        return result+1;
    }
}
