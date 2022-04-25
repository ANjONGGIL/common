package sort;

import java.util.*;

public class BaekJoon10814 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        Person[] p = new Person[N];


        for(int i = 0; i < N; i++) {
            p[i] = new Person(in.nextInt(), in.next());
        }


        Arrays.sort(p, new Comparator<Person>() {
            @Override
            public int compare(Person s1, Person s2) {
                return s1.age - s2.age;
            }

        });

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            sb.append(p[i]);
        }

        System.out.println(sb);

    }

    public static class Person {
        int age;
        String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return age + " " + name + "\n";
        }
    }
}
