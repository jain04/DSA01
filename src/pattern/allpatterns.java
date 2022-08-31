package pattern
;
public class allpatterns{
    public static void main(String[] args) {
        pattern11(5);
    }

    static void pattern(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int i = 0; i < n; i++) {
            for (int j = n; j >i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int i = 1; i < 2*n; i++) {
            int columncount=i > n ? 2*n-i:i;
            for (int j = 0; j < columncount; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
       
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

    static void pattern7(int n){
       
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <i; j++) {
                System.out.print(" ");
            }
            for (int l = n; l >=i; l--) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    static void pattern10(int n){
       
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    static void pattern11(int n){
       
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int l = n; l >= i; l--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }

}