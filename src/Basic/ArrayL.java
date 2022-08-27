package Basic;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          ArrayList<ArrayList<Integer>> list=new ArrayList<>();

          //adding a element to a list of array
//        list.add(99);
//        list.add(100);
//        list.add(00);
//        list.add(22);
//        System.out.println(list);

        for (int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);


    }
}
