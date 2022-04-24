package binarysearch;

import java.util.*;

public class BaekJoon1920 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] listN = new int[N];
        for (int i = 0; i < N; i++) {
            listN[i] = in.nextInt();
        }

        Arrays.sort(listN);

        int M = in.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            if (binarySearch(listN,in.nextInt()) >= 0){
                sb.append(1).append('\n');
            }else{
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static int binarySearch(int[] list,int key){
        int low = 0;
        int high = list.length - 1;

        while (high >= low){
            int mid = (low + high) / 2;

            if (key == list[mid]) {
                return mid;
            } else if (key > list[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
