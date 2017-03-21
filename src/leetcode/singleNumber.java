package leetcode;

/**
 * Created by ZeyingGuo on 2016/9/13.
 */
public class singleNumber {
    public int singleNum(int[] nums){
        int temp=0;
        for (int i:nums){
            temp ^=i;
        }
        return temp;
    }
}
