// Given an array of intervals where intervals[i] = [starti, endi], 
// merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.
// Example 1:

// Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
// Output: [[1,6],[8,10],[15,18]]
// Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].

// Example 2:
// Input: intervals = [[1,4],[4,5]]
// Output: [[1,5]]
// Explanation: Intervals [1,4] and [4,5] are considered overlapping.

package array;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeInterval {


    public static void printASrrayList(ArrayList<ArrayList<Integer> > arr){
        int n = arr.size();
        int m = arr.get(0).size();

        for(int i = 0; i < n; i ++){
            for(int j = 0; j < m; j++){
                System.out.print(arr.get(i).get(j) + ", ");
            }
            System.out.println();
        }
    }

    public static void bruteForceSolution(ArrayList<ArrayList<Integer> > arr){

    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer> > arr = new ArrayList< ArrayList<Integer>>();

        arr.add(new ArrayList<Integer>((Arrays.asList(1, 3))));
        arr.add(new ArrayList<Integer>((Arrays.asList(2,6))));
        arr.add(new ArrayList<Integer>((Arrays.asList(8,10))));
        arr.add(new ArrayList<Integer>((Arrays.asList(15, 18))));
        printASrrayList(arr);
    }

    
}