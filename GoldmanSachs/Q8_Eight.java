// https://practice.geeksforgeeks.org/problems/total-decoding-messages1235/1/#

import java.util.*;
import java.io.*;

class Q8_Eight
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ans = CountWays(str);
        System.out.println(ans);
    }

    static public int CountWays(String str)
    {
        int n=str.length();
        int dp[] = new int[n+1];
        int mod = 1000000007;
        dp[0]=1;
        dp[1]=1;
       
        if(n==1 && str.charAt(0)!='0')
            return 1;
        if(str.charAt(0)=='0')
            return 0;
        
        for(int i=2;i<=n;i++)
        {
            dp[i]=0;
            
            if(str.charAt(i-1)>'0')
                dp[i] = dp[i-1];
            
            if(str.charAt(i-2)=='1' || str.charAt(i-2)=='2' && str.charAt(i-1)<'7')
                dp[i] = (dp[i]+dp[i-2])%mod;
        }
        return dp[n];
    }
}