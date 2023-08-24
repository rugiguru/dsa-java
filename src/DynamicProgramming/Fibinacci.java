package DynamicProgramming;

public class Fibinacci {

    // recursive approach O(2^N), O(N)
    public static int recursiveFib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return recursiveFib(n - 2) + recursiveFib(n - 1);
    }

    // dynamic programming top down approach approach O(N), O(N)
    public static int topDownDpFib(int n, int[] dp) {
        if (n == 0 || n == 1) {
            return n;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        return dp[n] = topDownDpFib(n - 2, dp) + topDownDpFib(n - 1, dp);
    }

    // dynamic programming bottom up approach(iterative) O(N), O(1)
    public static int bottomUpDpFib(int n) {

        if (n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }

    public static void main(String[] args) {
        // System.out.println("Recursive " + recursiveFib(6));

        // int n = 6;
        // int dp[] = new int[n+1];
        // System.out.println(topDownDpFib(n, dp));

        System.out.println(bottomUpDpFib(3));

    }

}
