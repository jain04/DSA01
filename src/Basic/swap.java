package Basic;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] arr={2,45,67,8,90,0};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap_no(arr,start,end);
            start++;
            end--;
        }

    }
    static void swap_no(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
