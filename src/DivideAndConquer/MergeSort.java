package DivideAndConquer;

import java.util.ArrayList;

// import java.util.ArrayList;

public class MergeSort {

    public static void merge(int[] arr, int start, int end){

        int i = start;
        int m = (start+end)/2;
        int j = m +1;

        ArrayList<Integer> temp = new ArrayList<>();

        while(i <=m && j <=end ){

            if(arr[i] < arr[j]){
                temp.add(arr[i]);
                i++;
            } else {
                temp.add(arr[j]);
                j++;
            }

        }

        while(i<=m){
            temp.add(arr[i]);
            i++;
        }

        while(j <=end){
            temp.add(arr[j]);
            j++;
        }

        int k = 0;
        for(int index = start; index <= end; index++){
            arr[index] = temp.get(k);
            k++;
        }
        return;
    }

    public static void mergeSort(int[] arr, int start, int end){

        if(start >=end){
            return;
        }

        int mid  = (start+end)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, end);
    }

    public static void main(String[] args){

        int[] arr  = new int[]{10, 5, 2 , 6, -10, 7};
        int start = 0;
        int end = arr.length -1;
        mergeSort(arr, start, end);
        for(int i : arr){
            System.out.print(i+", ");
        }

    }
    
}
