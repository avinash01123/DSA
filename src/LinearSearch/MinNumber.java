package LinearSearch;

import com.sun.source.tree.BreakTree;

public class MinNumber {
    public static void main(String[] args) {
        int arr[] = {18, 12 -7 , 5 ,3 };
        System.out.println(min(arr));

    }
    // if arr is not empty
    static int min (int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }


}
