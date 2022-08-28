package arrays;

public class dimensionsearch {
    public static void main(String[] args) {
        int[][] b={
                {12,34,56,87},
                {0,45,6,7},
                {67,87,34,56,89},
                {65,78}
        };
        int tar=8;
        System.out.println(twoD(b,tar));
        System.out.println(max(b));
    }


    //searching a value from 2D array

    static int twoD(int[][] a,int target){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j]==target){
                    return 1;
                }
            }
        }
        return -1;
    }


    //finding a maximum value from a 2D array
    static int max(int[][] a){

        int m=a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j]>m){
                    m=a[i][j];
                }

            }

        }
        return m;
    }
}
