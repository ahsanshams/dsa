public class Grade {
    public static void main(String[] args) {
        int [] arr = {84 , 29 ,  57 };
        int  percentage  ;
        for(int i =0; i<arr.length; i++){
            if(arr[i] >= 38){
                if(arr[i] %5 >=3){
                    arr[i] = arr[i] + (5 - arr[i]%5);
                    System.out.println(arr[i] );

                }
                else{
                    System.out.println(arr[i]);


                }

            }
            else{
                System.out.println(arr[i]);
            }

        }
    }
}
