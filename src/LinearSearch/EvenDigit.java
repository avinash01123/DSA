package LinearSearch;

public class EvenDigit {
    public static void main(String[] args) {
       int[] nums = {18, 128,9,176,98,7};
       int ans = findNumber(nums);
        System.out.println(ans);
    }
    static int findNumber(int[]  nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }


        return count;

    }

//    function to check whether number contain even digits or not
     static boolean even(int num ) {
        int numberOfDigits = digits(num);
        if(numberOfDigits % 2 == 0){
            return true;
        }
        return false;


    }

//    count a number of digits in a number
    static int digits(int num){
//        for negative numbers
        if(num < 0){
            num = num * -1;
        }
        if (num == 0 ){
            return 1;
        }
        int count = 0;
        while (num> 0){
            count++;
            num = num / 10;
        }
        return  count;

    }
}
