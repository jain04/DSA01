package maths;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input number:");
        int in=sc.nextInt();
        int c=pal(in);
        if(c==1){
            System.out.println("It is a palindrome");
        }else {
            System.out.println("It is not a palindrome");
        }
    }
    static int pal(int a){
        int rev=0;
        int d=a;
        while(a>0){
            int digit=a%10;
            rev=rev*10+digit;
            a=a/10;
        }
        if(rev==d){
            return 1;
        }
        return -1;
    }
}
