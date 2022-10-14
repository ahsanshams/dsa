public class Apple_orange {
    public static void main(String[] args) {
        int [] apple = { 2 ,3 ,-4};
        int [] orange = { 3 , -2 , -4};
        int s = 7;
        int t  = 10;
      //  int [] temp_A = { };
      //  int [] tem_o = {};
        //apple (a)
        int apple_in_house =0;
        int orange_in_house = 0;
        int  a = 4  ;
        // orange (b)
        int b = 12;
        for(int i =0; i<apple.length; i++){
            apple [i] = apple[i] + a ;
            orange [i] = orange[i] + b;

        }
        for(int j = 0; j< apple.length; j++){
            if((apple[j] >= 7 )&& (apple[j] <= 10)){
                apple_in_house++;

            }
            if((orange[j] >= 7 )&& (orange[j] <= 10)){
                orange_in_house++;

            }
        }
        System.out.println(apple_in_house);
        System.out.println(orange_in_house);



    }
}
