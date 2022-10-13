public class HackerRankApple_orange {
    public static void main(String[] args) {
        int s = 4;
        int t = 12
                ;
        int [] apple = {2, 3 ,-4};
        int [] orange = {3, -2, -4};
        int count_appple =0;
        int count_orange = 0;
        int n;
        for(int i =0; i<apple.length; i++ ){
             n = apple[i] + 4;
             if(n >= 7 && n <= 10){
                 count_appple++;
             }
        }
        for(int i =0; i<orange.length; i++ ){
            n = orange[i] + 12;
            if(n >= 7 && n <= 10){
                count_orange++;
            }
        }
        System.out.println(count_appple);
        System.out.println(count_orange);


    }
}
