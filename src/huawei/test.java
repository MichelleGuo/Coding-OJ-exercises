package huawei;

import java.util.Scanner;

/**
 * Created by ZeyingGuo on 2017/3/24.
 */
public class test {
    /**
     * 用字符串模拟两个大数相加
     * @param n1 加数1
     * @param n2 加数2
     * @return   相加结果
     */
    public static String add2(String n1,String n2)
    {
        StringBuffer result = new StringBuffer();

        //1、反转字符串
        n1 = new StringBuffer(n1).reverse().toString();
        n2 = new StringBuffer(n2).reverse().toString();

        int len1 = n1.length();
        int len2 = n1.length();
        int maxLen = len1 > len2 ? len1 : len2;
        boolean nOverFlow = false; //是否越界
        int nTakeOver = 0 ; //溢出数量

        //2.把两个字符串补齐，即短字符串的高位用0补齐
        if(len1 < len2)
        {
            for(int i = len1 ; i < len2 ; i++)
            {
                n1 += "0";
            }
        }
        else if (len1 > len2)
        {
            for(int i = len2 ; i < len1 ; i++)
            {
                n2 += "0";
            }
        }

        //3.把两个正整数相加，一位一位的加并加上进位
        for(int i = 0 ; i < maxLen ; i++)
        {
            int nSum = Integer.parseInt(n1.charAt(i) +"") + Integer.parseInt(n2.charAt(i) +"");

            if(nSum >= 10)
            {
                if(i == (maxLen - 1))
                {
                    nOverFlow  = true;
                }
                nTakeOver = 1;
                result.append(nSum - 10);
            }
            else
            {
                nTakeOver = 0;
                result.append(nSum);
            }
        }

        //如果溢出的话表示位增加了
        if(nOverFlow)
        {
            result.append(nTakeOver);
        }
        return result.reverse().toString();
    }
//    public static void main(String[] args)
//    {
//
//        String str = add2("911","222");
//        System.out.println(str);
//    }
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a<1 || b<1 ||a>70000 ||b>70000) {
                System.out.println(-1);
//                return -1;
            }
            else{
                String str_a = String.valueOf(a);
                String str_b = String.valueOf(b);
                System.out.println(add2(str_a,str_b));
//                return reverseAdd(a,b);
            }
        }
    }
}
