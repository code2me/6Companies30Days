// https://practice.geeksforgeeks.org/problems/print-anagrams-together/1/


import java.io.*;
import java.util.*;

class Q1_First {

    static public List<List<String>> Anagrams(String[] string_list) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String , ArrayList<String>> map = new HashMap<>();

        for(String s : string_list){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sorted_string = new String(c);

            if(map.containsKey(sorted_string)){
                ArrayList<String> prevList = map.get(sorted_string);
                prevList.add(s);
                map.put(sorted_string,prevList);
            }
            else{
                ArrayList<String> newList = new ArrayList();
                newList.add(s);
                map.put(sorted_string, newList);
            }
        }
        
        
        for(String s : map.keySet()){
            ans.add(new ArrayList(map.get(s)));
        }
        
        return ans;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        String string_list[] = new String[n];

        for(int i = 0; i < n; i++) 
            string_list[i] = sc.next();
        
        List <List<String>> ans = Anagrams(string_list);
        
        for(int i=0;i<ans.size();i++)
        {
            for(int j=0;j<ans.get(i).size();j++)
            {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }
	}
}