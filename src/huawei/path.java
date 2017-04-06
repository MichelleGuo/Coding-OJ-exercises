package huawei;

import java.util.Scanner;

/**
 * Created by ZeyingGuo on 2017/3/24.
 */
public class path {

    public static int dijkstra(int[][] W1, int from, int to) {
        boolean[] isLabel = new boolean[W1[0].length];
        int[] indexs = new int[W1[0].length];
        int i_count = -1;
        int[] distance = W1[from].clone();
        int index = from;
        int shortest = 0;

        indexs[++i_count] = index;
        isLabel[index] = true;

        while (i_count<W1[0].length) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < distance.length; i++) {
                if (!isLabel[i] && distance[i] != -1 && i != index) {
                    if (distance[i] < min) {
                        min = distance[i];
                        index = i;
                    }
                }
            }
            if (index == to) {
                break;
            }
            isLabel[index] = true;
            indexs[++i_count] = index;
            if (W1[indexs[i_count - 1]][index] == -1
                    || shortest + W1[indexs[i_count - 1]][index] > distance[index]) {

                shortest = distance[index];
            } else {
                shortest += W1[indexs[i_count - 1]][index];
            }

            for (int i = 0; i < distance.length; i++) {

                if (distance[i] == -1 && W1[index][i] != -1) {
                    distance[i] = shortest + W1[index][i];
                } else if (W1[index][i] != -1
                        && shortest + W1[index][i] < distance[i]) {
                    distance[i] = shortest + W1[index][i];
                }

            }
        }
        return distance[to] - distance[from];
    }

    public static int main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x =0;
        int y =0;
        int[][] W={
                {0,2,10,5,3,-1},
                {-1,0,12,-1,-1,10},
                {-1,-1,0,-1,7,-1},
                {2,-1,-1,0,2,-1},
                {4,-1,-1,1,0,-1},
                {3,-1,1,-1,2,0}};
        while (sc.hasNextInt()) {
            x = sc.nextInt();
            y = sc.nextInt();
        }
        return dijkstra(W,x,y);

    }
}
