package sort;

import java.util.Scanner;

/**
 * Created by ZeyingGuo on 2017/4/5.
 * 每一步将一个待排序的记录，按其顺序码大小插入到前面已经排序的序列的合适位置，直到全部插入排序完毕为止。
 * key:在前面已经排好序的序列中找到合适的插入位置
 */
public class insert {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()){
            String inStr = in.nextLine();
            String[] charStr = inStr.split(" ");
            System.out.println(charStr);
            int a[] = new int[charStr.length];
            for(int i = 0; i <a.length;i++){
                a[i] = Integer.parseInt(charStr[i]);
            }
            //output
            int[] result = directInsert(a);
            System.out.println(result);
        }
    }
    public static int[] directInsert(int[] a){
        int len = a.length;
        int j = 0;
        for(int i = 0;i<len;i++){
            int temp = a[i];
            for(j=i;j>0 && a[j-1]>temp;j--){
                a[j] = a[j-1];
            }
            a[j] = temp;
        }
        return a;
    }

    public static int[] binarySort(int[] a){
        for(int i = 0; i <a.length;i++){
            int mid = 0;
            int temp = a[i];
            int left=0;
            int right=i-1;
//            while(left<=right):
        }

        return a;
    }

    public static int[] quickSort(int[] a){
        int len = a.length;
        return a;
    }
}
