package BinarySearch;

import java.util.Arrays;

public class OrderAgnosticSearch {
    public static void main(String[] args) {
        int[] arr = {24, 12,11,9,5,3,2,1};
        int target = 3;


        int ans = orderSearch(arr, target);
        System.out.println(ans);

    }
    static int orderSearch(int[] arr, int target){
        int start =0;
        int end = arr.length -1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end ){
            int mid = start + (end - start )/ 2;
            if (arr[mid ]== target) {
                return mid;

            }
            if(isAsc){
                if (target < arr[mid]){
                    end = mid -1;
                }
                else if (target > arr[mid]) {
                    start = start+1;
                }

            }
            else {

                if (target >  arr[mid]){
                    end = mid -1;
                }
                else if (target < arr[mid]) {
                    start = start+1;
                }

            }

        }
        return -1;
    }

}
