package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Reference implements Comparable<Reference> {
    public int startTime;
    public int endTime;

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    @Override
    public int compareTo(Reference o) {
        if (this.getEndTime() == o.getEndTime()){
            return this.getStartTime() - o.getStartTime();
        }

        return this.getEndTime() - o.getEndTime();
    }
}

public class BaekJoon1931 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        List<Reference> references = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            Reference reference = new Reference();

            reference.setStartTime(in.nextInt());
            reference.setEndTime(in.nextInt());

            references.add(reference);
        }

        Collections.sort(references);

        int count = 0;
        int preEndTime = 0;
        for (int i = 0; i < N; i++) {
            if (preEndTime <= references.get(i).getStartTime()) {
                preEndTime = references.get(i).getEndTime();
                count++;
            }
        }

        System.out.println(count);
    }
}
