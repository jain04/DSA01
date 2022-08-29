package maths;

import java.util.Scanner;

public class lastDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input number to get digit:");
        int in=sc.nextInt();
        System.out.println(digit(in));
    }
    static int digit(int a){
        int count=0;
        while(a>0){
            a=a/10;
            count++;
        }
        return count;
    }

}
