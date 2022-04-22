package binarysearch;

import java.util.*;

public class BaekJoon1300 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int K = in.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++){
                list.add(i*j);
            }
        }

        list.sort(Comparator.naturalOrder());
        System.out.println(list.get(K+1));
    }
}
