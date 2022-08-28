package arrays;

public class findDigit {
    public static void main(String[] args) {
        int[] arr={12,3,56,789,1234,3,456,78,2,5,78,90};
        System.out.println(dig(arr));
    }
    static int dig(int[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            int n=arr[i];
            if(even(n)){
                count++;
            }
        }

        return count;
    }

    static boolean even(int arr) {
        return last(arr) % 2==0;
    }

    static int last(int arr){
        int count=0;
        while(arr>0){
            count++;
            arr=arr/10;
        }
        return count;
    }

}
