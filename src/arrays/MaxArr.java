package arrays;

import java.util.Scanner;



public class MaxArr {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=s.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the values:");
        for (int i = 0; i < n; i++) {
            a[i]=s.nextInt();

        }
        System.out.println(max(a));
    }
    static int max(int[] a){
        int max_value=a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max_value){
                max_value=a[i];
            }
        }
        return max_value;
    }
}
