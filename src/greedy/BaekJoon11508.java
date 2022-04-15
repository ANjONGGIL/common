package greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BaekJoon11508 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(in.nextInt());
        }

        list.sort(Comparator.reverseOrder());

        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (i % 3 == 2) continue;
            sum += list.get(i);
        }

        System.out.println(sum);
    }
}
