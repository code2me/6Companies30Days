
// https://practice.geeksforgeeks.org/problems/number-following-a-pattern3126/1

import java.util.*;

class Q9_Nineth {

	public static String findMinNumberPattern(String str)
	{
		String ans = ""; 

		int i = 0;
		int cur = 1;
		int dCount = 0; 
		while (i < str.length()) {

			char ch = str.charAt(i);

			if (i == 0 && ch == 'I') {
				ans += cur;
				cur++;
			}

			if (ch == 'D') {
				dCount++;
			}

			int j = i + 1; 
			while (j < str.length()
				&& str.charAt(j) == 'D') {
				dCount++;
				j++;
			}

			int k = dCount; 
			while (dCount >= 0) {
				ans += (cur + dCount);
				dCount--;
			}

			cur += (k + 1); 
			dCount = 0;
			i = j;
		}

		return ans;
	}
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
		System.out.println(findMinNumberPattern(s));
        
	}
}
