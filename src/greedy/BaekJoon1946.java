package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Applicant implements Comparable<Applicant> {
    int refScore;
    int itvScore;

    public Applicant(int refScore, int itvScore) {
        this.refScore = refScore;
        this.itvScore = itvScore;
    }


    @Override
    public int compareTo(Applicant o) {
        if (this.refScore > o.refScore) {
            return 1;
        } else {
            return -1;
        }
    }
}


public class BaekJoon1946 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int testNo = in.nextInt();

        int testCase[] = new int[testNo];

        for (int i = 0; i < testCase.length; i++) {
            int N = in.nextInt();


            List<Applicant> applicants = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                int refScore = in.nextInt();
                int itvScore = in.nextInt();
                applicants.add(new Applicant(refScore, itvScore));
            }

            Collections.sort(applicants);

            int min = applicants.get(0).itvScore;
            int answer = 1;
            for (Applicant applicant : applicants) {
                if (applicant.itvScore < min) {
                    min = applicant.itvScore;
                    answer++;
                }
            }

            testCase[i] = answer;
        }

        for (int test : testCase) {
            System.out.println(test);
        }
    }
}
