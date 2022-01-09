// https://leetcode.com/problems/longest-mountain-in-array/

import java.util.*;
import java.io.*;

class Q2_First {
    public static void main(String args[]) throws IOException {
        BufferedReader in =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int A[] = new int[N];
            for (int i = 0; i < N; i++) A[i] = Integer.parseInt(input_line[i]);

            Solution ob = new Solution();
            System.out.println(ob.longestMountain(A));
        }
    }
}

class Solution {
    public int longestMountain(int[] A) {
        int ans = 0, left = 0, right = 0;
        for (int i = 1; i < A.length; ++i) {
            if (right > 0 && A[i - 1] < A[i] || A[i - 1] == A[i]) left = right = 0;
            if (A[i - 1] < A[i]) left++;
            if (A[i - 1] > A[i]) right++;
            if (left > 0 && right > 0 && left + right + 1 > ans) ans = left + right + 1;
        }
        return ans;
    }
}