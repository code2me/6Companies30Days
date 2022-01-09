// https://practice.geeksforgeeks.org/problems/maximum-profit4657/1

import java.util.*;
import java.io.*;

class Q1_First {
    public static void main(String args[]) throws IOException {
        BufferedReader in =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            int K = Integer.parseInt(in.readLine());
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int A[] = new int[N];
            for (int i = 0; i < N; i++) A[i] = Integer.parseInt(input_line[i]);

            Solution ob = new Solution();
            System.out.println(ob.maxProfit(K, N, A));
        }
    }
}

// time: O(N * K), Space: O(N * K)
// class Solution {
//     static int maxProfit(int K, int N, int A[]) {
//         if (N == 0) return 0;
//         int dp[][] = new int[K+1][N];
//         int maxProfit = Integer.MIN_VALUE;
//         for(int i = 1; i <= K; i++) {
//             for(int j = 1; j < N; j++) {
//                 maxProfit = Math.max(maxProfit, dp[i-1][j-1] - A[j-1]);
//                 dp[i][j] = Math.max(dp[i][j-1], maxProfit + A[j]);
//             }
//         }
//         for(int i = 0; i <= K; i++){
//             for(int j = 0; j < N; j++){
//                 System.out.print(dp[i][j] + " ");
//             }
//             System.out.println();
//         }
//         return dp[K][N-1];
//     }
// }


// time: O(N * K), Space: O(4 * N)
class Solution {
    static int maxProfit(int K, int N, int A[]) {
        if (N == 0) return 0;
        int evenProfits[] = new int[N];
        int oddProfits[] = new int[N];
        int currProfit[] = new int[N];
        int prevProfit[] = new int[N];
        int k = 0;
        for(int i = 1; i <= K; i++) {
            int maxProfit = Integer.MIN_VALUE;
            if(i%2==1) {
                currProfit = oddProfits;
                prevProfit = evenProfits;
            } else {
                currProfit = evenProfits;
                prevProfit = oddProfits;
            }
            k++;
            for(int j = 1; j < N; j++) {
                maxProfit = Math.max(maxProfit, prevProfit[j-1] - A[j-1]);
                currProfit[j] = Math.max(currProfit[j-1], maxProfit + A[j]);
            }
        } 
        return (k%2==1) ? oddProfits[N-1] : evenProfits[N-1];
    }
}