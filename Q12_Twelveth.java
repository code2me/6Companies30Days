// Find total number of Squares in a N*N chessboard

import java.util.*;

class Q12_Twelveth
{
	static long countSquares(long n)
	{
		return (n * (n + 1) * (2 * n + 1) ) / 6;
	}

	public static void main (String[] args)
	{
        Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		System.out.println(countSquares(n));
	}
}
