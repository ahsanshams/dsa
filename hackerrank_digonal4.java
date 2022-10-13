import  java.util.*;
public class hackerrank_digonal4 {
    public static void main(String[] args) {
        int [] [] arr = {{1, 2, 3} , {4, 5, 6} , {9, 8, 9}

        };
        int sum1=0;
        int sum2 = 0;
         int sub =0;
         int i=0;
         int j =0;

        for( i=0; i<arr.length; i++){
            for( j=0; j<arr.length; j++)
            if (i ==j) {
                sum1 = sum1 + arr[i][j];

            }
            else if(i+j == arr.length-1){
                sum2 = sum2 +  arr[i][j];
            }






        }
        System.out.println(sum1);
        System.out.println(sum2);
        sub = sum1 -sum2;
        System.out.println(Math.abs(sub));



    }
}
