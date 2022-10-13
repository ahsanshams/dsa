public class Grade {
    public static void main(String[] args) {
        int [] arr = {84 , 29 ,  57 };
        for(int i =0; i<arr.length; i++){
            if(arr[i] < 38){
                System.out.println(arr[i]);
            }
            else if ((arr[i] % 5 ) >=  3){
                int x = arr[i] + 2;
                System.out.println(x);
            }
            //test case not run
            else{
                System.out.println(arr[i]);
            }
        }
    }
}
