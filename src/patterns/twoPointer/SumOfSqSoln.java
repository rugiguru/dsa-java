package patterns.twoPointer;

public class SumOfSqSoln {

    public boolean judgeSquareSum(int c) {
        long low = 0;
        long high = (long) Math.sqrt(c);

        while (low <= high){
            long current = low*low + high*high;

            if(current < c){
                low++;
            }
            else if(current > c){
                high--;
            } else {
                return true;
            }
        }
        return false;
    }
}
