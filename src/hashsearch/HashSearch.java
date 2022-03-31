package hashsearch;

public class HashSearch {
    private int[] hash = null;
    private int size = 0;

    public HashSearch(int size){
        this.hash = new int[size];
        this.size = size;
    }

    public boolean set(int num){
        int idx = getEmpty(num);
        if (idx < 0){
            return false;
        }

        this.hash[idx] = num;

        return true;
    }

    private int getEmpty(int num){
        int idx = num % this.size;
        int i = 0;
        while (this.hash[idx] != 0){
            idx++;
            i++;
            if (idx == this.size){
                idx = 0;
            }

            if (i == this.size){
                return -1;
            }
        }

        return idx;
    }

    public static void main(String[] args) {
        int[] list = {1,21,3,23,5};
        HashSearch hashSearch = new HashSearch(list.length);

        for (int i =0; i < list.length; i++){
            hashSearch.set(list[i]);
        }

        for (int i =0; i < list.length; i++){
            System.out.println(hashSearch.hash[i]);
        }
    }

}
