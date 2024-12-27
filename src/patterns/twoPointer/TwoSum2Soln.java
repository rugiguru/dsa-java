package patterns.twoPointer;

import java.util.Arrays;

public class TwoSum2Soln {

    public int[] twoSum(int[] nums, int target) {
            Arrays.sort(nums);

            int n = nums.length;
            int l = 0;
            int r = n-1;
            int[] result = new int[2];

            while(l < r){
                int currSum = nums[l] + nums[r];
                if(currSum == target){
                    result[0] = l+1;
                    result[1] = r+1;
                    break;
                } else if (currSum < target) {
                    l++;
                } else {
                    r--;
                }
            }
            return result;
    }

    public static void main(String[] args) {
        int[] input = new int[]{3,4,2};

        TwoSum2Soln twoSumSoln = new TwoSum2Soln();
        int[] ints = twoSumSoln.twoSum(input, 5);
        System.out.println("ints "+ Arrays.toString( ints));
    }

}
