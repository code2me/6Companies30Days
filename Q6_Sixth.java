// https://leetcode.com/problems/greatest-common-divisor-of-strings/

import java.util.*;

class Q6_Sixth {

    static public String gcdOfStrings(String str1, String str2) {
        if (str2.length() > str1.length()) return gcdOfStrings(str2, str1);
        if (str2.isEmpty()) return str1;
        if (str1.startsWith(str2)) {
            if (str1.isEmpty()) return str2;
            return gcdOfStrings(str1.substring(str2.length()), str2);
        }
        return "";
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        System.out.println(gcdOfStrings(s1, s2));
    }
}