package Sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,4,1,2,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int[] arr){
//        run the step n-1 times;
        for (int i= 0; i< arr.length; i++){
//            for each step , max item will come at the last respective index
            for (int j = 1; j < arr.length -i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]= temp;
                }
            }

        }
    }
}
