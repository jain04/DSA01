package Basic;

import java.util.Scanner;

public class Simple {
    public  static  void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int a=sc.nextInt();
        int arr[]= new int[a];

        System.out.println("Enter the elements in the array:");

        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Your Values are:");

//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
        for(int num:arr){
            System.out.println(num);
        }

    }
}
