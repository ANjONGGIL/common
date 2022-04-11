package sort;

import java.util.*;

public class BaekJoon10867 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        HashSet<Integer> hashSet = new HashSet<Integer>();

        for (int i = 0; i < N; i++) {
            hashSet.add(in.nextInt());
        }

        ArrayList<Integer> list = new ArrayList<Integer>(hashSet);
        Collections.sort(list);

        for (int a : list) {
            System.out.print(a + " ");
        }
    }
}
