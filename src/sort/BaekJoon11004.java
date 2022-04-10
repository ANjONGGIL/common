package sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaekJoon11004 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int K = in.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++){
            int element = in.nextInt();
            list.add(element);
        }

        list.sort( (a, b) -> a.compareTo( b ) );

        System.out.println(list.get(K-1));
    }
}
