package arrays;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {

        //swaping of two numbers of array

        int[] arr={1,3,7,9,10};
        swap_no(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }
    static void swap_no(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
