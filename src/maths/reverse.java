package maths;

import java.util.Scanner;


//reversing a number
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input number:");
        int in=sc.nextInt();
        System.out.println(rev(in));
    }
    static int rev(int a){
        int rev=0;
        while(a>0){
            int digit=a%10;
            rev=rev*10+digit;
            a=a/10;
        }
        return rev;
    }
}
