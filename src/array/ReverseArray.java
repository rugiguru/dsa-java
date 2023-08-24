package array;


public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        reverseArray(arr);

        for(int i: arr){
            System.out.print(i);
        }
        System.out.println();
    }

    private static void reverseArray(int[] arr) {

        int start = 0;
        int end = arr.length -1;

        while(start < end){
            swap(start, end, arr);
            start++;
            end--;
        }
    }

    private static void swap(int start, int end, int[] arr) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}