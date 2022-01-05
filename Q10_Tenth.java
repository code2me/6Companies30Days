// Find max 10 numbers in a list having 10M entries.

import java.util.*;

class Q10_Tenth
{
	public static void main (String[] args)
	{
        Scanner sc = new Scanner(System.in);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < 10000000; i++) {
            pq.add(sc.nextInt());
        }

        for(int i = 0; i < 10; i++) {
            System.out.print(pq.poll() + " ");
        }
	}
}
