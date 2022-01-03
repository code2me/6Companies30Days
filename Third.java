// https://practice.geeksforgeeks.org/problems/count-the-subarrays-having-product-less-than-k1708/1/#

import java.util.*;
import java.lang.*;
import java.io.*;


class Third {
	public static void main(String[] args) throws IOException
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            long n = Long.parseLong(stt.nextToken());
            long k = Long.parseLong(stt.nextToken());
            
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.countSubArrayProductLessThanK(a, n, k));
            
        }
	}
}



class Solution {
    
    public int countSubArrayProductLessThanK(long a[], long n, long k)
    {
        long prod = 1;  
        int j = 0, i = 0, ans = 0;
        while(j < n) {
            prod *= a[j];
            while(prod >= k)
                prod /= a[i++];
            ans += j - i + 1;
            j++;
        }
        return ans;
    }
}