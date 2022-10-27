package bInarySearch1;

public class smallestLatterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letter = {'c', 'f', 'j', 'k'};
        char target = 'a';
        char ans = nextGreateletter(letter , target);
        System.out.println(ans);


    }


public static char nextGreateletter(char [] letters , char target){
            int start =0;
            int end  = letters.length-1;


            while (start <= end){
                int mid  = start + (end -start)/ 2;
                if(target < letters[mid]){
                    start = mid-1;
                }
                else {
                    start = mid + 1;
                }


            }
            return letters[start % letters.length];

        }

}
