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

public class MergeIntervalArray {

    public static int[][] merge(int[][] intervals) {

        // First, sort the intervals based on their start time
        // The one with smaller start time comes first (ascending)
        Arrays.sort(intervals, (a,b) -> (a[0] - b[0]));
        
        ArrayList<int []> result = new ArrayList<>();
        // Now we have a sorted interval list, so go through all of them and combine
        for (int i = 0; i < intervals.length; i++) {
            // Make sure we have at least one event in result to be compared with
            if (i == 0) {
                result.add(intervals[0]); 
                continue;
            }
            
            int[] prev = result.get(result.size()-1);
            int[] curr = intervals[i];
            
            // intervals overlap when:
            // prev ends after/when curr starts
            if (prev[1] >= curr[0]) {
                // The new interval should cover both events
                // So it has an smallest start time and largest end time
                // Since it's the interval in result that overlaps with our new
                // interval, we just modify that interval in result
                // (it's guarantee that start time of prev is smaller or equal
                // to that of curr since we traverse a sorted array)
                prev[1] = Math.max(prev[1], curr[1]);
            } else {
                result.add(curr);
            }
        }
        return result.toArray(new int[result.size()][2]);
    }

    public static void printASrrayList(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;

        for(int i = 0; i < n; i ++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = new int[5][5];
        arr[0][0] = 1;
        arr[0][1] = 3;

        arr[1][0] = 2;
        arr[1][1] = 6;

        arr[2][0] = 8;
        arr[2][1] = 10;

        arr[2][0] = 15;
        arr[2][1] = 18;

        MergeIntervalArray.merge(arr);
        printASrrayList(arr);

    }
    
}
