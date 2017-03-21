package leetcode;

import sun.reflect.generics.tree.Tree;

import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by ZeyingGuo on 2017/3/21.
 * 145. Binary Tree Postorder Traversal
 */

public class binaryTree {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<Integer>();
        if(root == null){
            return result;
        }

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode temp = stack.peek();
            if(temp.left==null && temp.right==null){
                TreeNode pop = stack.pop();
                result.add(pop.val);
            }
            else{
                if(temp.right!=null){
                    stack.push(temp.right);
                    temp.right=null;
                }
                if(temp.left!=null){
                    stack.push(temp.left);
                    temp.left=null;
                }
            }
        }
        return result;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<Integer>();
        if(root == null){
            return result;
        }

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode temp = stack.peek();
            if(temp.left==null && temp.right==null){
                TreeNode pop = stack.pop();
                result.add(pop.val);
            }
            else{
                if(temp.right!=null){
                    stack.push(temp.right);
                    temp.right=null;
                }
                if(temp.left!=null){
                    stack.push(temp.left);
                    temp.left=null;
                }
            }
        }



        return result;

    }

}

// if(root!=null){
//         postorderTraversal(root.left);
//         postorderTraversal(root.right);
//         result.add(root.val);
//         }
//         return result;
