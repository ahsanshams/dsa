public class second_largest {
    public static void main(String[] args) {
        int [] a = {20 , 23 , 90 , 100 , 22};
        int  largestNo = a[0];
        int secondNo = a[1];
        for(int i =0; i<a.length; i++){
            if(a[i] > largestNo ){
                secondNo = largestNo;
                largestNo = a[i];



            }
            else  if((a[i] > secondNo ) && a[i]!= largestNo){
                secondNo = a[i];

            }
        }
        System.out.println("Second largest no is  :  " + secondNo );
    }
}
