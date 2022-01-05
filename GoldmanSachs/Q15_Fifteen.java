// https://practice.geeksforgeeks.org/problems/array-pair-sum-divisibility-problem3257/1

import java.util.*;

public class Q15_Fifteen
{
	static boolean canPairs(int arr[], int d)
    {
        if (arr.length % 2 == 1) return false;

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int rem = ((arr[i] % d) + d) % d;
            if (!hm.containsKey(rem)) {
                hm.put(rem, 0);
            }
            hm.put(rem, hm.get(rem) + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            int rem = ((arr[i] % d) + d) % d;
            if (2 * rem == d) {
                if (hm.get(rem) % 2 == 1)
                    return false;
            }
            else if (rem == 0) {
                if (hm.get(rem) % 2 == 1)
                    return false;
            }
            else {
                if (hm.get(d - rem) != hm.get(rem))
                    return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //array size
        int n = sc.nextInt();
        int arr[] = new int[n];

        //divisor
		int d = sc.nextInt();

        //array elements
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

		System.out.print(canPairs(arr, d));
	}
}
