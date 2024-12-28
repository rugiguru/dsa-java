package patterns.twoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSumSoln {

    public List<List<Integer>> threeSumBetter(int[] nums) {

        int n = nums.length;
        HashSet<List<Integer>> temp = new HashSet<>();
        for(int i = 0; i < n; i++){
            HashSet<Integer> lookup = new HashSet<>();
            for(int j = i+1; j < n; j++) {

                int first = nums[i];
                int second = nums[j];
                int third = -(first + second);

                if(lookup.contains(third)){
                    List<Integer> tempList = new ArrayList<>();
                    tempList.add(first);
                    tempList.add(second);
                    tempList.add(third);
                    tempList.sort(null);
                    temp.add(tempList);
                }

                lookup.add(second);

            }
        }
        List<List<Integer>> ans = new ArrayList<>(temp);
        return ans;
    }

    public List<List<Integer>> threeSumOptimal(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int j = i+1;
            int k = n-1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];

                if(sum < 0){
                    j++;

                } else if (sum > 0){
                    k--;

                } else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    result.add(temp);
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1]) j++;
                    while(j<k && nums[k] == nums[k+1]) k--;
                }
            }
        }
        return result;
    }
}
