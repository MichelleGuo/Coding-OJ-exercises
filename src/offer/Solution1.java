package offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Stack;

/**
 * Created by ZeyingGuo on 2017/4/24.
 */
public class Solution1 {
    /**
     * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
     * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     */
    public boolean Find(int target, int [][] array) {
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(array[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
    /**
     * 请实现一个函数，将一个字符串中的空格替换成“%20”。
     * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
     */
    public String replaceSpace(StringBuffer str) {
        String input = str.toString();
        String output = input.replace(" ","%20");
        return output;
    }
    /**
     * 输入一个链表，从尾到头打印链表每个节点的值。
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(listNode == null){
            return result;
        }
        while(listNode!=null){
            result.add(listNode.val);
            listNode = listNode.next;
        }
        Collections.reverse(result);
        return result;
    }
    /**
     *输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
     * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
     * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
     */

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre==null || in==null){
            return null;
        }
        TreeNode root = reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
        return root;
    }
    private TreeNode reConstructBinaryTree(int []pre,int preStart,int preEnd,int[] in,
                                           int inStart,int inEnd){
        if(preStart>preEnd || inStart>inEnd){
            return null;
        }
        TreeNode root = new TreeNode(pre[preStart]);
        for(int i  =inStart;i<=inEnd;i++){
            if(in[i] == pre[preStart]){
                root.left = reConstructBinaryTree(pre,preStart+1,preStart+i-inStart,
                        in,inStart,i-1);
                root.right = reConstructBinaryTree(pre,preStart+i-inStart+1,preEnd,
                        in,i+1,inEnd);
            }
        }
        return root;
    }

    /**
     * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
     * key: 当入栈的时候，我们将它全放进栈1中，当需要出栈的时候，我们将栈1出栈到栈2中，然后再将栈2依次出栈。
     */
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    public void push(int node) {
        stack1.push(node);
    }
    public int pop() {
        Integer result = null;
        if(!stack2.empty()){
            result = stack2.pop();
        }
        else{
            while(!stack1.empty()){
                result = stack1.pop();
                stack2.push(result);
            }
            if(!stack2.empty()){
                result = stack2.pop();
            }
        }
        return result;
    }
    /**
     * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
     * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
     * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
     * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
     */
    public int minNumberInRotateArray(int [] array) {
        if(array==null){
            return  -1;
        }
        int l_index = 0;
        int r_index = array.length-1;
        int m_index = l_index;
        while(array[l_index]>=array[r_index]){
            if(r_index-l_index <=1){
                m_index = r_index;
                break;
            }
            m_index = (l_index + r_index)/2;
            if(array[l_index] == array[r_index] && array[m_index]==array[l_index]){
                return findMin(array,l_index,r_index);
            }

        }
    public int findMin(int[] arr,int lIndex,int rIndex){
        int result  = arr[lIndex];
        for(int i = lIndex+1;i<rIndex;i++){
            if(result>arr[i]){
                result = arr[i];
            }
        }
        return result;
    }

    }




}