package DynamicProgramming;

import java.util.Scanner;

public class NKLadder {

    // O(NxK) but for recursive approach it would have been O(k^n)
    public static int topDownHelper(int n, int k, int dp[]){
        if(n==0){
            return 1;
        }
        if(n < 0){
            return 0;
        }

        if(dp[n] != 0){
            return dp[n];
        }
        // return dp[n] = topDownHelper(n-1, k, dp) + topDownHelper(n-2, k, dp) + topDownHelper(n-3, k, dp); 
        // this is the wrong approach as this does if k =3, we have to generalise the solution hence we write a loop for that
        int ans  = 0;
        for(int jump = 1; jump <=k; jump++){
            ans += topDownHelper(n-jump, k, dp);
        }
        return ans;
    }

    public static int topDownDpNKLadder(int n, int k){
        int dp[] = new int[n+1];
        return topDownHelper(n, k, dp);
    }

    public static int bottomUpDp(int n, int k){
        int dp[] = new int[n+1];
        dp[0] = 1;
    
        for(int i = 1; i <=n; i++){
            for(int jump=1; jump<=k; jump++){
                if(i-jump>=0){
                    dp[i] +=dp[i-jump];
                }
            }
        }
        return dp[n];
    }

    public static int bottomUpOpt(int n, int k){
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i =2; i <=k; i++){
            dp[i] = 2*dp[i-1];
        }

        for(int i = k+1; i <=n; i++){
            dp[i] = 2*dp[i-1] - dp[i-k-1];
        }

        return dp[n];

    }

    public int climbStairs(int n) {
        int back = 0;
        int sum = 1;
        for(int i=0; i<n; i++){
            int temp = sum; 
            sum = sum + back; 
            back = temp; 
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        scan.close();

        System.out.println(bottomUpOpt(n, k));
    }
}
