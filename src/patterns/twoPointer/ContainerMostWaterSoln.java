package patterns.twoPointer;

public class ContainerMostWaterSoln {

    public int maxArea(int[] height) {

        int res = Integer.MIN_VALUE;
        int n = height.length;
        int i =0, j = n-1;

        while(i < j){
            int water = (j-i) * Math.min(height[i], height[j]);
            res = Math.max(res, water);
            if(height[i] < height[j]){
                i++;
            } else {
                j--;
            }
        }
        return res;
    }
}
