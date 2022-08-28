package arrays;

public class mini {

    public static void main(String[] args) {
        int[] b={4,5,7,9,10,6,-2};
        System.out.println(min(b));
    }
    static int min(int[] a){
        int min1=a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]<min1){
                min1=a[i];
            }

        }
        return min1;

    }
}
