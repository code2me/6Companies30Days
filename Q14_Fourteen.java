// https://leetcode.com/problems/minimum-size-subarray-sum/

import java.util.*;

public class Q14_Fourteen
{
	static int minSubArrayLen(int s, int[] A) {
        int i = 0, n = A.length, res = n + 1;
        for (int j = 0; j < n; ++j) {
            s -= A[j];
            while (s <= 0) {
                res = Math.min(res, j - i + 1);
                s += A[i++];
            }
        }
        return res % (n + 1);
    }

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //target
		int target = sc.nextInt();

        //array size
        int n = sc.nextInt();
        int arr[] = new int[n];

        //array elements
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

		System.out.print(minSubArrayLen(target, arr));
	}
}
