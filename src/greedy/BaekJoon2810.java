package greedy;

import java.util.Scanner;

public class BaekJoon2810 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        String sentence = in.next();
        int countL = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'L') countL++;
        }
        int answer = countL == 0 ? N : N - (countL / 2) + 1;
        System.out.println(answer);
    }
}
