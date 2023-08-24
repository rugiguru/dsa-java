package array;

public class BinarySearch {
    
    public static void main(String[] args) {
        int[] arr = { 1,3,5,22,24,56};
        int key = 1;
        System.out.println(binarySearch(arr, key)); 
    }

    private static int binarySearch(int[] arr, int key) {

        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == key){
                return mid;
            }

            if(arr[mid] < key){
                start = mid +1;
            } else {
                end = mid -1;
            }
        }

        return -1;

    }
}
