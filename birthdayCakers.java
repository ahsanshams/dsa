public class birthdayCakers {
    public static void main(String[] args) {
        int [] arr = {4 , 4, 1 ,3};
        int count = 0;
        int max = arr[0];

        for(int i =1 ; i <=arr.length-1; i++) {
            if (  max > arr[i]) {
                arr[i] = max;
               count++;

            }


        }


        System.out.println(count);



    }
}
