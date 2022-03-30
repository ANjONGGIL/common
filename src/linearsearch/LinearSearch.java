package linearsearch;

public class LinearSearch {
    /*
     * 선형 탐색 알고리즘
     *
     * 맨 앞이나 맨 뒤부터 순서대로 하나하나 찾는 알고리즘 입니다.
     * 가장 단순하고 간단한 탐색 알고리즘입니다.
     *
     * 맨끝부터 하나하나 원하는 값을 찾아본다.
     * 원하는 값을 찾으면 탐색을 종료한다.
     *
     * 시간 복잡도
     *
     * BEST : 1번
     * WORST : N번
     *
     * 시간복잡도 O(n)
     * */
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 45, 63, 66};
        int key = 63;

        int answer = search(list, key);

        System.out.println(answer);
    }

    public static int search(int[] list, int key) {
        int i = 0;
        while (true) {
            if (list[i] == key) {
                return i;
            }

            if (list.length == i) {
                return -1;
            }

            i++;
        }
    }
}
