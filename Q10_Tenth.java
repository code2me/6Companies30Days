// https://practice.geeksforgeeks.org/problems/array-pair-sum-divisibility-problem3257/1

import java.util.*;

public class Q10_Tenth {

	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
		int[] arr = new int[max];

        for(int i = 0; i < max; i++) {
            arr[i] = sc.nextInt();
        }

		Map<Integer, Boolean> numberMap = new HashMap<>();

		for (Integer i : arr) {

			if (numberMap.get(i) == null) {
				numberMap.put(i, true);
			}
			else {
				System.out.print(i+" ");
			}
		}
		for (int i = 1; i <= max; i++) {
			if (numberMap.get(i) == null) {
				System.out.print(i);
			}
		}
	}
}
