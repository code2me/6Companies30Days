// https://practice.geeksforgeeks.org/problems/ugly-numbers2254/1/#
import java.io.*;
import java.util.*;

class Q5_Fifth {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            System.out.println(new Solution().getNthUglyNo(n));
        }
    }
}


class Solution {
        long getNthUglyNo(int n) {
        long dp[]=new long[n+1];
        dp[1]=1;
        int i=1, j=1, k=1;
        for(int i=2;i<=n;i++)
        {
            long a=dp[i]*2;
            long b=dp[j]*3;
            long c=dp[k]*5;
            long min=Math.min(a,Math.min(b,c));
            dp[i]=min;
            if(min==a) i++;
            if(min==b) j++;
            if(min==c) k++;
        }
        return dp[n];
    }
}