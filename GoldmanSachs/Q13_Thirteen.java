// https://practice.geeksforgeeks.org/problems/decode-the-string2444/1

import java.util.*;

public class Q13_Thirteen
{
	static String decodeString(String s)
	{
		Stack<Character> st = new Stack<Character>();
		
		for(int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) == ']')
			{
				String temp = "";
				while (!st.isEmpty() && st.get(st.size() - 1) != '[')
				{
					temp = st.get(st.size() - 1) + temp;
					st.remove(st.size() - 1);
				}
				
				st.remove(st.size() - 1);
				String num = "";
				

				while (!st.isEmpty() && st.get(st.size() - 1) >= 48 && st.get(st.size() - 1) <= 57)
				{
					num = st.get(st.size() - 1) + num;
					st.remove(st.size() - 1);
				}
				
				int number = Integer.parseInt(num);
				String repeat = "";
				for(int j = 0; j < number; j++)
					repeat += temp;
					
				for(int c = 0; c < repeat.length(); c++)
					st.add(repeat.charAt(c));
			} else {
                st.add(s.charAt(i));
            }
		}

		String res = "";
        
		while (st.size() > 0)
		{
			res = st.get(st.size() - 1) + res;
			st.remove(st.size() - 1);
		}
		return res;
	}

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(decodeString(str));
	}
}
