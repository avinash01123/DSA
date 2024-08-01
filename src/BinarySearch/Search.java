package BinarySearch;

import java.util.Arrays;  // Import this to use Arrays.sort()

public class Search {
    public static void main(String[] args) {
        int[] arr = {1, 2, 33, 44, 22, 11, 43, 24};
        int target = 24;

        // Sort the array first
        Arrays.sort(arr);
        System.out.println();

        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // Find the middle element
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;  // Target not found
    }
}
