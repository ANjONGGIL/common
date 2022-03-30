package binarysearch;

public class BinarySearch {
    /*
     * 이진 탐색 알고리즘
     * 중간 지점을 기준으로 데이터를 반씩 나눠서 탐색하는 알고리즘입니다.
     *
     * 중간지점을 선택한 뒤, 중간지점을 기준으로 왼쪽 혹은 오른쪽 부분만 남깁니다.
     * 남긴 부분 중에서 다시 중간지점을 선택한 뒤, 왼쪽 혹은 오른쪽만 남긴다.
     * 위 과정을 원하는 값을 찾을 때까지 반복한다.
     *
     * BEST : 1번
     * WORST :  log2(n)번
     *
     * 시간 복잡도 : O(logn)
     *
     * */
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 45, 63, 66};
        int key = 63;

        int answer = search(list, key, 0, list.length - 1);

        System.out.println(answer);
    }

    public static int search(int[] list, int key, int low, int high) {
        int mid;

        if (low <= high) {
            mid = (low + high) / 2;

            if (key == list[mid]) {
                return mid;
            } else if (key > list[mid]) {
                search(list, key, mid + 1, high);
            } else {
                search(list, key, low, mid - 1);
            }
        }

        return -1;
    }
}
