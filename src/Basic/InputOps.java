package Basic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InputOps {

    public static void main(String[] args) {
       int[] nums={1,2,3};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }
    public static void change(int[] arr){
        arr[0]=99;
    }
}
