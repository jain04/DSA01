package arrays;

public class search {
    public static void main(String[] args) {
        int[] a={22,4,56,7,9,0};
        int target=2;
        System.out.println(seachele(a,target));
    }

    static  int seachele(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                return 1;
            }
        }
        return -1;
    }
}
