//https://www.geeksforgeeks.org/distributing-m-items-circle-size-n-starting-k-th-position/

import java.util.*;

class Q6_GcdOfString {

    static int M_Items_N_Circle(int n, int m, int k)
    {
        if (m <= n - k + 1) return m + k - 1;
        m = m - (n - k + 1);
        return (m % n == 0) ? n : (m % n);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(M_Items_N_Circle(n, m, k));
    }
}