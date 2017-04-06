package huawei;

import java.lang.String;
import java.util.Scanner;

/**
 * Created by ZeyingGuo on 2017/3/24.
 */
public class Solution2 {
    public static int reverseAdd(int n1,int n2) {
        StringBuffer result = new StringBuffer();
        String str_a = String.valueOf(n1);
        String str_b = String.valueOf(n2);

        str_a = new StringBuffer(str_a).reverse().toString();
        str_b = new StringBuffer(str_b).reverse().toString();
        int len_a = str_a.length();
        int len_b = str_b.length();
        //2.把两个字符串补齐，即短字符串的高位用0补齐
        if (len_a < len_b) {
            for (int i = len_a; i < len_b; i++) {
                str_a += "0";
            }
        } else if (len_a > len_b) {
            for (int i = len_b; i < len_a; i++) {
                str_b += "0";
            }
        }
        int num_a = Integer.valueOf(str_a).intValue();
        int num_b = Integer.valueOf(str_b).intValue();

        if(num_a<1 || num_b<1 ||num_a>70000 ||num_b>70000) {
             return -1;
        }
        else{
            return num_a+num_b;
        }

//        for(int i =0;i<6;i++){
//            int nSum = Integer.parseInt(str_a.charAt(i);
//            if
//        }

    }
    public static int main(String[] args){
        Scanner sc = new Scanner(System.in);
        int result=0;
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a<1 || b<1 ||a>70000 ||b>70000) {
                //System.out.println(-1);
                result = -1;
            }
            else{
                //System.out.println(reverseAdd(a,b));
                result = reverseAdd(a,b);
            }
        }
        return result;
    }
}


