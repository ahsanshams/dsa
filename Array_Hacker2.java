public class Array_Hacker2 {
    public static void main(String[] args) {
        int []arr1  = {5, 6, 7};
        int [] arr2  = {3, 6, 10};
        int alice =0;
        int bob = 0;
        for(int i=0; i< arr1.length; i++){

                if(arr1[i] > arr2[i]){
                    alice++;
                   System.out.println(alice);

                }
                else if(arr1[i] <  arr2[i]){
                    bob++;
                    System.out.println(bob + "  ");
                }
                else {
                    System.out.println("0" +     "  ");
                }

        }
       // System.out.println(alice + "  ");
        //System.out.println(bob + " ");


    }
}
