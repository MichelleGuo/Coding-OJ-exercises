package leetcode;

/**
 * leetcode day1
 * Created by ZeyingGuo.
 */
public class ReverseString {

    public static String reverseString(String s) {
        char[] target = s.toCharArray();
        char[] temp = new char[target.length];
        int stringLen = target.length-1;
        for(int i=0;i<=stringLen;i++){
            temp[i]=target[stringLen-i];
        }
        System.out.println(temp);
        return new String(temp);
    }

    public static void main(String[] args){
        reverseString("12345");
    }


}
