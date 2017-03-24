package onlieJudge;

import java.util.Scanner;

/**
 * Created by ZeyingGuo on 2017/3/24.
 * 写出一个程序，接受一个十六进制的数值字符串，输出该数值的十进制字符串。（多组同时输入 ）
    输入描述:
    输入一个十六进制的数值字符串。

    输出描述:
    输出该数值的十进制字符串。
 */
public class Hex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next().substring(2);
            Integer result = Integer.parseInt(str, 16);
            System.out.println(result);
        }
    }
}