public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,77,65,33};
        int target = 5;
        int ans = linearSearch(arr, target);

        System.out.println(ans);
    }
// search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int i=0; i<=arr.length; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }



        }
        return -1;
    }



}























