// Find max 10 numbers in a list having 10M entries.

import java.util.*;

class Q10_Tenth
{
	public static void main (String[] args)
	{
        Scanner sc = new Scanner(System.in);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < 10; i++) {
            pq.add(sc.nextInt());
        }

        for(int i = 10; i < 100; i++) {
            pq.add(sc.nextInt());
            pq.poll();
        }

        Iterator itr = pq.iterator();
        while (itr.hasNext())
            System.out.print(itr.next() + " ");
	}
}
