package Basic;

import java.util.Scanner;

public class MultipleArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a size of 2D Array");
        System.out.println("Enter row size");
        int m=sc.nextInt();
        System.out.println("Enter column size");
        int n=sc.nextInt();

        int[][] a=new int[m][n];

        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Output");
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
